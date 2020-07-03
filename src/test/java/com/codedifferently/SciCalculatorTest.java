package com.codedifferently;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SciCalculatorTest 
{
    Memory memory;
    SciCalculator calc;
    DisplayMode displayMode;

    @Before
    public void initialize() {
        this.memory = new Memory();
        this.calc = new SciCalculator();
        this.displayMode = new DisplayMode();
    }


  
    @Test
    public void newValueTest()
    {
        calc.memory.setValue(7);


        double expectedValue = 7;
        double actualValue = calc.memory.getValue();

        Assert.assertEquals(expectedValue, actualValue,0);
    }

    @Test

    public void testDisplaySwitch(){

        String mode = "binary";

        calc.displayMode.setDisplayMode(mode);

        String expectedValue = mode;
        String actualValue = calc.displayMode.getDisplayMode();

        Assert.assertEquals(expectedValue, actualValue);

    }

    @Test

    public void testChangeDisplayMode(){

        int mode = 3;

        calc.displayMode.changeDisplayMode(mode);

        String expectedValue = "octal";
        String actualValue = calc.displayMode.getDisplayMode();

        Assert.assertEquals(expectedValue, actualValue);

    }
}
