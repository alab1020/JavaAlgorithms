package de.hska.iwi.ads.solution.sorting;

import de.hska.iwi.ads.sorting.AbstractMergesort;

public class ReverseMergesort<E extends Comparable<E>> extends AbstractMergesort<E>{
 
 @Override
 protected void mergesort(E [] a, int left, int right) {
  int m;
  
  if(left < right) {
   m = (left + right) / 2;
   mergesort(a, left, m);
   mergesort(a, m + 1, right);
   merge(a, left, m, right);
  }
 }

 @Override
 public void sort(E [] a) {
  
  super.sort(a);
 }

 ReverseArray<E> reverse = new ReverseArray<>();

 protected void merge(E [] a,  int left, int m, int right) {

  int l = left;
  int r = right;

  reverse.reverse(a, m + 1, r);

  for(int i = left; i <= right; i++){ 
   if(a[l].compareTo(a[r]) <= 0) {
 
    b[i] = a[l];
    l = l + 1;
   }
   else {
    b[i] = a[r];
    r = r - 1;
   }
  }
  for(int i = left; i <= right; i++) {
   a[i] = b[i];
  }
 }
}


