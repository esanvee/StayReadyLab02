package com.codedifferently;

import org.junit.Test;



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
        double actualResult = BasicFunction.add(num1, num2);

        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void subtractionTest(){

        
        double num1 = 8;
        double num2 = 2;

        double expectedResult = num1 - num2;
        double actualResult = BasicFunction.subtract(num1, num2);

        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void multiplicationTest(){

        
        double num1 = 5;
        double num2 = 2;

        double expectedResult = num1 * num2;
        double actualResult = BasicFunction.multiply(num1, num2);

        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void divisionTest(){

        
        double num1 = 1;
        double num2 = 2;

        double expectedResult = num1 / num2;
        double actualResult = BasicFunction.divide(num1, num2);

        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void squareTest(){

        
        double num1 = 5;
        

        double expectedResult = num1*num1;
        double actualResult = BasicFunction.square(num1);

        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void exponentTest(){

        
        double num1 = 9;
        double num2 = 4;

        double expectedResult = Math.pow(num1, num2);
        double actualResult = BasicFunction.exponent(num1, num2);

        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void squareRootTest(){

        
        double num1 = 25;
        

        double expectedResult = 5;
        double actualResult = BasicFunction.sqrt(num1);

        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test

    public void testInvert(){
        double num = 100;

        double expectedResult = -100;
        double actualResult = BasicFunction.invert(num);

        Assert.assertEquals(expectedResult, actualResult,0);


    }







}