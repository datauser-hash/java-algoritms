package data_structure.guidlineOfDatastructures.test.com.jwetherell.algorithms.data_structures.test;

import static org.junit.Assert.assertTrue;

import data_structure.guidlineOfDatastructures.test.com.jwetherell.algorithms.data_structures.test.common.JavaMapTest;
import org.junit.Test;

import data_structure.guidlineOfDatastructures.src.com.jwetherell.algorithms.data_structures.TreeMap;
import data_structure.guidlineOfDatastructures.test.com.jwetherell.algorithms.data_structures.test.common.JavaMapTest;
import data_structure.guidlineOfDatastructures.test.com.jwetherell.algorithms.data_structures.test.common.MapTest;
import data_structure.guidlineOfDatastructures.test.com.jwetherell.algorithms.data_structures.test.common.Utils;
import data_structure.guidlineOfDatastructures.test.com.jwetherell.algorithms.data_structures.test.common.Utils.TestData;

public class TreeMapTests {

    @Test
    public void testTreeMap() {
        TestData data = Utils.generateTestData(1000);

        String mapName = "TreeMap";
        TreeMap<String,Integer> map = new TreeMap<String,Integer>();
        java.util.Map<String,Integer> jMap = map.toMap();

        assertTrue(MapTest.testMap(map, String.class, mapName,
                                   data.unsorted, data.invalid));
        assertTrue(JavaMapTest.testJavaMap(jMap, Integer.class, mapName,
                                           data.unsorted, data.sorted, data.invalid));
    }
}
