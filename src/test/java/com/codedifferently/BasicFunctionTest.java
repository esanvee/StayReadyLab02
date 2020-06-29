package com.codedifferently;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;


public class BasicFunctionTest {

    BasicFunction basic;
    @Before
    public void initialize(){
        this.basic = new BasicFunction();
    }

    @Test
    public void additionTest(){

        
        double num1 = 5;
        double num2 = 2;

        double expectedResult = num1 + num2;
        double actualResult = basic.add(num1, num2);

        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void subtractionTest(){

        
        double num1 = 8;
        double num2 = 2;

        double expectedResult = num1 - num2;
        double actualResult = basic.subtract(num1, num2);

        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void multiplicationTest(){

        
        double num1 = 5;
        double num2 = 2;

        double expectedResult = num1 * num2;
        double actualResult = basic.multiply(num1, num2);

        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void divisionTest(){

        
        double num1 = 1;
        double num2 = 2;

        double expectedResult = num1 / num2;
        double actualResult = basic.divide(num1, num2);

        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void squareTest(){

        
        double num1 = 5;
        

        double expectedResult = num1*num1;
        double actualResult = basic.square(num1);

        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void exponentTest(){

        
        double num1 = 9;
        double num2 = 4;

        double expectedResult = Math.pow(num1, num2);
        double actualResult = basic.exponent(num1, num2);

        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void squareRootTest(){

        
        double num1 = 25;
        

        double expectedResult = 5;
        double actualResult = basic.sqrt(num1);

        Assert.assertEquals(expectedResult, actualResult, 0);
    }







}