package de.hska.iwi.ads.solution.hashtable;

import de.hska.iwi.ads.dictionary.MapTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class HashtableTest extends MapTest {
    @Override
    public <K extends Comparable<K>, V> Map<K, V> createMap() {
        return new HashTable<>(17);
    }

    Map<Integer, String> testMap;

    @BeforeEach
    void setTestMap() {
        testMap = createMap();
        testMap.put(6, "Sechs");
        testMap.put(3, "Drei");
        testMap.put(1, "Eins");
        testMap.put(7, "Sieben");
        testMap.put(8, "Acht");
        testMap.put(4, "Vier");
        testMap.put(2, "Zwei");
    }

    @Test
    void sizeTest() {
     assertEquals(7, testMap.size());
    }

    @Test
    void ownTestGetValue() {
        assertEquals("Eins", testMap.get(1));
    }

    @Test
    void ownTestGetNonExistingValue() {
        assertNull(testMap.get(10));
    }

    @Test
    void ownTestGetNull() {
        assertThrows(NullPointerException.class, () -> testMap.get(null));
    }

    @Test
    void ownTestPutValue() {
        assertNull(testMap.put(11, "Elf"));
        assertEquals("Elf", testMap.get(11));
    }

    @Test
    void ownTestPutExistingValue() {
        assertEquals("Sieben", testMap.put(7, "Seven"));
        assertEquals("Seven", testMap.get(7));
    }

    @Test
    void ownTestPutNull() {
        assertThrows(NullPointerException.class, () -> testMap.put(null, "Null"));
    }
}