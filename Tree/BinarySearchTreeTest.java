package de.hska.iwi.ads.solution.tree;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import de.hska.iwi.ads.dictionary.MapTest;

public class BinarySearchTreeTest extends MapTest{

 @Override
 public <K extends Comparable<K>, V> Map<K, V> createMap() {
  return new BinarySearchTree<>();
 }

 private Map<Integer, String> bst;

@BeforeEach
   void setUp() {
     // Map with 1,2,3,4, 6,7,8
     bst = createMap();
     bst.put(6, "Sechs");
     bst.put(3, "Drei");
     bst.put(1, "Eins");
     bst.put(7, "Sieben");
     bst.put(8, "Acht");
     bst.put(4, "Vier");
     bst.put(2, "Zwei");
   }
   
   @Test 
   void commonTestDictionary() {
     assertNotNull(bst);
     assertEquals(7, bst.size());
     assertEquals("Eins", bst.get(1));
     assertEquals("Zwei", bst.get(2));
     assertEquals("Drei", bst.get(3));
     assertEquals("Vier", bst.get(4));
     assertEquals("Sechs", bst.get(6));
     assertEquals("Sieben", bst.get(7));
     assertEquals("Acht", bst.get(8));
   }
   
   @Test
   void testSize0() {
     Map<Integer, String> dictionary = createMap();
   
     assertEquals(0, dictionary.size());
   }

 
  @Test
  void testSize1() {
    Map<Integer, String> dictionary = createMap();
    
    dictionary.put(5, "F�nf");
    dictionary.put(3, "Drei");
    dictionary.put(7, "Vier");
    dictionary.put(11, "Elf");
    dictionary.put(1, "Eins");
    dictionary.put(9, "Neun");
    assertEquals(6, dictionary.size());
  }

  @Test
  void testSize2() {
    Map<Integer, String> map = createMap();
    
    map.put(5, "F�nf");
    map.put(3, "Drei");
    map.put(1, "Eins");
    map.put(9, "Neun");
    map.put(3, "Drei");
    map.put(1, "Eins");
    assertEquals(4, map.size());
  }

  @Test
  void testPut() {
    bst.put(9, "Neun");
    assertEquals(8, bst.size());    
    assertEquals("Neun", bst.get(9));
  }
  
  @Test
  void testPut2() {
    bst.put(9, "Neun");
    bst.put(5, "F�nf");
    assertEquals(9, bst.size());    
    assertEquals("Neun", bst.get(9));
    assertEquals("F�nf", bst.get(5));
  }
  
  @Test
  void testPut3() {
    bst.put(9, "Neun");
    bst.put(5, "F�nf");
    bst.put(2, "Two");
    bst.put(9, "Neun");
    
    assertEquals(9, bst.size());    
    assertEquals("Neun", bst.get(9));
    assertEquals("F�nf", bst.get(5));
  }
  
  @Test
  void testGet() {
    assertNull(bst.get(5));
  }
  
  @Test
  void testGet1() {
    assertEquals("Sieben", bst.get(7));
  }
  
  @Test
  void testGet2() {
    assertEquals("Sechs", bst.get(6));
  }
  
  @Test
  void testGetNull() {
    assertThrows(NullPointerException.class, () -> bst.get(null));
  }
  
  @Test
  void testPutNull() {
    assertThrows(NullPointerException.class, () -> bst.put(null, "Null"));
  }
 
}
