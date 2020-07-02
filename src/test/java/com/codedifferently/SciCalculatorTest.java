package com.codedifferently;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SciCalculatorTest 
{
    Memory memory;
    SciCalculator calc;

    @Before
    public void initialize() {
        this.memory = new Memory();
        this.calc = new SciCalculator();
    }


  
    @Test
    public void newValueTest()
    {
        calc.memory.setValue(7);


        double expectedValue = 7;
        double actualValue = calc.memory.getValue();

        Assert.assertEquals(expectedValue, actualValue,0);
    }
}
