package de.hska.iwi.ads.solution.sorting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class ReverseArrayTest {
@Test
public void sortedArray() {
    ReverseArray<Integer> rstest = new ReverseArray<>();
    Integer [] a = {1, 3, 5, 6, 8, 10, 22, 35};
    rstest.reverse(a, 0, a.length-1);
    assertArrayEquals(new Integer[] {35, 22, 10, 8, 6, 5, 3, 1}, a);
}

@Test
public void reverseSortedArray() {
    ReverseArray<Integer> rstest = new ReverseArray<>();
    Integer [] a = {35, 22, 10, 8, 6, 5, 3, 1};
    rstest.reverse(a, 0, a.length-1);
    assertArrayEquals(new Integer[] {1, 3, 5, 6, 8, 10, 22, 35}, a);
}

@Test
public void arrayContainingDupes() {
    ReverseArray<Integer> rstest = new ReverseArray<>();
    Integer [] a = {5, 3, 7, 9, 3, 2, 7};
    rstest.reverse(a, 0, a.length-1);
    assertArrayEquals(new Integer[] {7, 2, 3, 9, 7, 3, 5}, a);
}

@Test
public void arrayContainingNegatives() {
    ReverseArray<Integer> rstest = new ReverseArray<>();
    Integer [] a = {5, -1, 6, -78, -3, 9, -3};
    rstest.reverse(a, 0, a.length-1);
    assertArrayEquals(new Integer[] {-3, 9, -3, -78, 6, -1, 5}, a);
}

@Test
public void doubleArray() {
    ReverseArray<Double> rstest = new ReverseArray<>();
    Double [] a = {1.0, 0.1, 0.5, -1.4, 55.55, -15.3};
    rstest.reverse(a, 0, a.length-1);
    assertArrayEquals(new Double[] {-15.3, 55.55, -1.4, 0.5, 0.1, 1.0}, a);
}

@Test
public void emptyArray() {
    ReverseArray<Integer> rstest = new ReverseArray<>();
    Integer [] a = {};
    Integer [] exp = {};
    rstest.reverse(a, 0, a.length-1);
    assertArrayEquals(exp, a);
    }

@Test
public void singleArray() {
    ReverseArray<Integer> rstest = new ReverseArray<>();
    Integer [] a = {1};
    Integer [] exp = {1};
    rstest.reverse(a, 0, a.length-1);
    assertArrayEquals(exp, a);
}

@Test
public void otherStartEndPointArray() {
    ReverseArray<Integer> rstest = new ReverseArray<>();
    Integer [] a = {1, 2, 3, 4, 5, 6};
    Integer [] exp = {1, 6, 5, 4, 3, 2};
    rstest.reverse(a, 1, a.length-1);
    assertArrayEquals(exp, a);
}

}
