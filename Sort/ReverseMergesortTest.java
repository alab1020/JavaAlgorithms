package de.hska.iwi.ads.solution.sorting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class ReverseMergesortTest {
    
@Test
public void sortedArray() {
    ReverseMergesort<Integer> mstest = new ReverseMergesort<>();
    Integer [] a = {1, 3, 5, 6, 8, 10, 22, 35};
    mstest.sort(a);
    assertArrayEquals(new Integer[] {1, 3, 5, 6, 8, 10, 22, 35}, a);
    }
    
@Test
public void reverseSortedArray() {
    ReverseMergesort<Integer> mstest = new ReverseMergesort<>();
    Integer [] a = {35, 22, 10, 8, 6, 5, 3, 1};
    mstest.sort(a);
    assertArrayEquals(new Integer[] {1, 3, 5, 6, 8, 10, 22, 35}, a);
    }
    
@Test
public void arrayContainingDupes() {
    ReverseMergesort<Integer> mstest = new ReverseMergesort<>();
    Integer [] a = {5, 3, 7, 9, 3, 2, 7};
    mstest.sort(a);
    assertArrayEquals(new Integer[] {2, 3, 3, 5, 7, 7, 9}, a);
    }
    
@Test
public void arrayWithTheSameElement() {
    ReverseMergesort<Integer> mstest = new ReverseMergesort<>();
    Integer [] a = {5, 5, 5, 5, 5, 5, 5};
    mstest.sort(a);
    assertArrayEquals(new Integer[] {5, 5, 5, 5, 5, 5, 5}, a);
    }
    
@Test
public void arrayContainingNegatives() {
    ReverseMergesort<Integer> mstest = new ReverseMergesort<>();
    Integer [] a = {5, -1, 6, -78, -3, 9, -3};
    mstest.sort(a);
    assertArrayEquals(new Integer[] {-78, -3, -3, -1, 5, 6, 9}, a);
    }
    
@Test
public void doubleArray() {
    ReverseMergesort<Double> mstest = new ReverseMergesort<>();
    Double [] a = {1.0, 0.1, 0.5, -1.4, 55.55, -15.3};
    mstest.sort(a);
    assertArrayEquals(new Double[] {-15.3, -1.4, 0.1, 0.5, 1.0, 55.55}, a);
    }
    
@Test
public void stringCharArray() {
    ReverseMergesort<String> mstest = new ReverseMergesort<>();
    String [] a = {"e", "d", "k", "z", "a"};
    mstest.sort(a);
    assertArrayEquals(new String[] {"a", "d", "e", "k", "z"}, a);
    }
    
@Test
public void stringWordArray() {
    ReverseMergesort<String> mstest = new ReverseMergesort<>();
    String [] a = {"over", "a", "black","utah", "public", "car", "to", "moving", "roads", "noice"};
    mstest.sort(a);
    assertArrayEquals(new String[] {"a", "black", "car", "moving", "noice", "over", "public", "roads", "to", "utah"}, a);
    }

@Test
public void emptyArray() {
    ReverseMergesort<Integer> mstest = new ReverseMergesort<>();
    Integer [] a = {};
    mstest.sort(a);
    assertArrayEquals(new Integer [] {}, a);
}
}
