package de.hska.iwi.ads.solution.search;

import de.hska.iwi.ads.search.Search;

public class BinarySearch<E extends Comparable<E>> implements Search<E>{

 @Override
 public int search(E[] a, E key, int left, int right) {
  
    if(a.length == 0) {
      return -1;
    }
    else if(key.compareTo(a[left]) < 0) {
      return left - 1;
    }
    else if(key.compareTo(a[right]) > 0) {
      return right + 1;
    }
    return binarySearch(a, key, left, right);
  }

  private int binarySearch(E[] a, E key, int left, int right) {
    if(left > right) {
      return left;
    }
    else {
      int m = (left + right) / 2;
      if(key.compareTo(a[m]) == 0) {
        return this.binarySearch(a, key, left, m - 1);
      }
      else if(key.compareTo(a[m]) < 0) {
        return this.binarySearch(a, key, left, m - 1);
      }
      else {
        return this.binarySearch(a, key, m + 1, right);
      }
    }
  }
}


