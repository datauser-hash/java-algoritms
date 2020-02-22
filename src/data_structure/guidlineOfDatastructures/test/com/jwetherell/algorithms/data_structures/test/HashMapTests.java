package data_structure.guidlineOfDatastructures.test.com.jwetherell.algorithms.data_structures.test;

import static org.junit.Assert.assertTrue;

import data_structure.guidlineOfDatastructures.test.com.jwetherell.algorithms.data_structures.test.common.JavaMapTest;
import org.junit.Test;

import data_structure.guidlineOfDatastructures.src.com.jwetherell.algorithms.data_structures.HashMap;
import data_structure.guidlineOfDatastructures.test.com.jwetherell.algorithms.data_structures.test.common.JavaMapTest;
import data_structure.guidlineOfDatastructures.test.com.jwetherell.algorithms.data_structures.test.common.MapTest;
import data_structure.guidlineOfDatastructures.test.com.jwetherell.algorithms.data_structures.test.common.Utils;
import data_structure.guidlineOfDatastructures.test.com.jwetherell.algorithms.data_structures.test.common.Utils.TestData;

public class HashMapTests {

    @Test
    public void testHashMap() {
        TestData data = Utils.generateTestData(1000);

        String mapName = "ProbingHashMap";
        HashMap<Integer,String> map = new HashMap<Integer,String>(HashMap.Type.PROBING);
        java.util.Map<Integer,String> jMap = map.toMap();

        assertTrue(MapTest.testMap(map, Integer.class, mapName, data.unsorted, data.invalid));
        assertTrue(JavaMapTest.testJavaMap(jMap, Integer.class, mapName, data.unsorted, data.sorted, data.invalid));

        mapName = "LinkingHashMap";
        map = new HashMap<Integer,String>(HashMap.Type.CHAINING);
        jMap = map.toMap();

        assertTrue(MapTest.testMap(map, Integer.class, mapName, data.unsorted, data.invalid));
        assertTrue(JavaMapTest.testJavaMap(jMap, Integer.class, mapName, data.unsorted, data.sorted, data.invalid));
    }
}
