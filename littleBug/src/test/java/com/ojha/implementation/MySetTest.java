package com.ojha.implementation;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by alexandra on 03/06/2014.
 */
public class MySetTest {

    private MySet<String> mySet;

    @Before
    public void setup(){
        this.mySet = new MySet<String>();
    }

    /* Test isEmpty() */

    @Test
    public void testIsEmptyWhenEmpty(){
        assertTrue(this.mySet.isEmpty());
    }

    @Test
    public void testIsEmptyWhenNotEmpty(){
        this.mySet.add("hi");
        assertFalse(this.mySet.isEmpty());
    }
}
