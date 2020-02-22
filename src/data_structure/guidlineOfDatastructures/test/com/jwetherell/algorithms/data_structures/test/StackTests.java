package data_structure.guidlineOfDatastructures.test.com.jwetherell.algorithms.data_structures.test;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Test;

import data_structure.guidlineOfDatastructures.src.com.jwetherell.algorithms.data_structures.Stack;
import data_structure.guidlineOfDatastructures.test.com.jwetherell.algorithms.data_structures.test.common.JavaCollectionTest;
import data_structure.guidlineOfDatastructures.test.com.jwetherell.algorithms.data_structures.test.common.StackTest;
import data_structure.guidlineOfDatastructures.test.com.jwetherell.algorithms.data_structures.test.common.Utils;
import data_structure.guidlineOfDatastructures.test.com.jwetherell.algorithms.data_structures.test.common.Utils.TestData;

public class StackTests {

    @Test
    public void testArrayStack() {
        TestData data = Utils.generateTestData(1000);

        String aName = "Stack [array]";
        Stack.ArrayStack<Integer> aStack = new Stack.ArrayStack<Integer>();
        Collection<Integer> aCollection = aStack.toCollection();

        assertTrue(StackTest.testStack(aStack, aName,
                                       data.unsorted, data.invalid));
        assertTrue(JavaCollectionTest.testCollection(aCollection, Integer.class, aName,
                                                     data.unsorted, data.sorted, data.invalid));
    }

    @Test
    public void testLinkedStack() {
        TestData data = Utils.generateTestData(1000);

        String lName = "Stack [linked]";
        Stack.LinkedStack<Integer> lStack = new Stack.LinkedStack<Integer>();
        Collection<Integer> lCollection = lStack.toCollection();

        assertTrue(StackTest.testStack(lStack, lName,
                                       data.unsorted, data.invalid));
        assertTrue(JavaCollectionTest.testCollection(lCollection, Integer.class, lName,
                                                     data.unsorted, data.sorted, data.invalid));
    }
}
