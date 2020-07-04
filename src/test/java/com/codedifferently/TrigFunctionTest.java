package com.codedifferently;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TrigFunctionTest {

    TrigFunction trigFunction;

    @Before

    public void initialize(){
        this.trigFunction = new TrigFunction();
    }

    @Test

    public void testTrig(){

        double num = 10;

        double expectedValue = Math.tan(num);

        double actualValue = TrigFunction.tangent(num);

        Assert.assertEquals(expectedValue, actualValue, 0);




    }
    
    
}