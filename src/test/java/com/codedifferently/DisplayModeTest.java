package com.codedifferently;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DisplayModeTest {

    DisplayMode displayMode;
    

    @Before
    public void initialize() {
        this.displayMode = new DisplayMode();
       
    }

    @Test

    public void setDisplayMode(){

        String mode = "binary";

        displayMode.setDisplayMode(mode);

        String expectedValue = mode;
        String actualValue = displayMode.getDisplayMode();

        Assert.assertEquals(expectedValue, actualValue);




    }
    
}