package de.hska.iwi.ads.solution.sorting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class MergesortTest {

 @Test
 public void sortedArray() {
  Mergesort<Integer> mstest = new Mergesort<>();
  Integer [] a = {1, 3, 5, 6, 8, 10, 22, 35};
  mstest.sort(a);
  assertArrayEquals(new Integer[] {1, 3, 5, 6, 8, 10, 22, 35}, a);
 }

 @Test
 public void reverseSortedArray() {
  Mergesort<Integer> mstest = new Mergesort<>();
  Integer [] a = {35, 22, 10, 8, 6, 5, 3, 1};
  mstest.sort(a);
  assertArrayEquals(new Integer[] {1, 3, 5, 6, 8, 10, 22, 35}, a);
 }

 @Test
 public void arrayContainingDupes() {
  Mergesort<Integer> mstest = new Mergesort<>();
  Integer [] a = {5, 3, 7, 9, 3, 2, 7};
  mstest.sort(a);
  assertArrayEquals(new Integer[] {2, 3, 3, 5, 7, 7, 9}, a);
 }

 @Test
 public void arrayWithTheSameElement() {
  Mergesort<Integer> mstest = new Mergesort<>();
  Integer [] a = {5, 5, 5, 5, 5, 5, 5};
  mstest.sort(a);
  assertArrayEquals(new Integer[] {5, 5, 5, 5, 5, 5, 5}, a);
 }

 @Test
 public void arrayContainingNegatives() {
  Mergesort<Integer> mstest = new Mergesort<>();
  Integer [] a = {5, -1, 6, -78, -3, 9, -3};
  mstest.sort(a);
  assertArrayEquals(new Integer[] {-78, -3, -3, -1, 5, 6, 9}, a);
 }

 @Test
 public void doubleArray() {
  Mergesort<Double> mstest = new Mergesort<>();
  Double [] a = {1.0, 0.1, 0.5, -1.4, 55.55, -15.3};
  mstest.sort(a);
  assertArrayEquals(new Double[] {-15.3, -1.4, 0.1, 0.5, 1.0, 55.55}, a);
 }

 @Test
 public void stringCharArray() {
  Mergesort<String> mstest = new Mergesort<>();
  String [] a = {"e", "d", "k", "z", "a"};
  mstest.sort(a);
  assertArrayEquals(new String[] {"a", "d", "e", "k", "z"}, a);
 }

 @Test
 public void stringWordArray() {
  Mergesort<String> mstest = new Mergesort<>();
  String [] a = {"over", "a", "black","utah", "public", "car", "to", "moving", "roads", "noice"};
  mstest.sort(a);
  assertArrayEquals(new String[] {"a", "black", "car", "moving", "noice", "over", "public", "roads", "to", "utah"}, a);
 }

}
