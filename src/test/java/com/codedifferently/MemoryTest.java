package com.codedifferently;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class MemoryTest{
    Memory memory;
    @Before
    public void initialize(){
    this.memory = new Memory();
    }

    @Test
    public void testTemp1() {
        memory.setTemp1(3);

        double actualValue = memory.getTemp1();
        double expectedValue = 3;

        Assert.assertEquals(expectedValue, actualValue, 0);

    }

    @Test
    public void testTemp2() {
        memory.setTemp2(6);

        double actualValue = memory.getTemp2();
        double expectedValue = 6;

        Assert.assertEquals(expectedValue, actualValue, 0);

    }
  

}