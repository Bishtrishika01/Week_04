package org.day05.problemstatement.junit.basicJUnittest.testinglistoperations;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestingListOperationsTest {
    @Test
    void addElementTest() {
        List<Integer> list = new ArrayList<>();
        TestingListOperations.addElement(list, 1);
        TestingListOperations.addElement(list, 2);
        TestingListOperations.addElement(list, 3);

        assertEquals(3, list.size());
        assertTrue(list.contains(1));
        assertTrue(list.contains(2));
        assertTrue(list.contains(3));

    }   @Test
    void removeElementTest() {
        List<Integer> list = new ArrayList<>();
        TestingListOperations.addElement(list, 1);
        TestingListOperations.addElement(list, 2);
        TestingListOperations.addElement(list, 3);

        TestingListOperations.removeElement(list,1);
        TestingListOperations.removeElement(list,2);

        assertFalse(list.contains(1));
        assertFalse(list.contains(2));
        assertTrue(list.contains(3));

    }
}