package data_structure.guidlineOfDatastructures.test.com.jwetherell.algorithms.data_structures.test;

import static org.junit.Assert.assertTrue;

import data_structure.guidlineOfDatastructures.test.com.jwetherell.algorithms.data_structures.test.common.JavaMapTest;
import org.junit.Test;

import data_structure.guidlineOfDatastructures.src.com.jwetherell.algorithms.data_structures.HashArrayMappedTrie;
import data_structure.guidlineOfDatastructures.test.com.jwetherell.algorithms.data_structures.test.common.JavaMapTest;
import data_structure.guidlineOfDatastructures.test.com.jwetherell.algorithms.data_structures.test.common.MapTest;
import data_structure.guidlineOfDatastructures.test.com.jwetherell.algorithms.data_structures.test.common.Utils;
import data_structure.guidlineOfDatastructures.test.com.jwetherell.algorithms.data_structures.test.common.Utils.TestData;

public class HashArrayMappedTreeTests {

    @Test
    public void testHAMT() {
        TestData data = Utils.generateTestData(1000);

        String mapName = "HAMT";
        HashArrayMappedTrie<Integer,String> map = new HashArrayMappedTrie<Integer,String>();
        java.util.Map<Integer,String> jMap = map.toMap();

        assertTrue(MapTest.testMap(map, Integer.class, mapName,
                                   data.unsorted, data.invalid));
        assertTrue(JavaMapTest.testJavaMap(jMap, Integer.class, mapName,
                                           data.unsorted, data.sorted, data.invalid));
    }
}
