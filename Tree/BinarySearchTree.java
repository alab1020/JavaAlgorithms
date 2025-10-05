package de.hska.iwi.ads.solution.tree;

import de.hska.iwi.ads.dictionary.AbstractBinaryTree;
@SuppressWarnings("unchecked")
public class BinarySearchTree<K extends Comparable<K>,V> extends AbstractBinaryTree<K,V> {
 /* 
 private K castKey(Object o) {
  try {
   return (K) o;
  }
  catch(ClassCastException e) {
   throw new IllegalArgumentException("Invalid key type!");
  }
 }*/

 public V put(K key, V value) {
  if(root == null) {
   root = new Node(key, value);
   size++;
   return null;
  }
  else {
   return putRecursive(root, key, value);
  }
 }

 private V putRecursive(Node node, K key, V value) {
  int cmp = key.compareTo(node.entry.getKey());
  if(cmp < 0) {
   if(node.left == null) {
    node.left = new Node(key, value);
    size++;
    return null;
   }
   else {
    return putRecursive(node.left, key, value);
   }
  }

  else if(cmp > 0) {
   if(node.right == null) {
    node.right = new Node(key, value);
    size++;
    return null;
   } 
   else {
    return putRecursive(node.right, key, value);
   }
  }

  else {
   V oldValue = node.entry.getValue();
   node.entry.setValue(value);
   return oldValue;
  }
 }

 public V get(Object o) {
  if(root == null) {
   return null;
  }
  else {
   return getRecursive(root, o);
  }
 }

 private V getRecursive(Node node, Object o) {
  if(node == null) {
   return null;
  }

  K key = (K) o;
  int cmp = key.compareTo(node.entry.getKey());

  if(cmp < 0) {
   return getRecursive(node.left, key);
  }
  else if(cmp > 0) {
   return getRecursive(node.right, key);
  }
  else {
   return node.entry.getValue();
  }
 }

/* 
 public static void main(String[] args) {
  BinarySearchTree bst = new BinarySearchTree<>();

   bst.put(6, "Sechs");
   bst.put(3, "Drei");
   bst.put(1, "Eins");
   bst.put(7, "Sieben");
   bst.put(8, "Acht");
   bst.put(4, "Vier");
   bst.put(2, "Zwei");
 }*/
}
