package com.codedifferently;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MemoryTest {
    Memory memory;

    @Before
    public void initialize() {
        this.memory = new Memory();
    }

    @Test
    public void testValue() {
        memory.setValue(3);

        double actualValue = memory.getValue();
        double expectedValue = 3;

        Assert.assertEquals(expectedValue, actualValue, 0);

    }

    @Test

    public void testClear() {

        memory.setValue(7);

        memory.clear();

        double expectedValue = 0;
        double actualValue = memory.getValue();

        Assert.assertEquals(expectedValue, actualValue, 0);
    }

    @Test

    public void testCleared() {

        memory.clear();

        boolean expectedValue = memory.getClearStatus();

        Assert.assertEquals(expectedValue, true);

    }

}