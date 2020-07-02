package com.codedifferently;

public class BasicFunction {

    public static double add(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

    public static double subtract(double num1, double num2) {
        double result = num1 - num2;
        return result;
    }

    public static double multiply(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }

    public static double divide(double num1, double num2) {
        double result = num1 / num2;
        return result;
    }

    public static double square(double num) {
        double result = num * num;
        return result;
    }

    public static double exponent(double num1, double exp) {
        double result = 0;
        if (exp >= 0) {
            result = Math.pow(num1, exp);
            
        }else{
            System.out.println("Cannot multiply by a power below zero.\n\n");
        }
        return result;
    }

    public static double sqrt(double num) {
        double result = 0;
        if (num >= 0) {
            result = Math.sqrt(num);
            
        }else{
            System.out.println("Cannot calculate the square root of a negative.\n\n");
        }
        return result;
    }





}