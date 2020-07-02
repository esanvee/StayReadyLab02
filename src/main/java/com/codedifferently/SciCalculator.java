package com.codedifferently;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class SciCalculator {

    private static double inputNum = 0;
    private static String inputOp = "";
    static Scanner scanner = new Scanner(System.in);
    static Memory memory = new Memory();

    public static void main(String[] args) {

        // System.out.println("\n\nPlease select a calculator mode\n\n");

        getNewValue();

    }

    public static void getNewValue() {

        while (memory.getValue() == 0 && memory.getClearStatus() == true) {

            /*
             * This method is only to be used when booting the calculator up OR after
             * clearing the memory. Zero is displayed, but it does NOT could as a number
             * waiting in memory.
             */

            System.out.println("\nEnter a new value\n");

            // Accepts a new value into memory.

            try {
                //check for a double
                inputNum = scanner.nextDouble();

            } catch (Exception e) {

                System.out.println("\nA number please.");

                clearMemory(); //start over

            }

            memory.setValue(inputNum);

            // Let's the program know the memory is no longer cleared/empty.

            memory.setClearFalse();

            memory.display();

            calculate();

        }

    }

    public static void calculate() {

        while (true) { // infinite loop

            //////// GET OPERATOR///////
            System.out.println("\nEnter an operator\n");

            try {

                inputOp = scanner.next();

                switch (inputOp) {
                    case "+":
                        System.out.println("addition.");
                        break;

                    case "-":
                        System.out.println("subtraction.");
                        break;

                    case "*":
                        System.out.println("multiply.");
                        break;

                    case "/":
                        System.out.println("division.");
                        break;

                    case "^2":
                        System.out.println("square.");
                        break;

                    case "stop":
                        stop();

                    default:
                        System.out.println("Oops!");
                        clearMemory();
                        break;
                }

            } catch (Exception e) {

                System.out.println("\nAn operator please.");
                break;

            }

            //////// GET NUMBER///////

            System.out.println("\nEnter an number\n");

            try {

                inputNum = scanner.nextDouble();

                // Get the number then perform operation on the number

                switch (inputOp) {
                    case "+":
                        memory.setValue(BasicFunction.add(memory.getValue(), inputNum));
                        break;

                    case "-":
                        memory.setValue(BasicFunction.subtract(memory.getValue(), inputNum));
                        break;

                    case "*":
                        memory.setValue(BasicFunction.multiply(memory.getValue(), inputNum));
                        break;

                    case "/":
                        memory.setValue(BasicFunction.divide(memory.getValue(), inputNum));
                        break;

                    case "stop":
                        stop();

                }

            } catch (Exception e) {

                System.out.println("\nA number please.");

                break;

            }

            memory.display();

        }

        System.out.println("An error has occured. Please try again.");

        clearMemory();

    }

    public static void clearMemory() {

        /*
         * Stop the taking in input. Memory is cleared and the calculator is essentially
         * soft rebooted.
         */

        /// IMPORTENT!! Clears scanner.//
        scanner.nextLine();
        System.out.println();
        ////////////////////////////////

        memory.clear();
        getNewValue();

    }

    public static void stop() {
        System.exit(0);
    }

}
