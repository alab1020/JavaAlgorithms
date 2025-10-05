package de.hska.iwi.ads.solution.search;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import de.hska.iwi.ads.search.Search;
import de.hska.iwi.ads.search.SearchTest;

public class BinarySearchTest extends SearchTest {
 
 @Override
 public <E extends Comparable<E>> Search<E> createSearch() {
  
  return new BinarySearch<>();
 }

 @Test
 public void searchOptimalArray() {
  BinarySearch<Integer> bsearch = new BinarySearch<>();
  Integer [] a = {0, 2, 4, 7, 9, 10 ,11};
  assertEquals(5, bsearch.search(a, 10));
 }

 @Test
 public void searchNotOptimalArray() {
  BinarySearch<Integer> bsearch = new BinarySearch<>();
  Integer [] a = {0, 2, 4, 7, 9, 10, 11};
  assertEquals(5, bsearch.search(a, 10));
 }

 @Test
 public void searchKeyNotContainedArray() {
    BinarySearch<Integer> bsearch = new BinarySearch<>();
    Integer [] a = {0, 2, 4, 7, 9, 10, 11};
    assertEquals(3, bsearch.search(a, 6));
 }

 @Test
 public void searchKeyNotContainedArray1() {
    BinarySearch<Integer> bsearch = new BinarySearch<>();
    Integer [] a = {0, 2, 4, 5, 8, 9, 10, 11};
    assertEquals(8, bsearch.search(a, 12));
 }

 @Test
 public void searchKeyNotContainedArray2() {
    BinarySearch<Integer> bsearch = new BinarySearch<>();
    Integer [] a = {2, 4, 7, 9, 11, 22};
    assertEquals(-1, bsearch.search(a, 0));
 }

 @Test
 public void searchDupeArray() {
    BinarySearch<Integer> bsearch = new BinarySearch<>();
    Integer [] a = {0, 1, 2, 3, 4, 5, 5, 5, 6};
    assertEquals(5, bsearch.search(a, 5));
 }

 @Test
 public void searchEmptyArray() {
    BinarySearch<Integer> bsearch = new BinarySearch<>();
    Integer [] a = {};
    assertEquals(-1, bsearch.search(a, 2));
 }

 @Test
 public void searchDifferentStartEndArray() {
   BinarySearch<Integer> bsearch = new BinarySearch<>();
   Integer [] a = {0, 2, 4, 7, 9, 10, 11};
   assertEquals(5, bsearch.search(a, 10, 2, 5));
 }

 @Test
 public void searchDoubleArray() {
    BinarySearch<Double> bsearch = new BinarySearch<>();
    Double [] a = {0.0, 1.2, 3.7, 4.3, 5.0};
    assertEquals(3, bsearch.search(a, 4.3));
 }

 @Test
 public void searchStringCharArray() {
   BinarySearch<String> bsearch = new BinarySearch<>();
   String [] a = {"a", "b", "c", "d", "e", "f", "g"};
   assertEquals(1, bsearch.search(a, "b"));
 }

 @Test
 public void searchStringArray() {
   BinarySearch<String> bsearch = new BinarySearch<>();
   String [] a = {"a", "black", "car", "moving", "over", "public", "roads", "to", "utah"};
   assertEquals(4, bsearch.search(a, "over"));
 }

 @Test
 public void searchStringArray1() {
   BinarySearch<String> bsearch = new BinarySearch<>();
   String [] a = {"a", "black", "car", "moving", "over", "public", "roads", "to", "utah"};
   assertEquals(3, bsearch.search(a, "m"));
 }
}

 
