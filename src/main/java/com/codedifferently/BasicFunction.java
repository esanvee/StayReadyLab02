package com.codedifferently;

public class BasicFunction {

    public double add(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

    public double subtract(double num1, double num2) {
        double result = num1 - num2;
        return result;
    }

    public double multiply(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }

    public double divide(double num1, double num2) {
        double result = num1 / num2;
        return result;
    }

    public double square(double num) {
        double result = num * num;
        return result;
    }

    public double exponent(double num1, double exp) {
        double result = 0;
        if (exp >= 0) {
            result = Math.pow(num1, exp);
            
        }else{
            System.out.println("Cannot multiply by a power below zero.\n\n");
        }
        return result;
    }

    public double sqrt(double num) {
        double result = 0;
        if (num >= 0) {
            result = Math.sqrt(num);
            
        }else{
            System.out.println("Cannot calculate the square root of a negative.\n\n");
        }
        return result;
    }





}