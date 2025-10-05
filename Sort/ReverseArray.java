package de.hska.iwi.ads.solution.sorting;

import de.hska.iwi.ads.sorting.Reverse;

public class ReverseArray<E extends Comparable<E>> implements Reverse<E>{

 @Override
 public void reverse(E[] a, int from, int to) {

if(a.length<= 1) {
    return;
}
  
  E temp;
  int k = to;
  int mitte = (from + to) / 2;
   for(int i = from; i <= mitte; i++) {
    temp = a[i];
    a[i] = a[k];
    a[k] = temp;
    k--;
   }
 }

 public static void main(String[] args) {
  ReverseArray<Integer> rva = new ReverseArray<>();
  Integer [] arr = {5, 3, 6, 8, 11, 19, 13, 21};
  rva.reverse(arr, 1, 6);
 }
}
