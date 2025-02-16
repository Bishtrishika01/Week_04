package com.annotation.excercise.uncheckedwarnings;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class SuppressWarningTest extends TestCase {
    @Test // test method
    @SuppressWarnings("unchecked") // suppress warning
    public void testArrayListWithoutGenerics() {
        ArrayList list = new ArrayList(); // create list
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        assertEquals(3, list.size()); // check size
        assertEquals("Apple", list.get(0)); // check first element
        assertEquals("Banana", list.get(1)); // check second element
        assertEquals("Cherry", list.get(2)); // check third element
    }

}