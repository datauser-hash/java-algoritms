package data_structure.guidlineOfDatastructures.test.com.jwetherell.algorithms.data_structures.test;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import data_structure.guidlineOfDatastructures.test.com.jwetherell.algorithms.data_structures.test.common.TreeTest;
import org.junit.Test;

import data_structure.guidlineOfDatastructures.src.com.jwetherell.algorithms.data_structures.PatriciaTrie;
import data_structure.guidlineOfDatastructures.test.com.jwetherell.algorithms.data_structures.test.common.JavaCollectionTest;
import data_structure.guidlineOfDatastructures.test.com.jwetherell.algorithms.data_structures.test.common.TreeTest;
import data_structure.guidlineOfDatastructures.test.com.jwetherell.algorithms.data_structures.test.common.Utils;
import data_structure.guidlineOfDatastructures.test.com.jwetherell.algorithms.data_structures.test.common.Utils.TestData;

public class PatriciaTreeTests {

    @Test
    public void testPatriciaTrie() {
        TestData data = Utils.generateTestData(1000);

        String bstName = "PatriciaTrie";
        PatriciaTrie<String> bst = new PatriciaTrie<String>();
        Collection<String> bstCollection = bst.toCollection();

        assertTrue(TreeTest.testTree(bst, String.class, bstName,
                                     data.unsorted, data.invalid));
        assertTrue(JavaCollectionTest.testCollection(bstCollection, String.class, bstName,
                                                     data.unsorted, data.sorted, data.invalid));
    }
}
