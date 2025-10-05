package de.hska.iwi.ads.solution.hashtable;

import de.hska.iwi.ads.dictionary.AbstractHashMap;

@SuppressWarnings("unchecked")
public class HashTable<K extends Comparable <K>,V> extends AbstractHashMap<K, V>{

 public HashTable(int capacity) {
  super(capacity);
 }
 
 private int hash(K key, int index) {
    int hashCode = key.hashCode();
    int hash = hashCode % this.hashtable.length + (index * index) % this.hashtable.length;

    return hash;

 }

 public V put(K key, V value) {

  for(int i = 0; i < hashtable.length; i++) {
   int index = hash(key, i);
   if(hashtable[index] == null) {
    hashtable[index] = new SimpleEntry<>(key, value);
    this.size++;
    return null;
   }
   if(hashtable[index].getKey() == key) {
    V oldValue = hashtable[index].getValue();
    hashtable[index].setValue(value);
    return oldValue;
   }
  }

 throw new DictionaryFullException();
 }

 public V get(Object o) {
  K key = (K)o;
  int i = 0;
  int j;

  do {
    j = hash(key, i);
    if(hashtable[j] != null && hashtable[j].getKey() == key) {
        return hashtable[j].getValue();
    }
    i++;
  } 
  while(hashtable[j] != null && i < hashtable.length);
  return null;
 }
/* 
 public static void main(String[] args) {
  Object res;

  HashTable hashtable = new HashTable<>(50);
     hashtable.put(6, "Sechs");
     hashtable.put(3, "Drei");
     hashtable.put(1, "Eins");
     hashtable.put(7, "Sieben");
     hashtable.put(8, "Acht");
     hashtable.put(4, "Vier");
     hashtable.put(2, "Zwei");

     System.out.println(hashtable.size());

     for(int i = 1; i < 9; i++) {
      if(i == 5) {
       continue;
      }
      res = hashtable.get(i);
      System.out.println(res);
     }
 }*/
}


