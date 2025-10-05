 package de.hska.iwi.ads.solution.list;

import de.hska.iwi.ads.dictionary.AbstractDoubleLinkedList;

@SuppressWarnings("unchecked")
public class DoubleLinkedList<K extends Comparable<K>, V> extends AbstractDoubleLinkedList<K, V>{
 
 public V get(Object o) {

  K key = (K) o;

  ListElement result = search(key);

  if(result == null) {
    return null;
  }
  else {
    return result.entry.getValue();
  }
 }

 public V put(K key, V value) {
  Entry<K,V> entry = new SimpleEntry<>(key, value);
  ListElement newElement = new ListElement(entry, null, head);
  ListElement existingElement = search(key);

  if(existingElement != null) {
    V oldValue = existingElement.entry.getValue();
    existingElement.entry.setValue(value);
    return oldValue;
  }
  else {
    if(head != null) {
      head.previous = newElement;
    }
    head = newElement;
    this.size++;
    return null;
  }
 }

 private ListElement search(K key) {
  if(key == null) {
    throw new NullPointerException("Key cannot be null!");
  }
  ListElement current = head;
  while(current != null && current.entry.getKey() != key) {
    current = current.next;
  }
  return current;
 }
/* 
 public static void main(String[] args) {
  DoubleLinkedList<Integer, String> Test = new DoubleLinkedList<>();

  Test.put(6, "Sechs");
  Test.put(3, "Drei");
  Test.put(1, "Eins");
  Test.put(7, "Sieben");
  Test.put(8, "Acht");
  Test.put(4, "Vier");
  Test.put(2, "Zwei");
 }*/
}
