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
    static DisplayMode displayMode = new DisplayMode();

    public static void main(String[] args) {

        
        System.out.println("\n\nBooting...");

        System.out.println("\nPlease select a display mode\n");
        System.out.println("1 = decimal\n2 = binary\n3 = octal\n4 = hexadecimal\n");

        try {
            //check for a number
            int num = scanner.nextInt();
            displayMode.changeDisplayMode(num);

        } catch (Exception e) {

            System.out.println("\nGoodbye.\n");
            stop(); 

        }

        

        

        

    }

    public static void getNewValue() {

        while (memory.getValue() == 0 && memory.getClearStatus() == true) {

            /*
             * This method is only to be used when booting the calculator up OR after
             * clearing the memory. Zero is displayed, but it does NOT count as a number
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
                        memory.setValue(BasicFunction.square(memory.getValue()));
                        memory.display();
                        calculate();
                        
                    case "^":
                        System.out.println("exponent.");
                        break;

                    case "sqrt":
                        System.out.println("square.");
                        memory.setValue(BasicFunction.sqrt(memory.getValue()));
                        memory.display();
                        calculate();

                    case "invert":
                        System.out.println("invert.");
                        memory.setValue(BasicFunction.invert(memory.getValue()));
                        memory.display();
                        calculate();

                    case "clear":
                        clearMemory();

                    case "stop":
                        stop();

                    default:
                        System.out.println("Oops! An error occured. Please try again.");
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

                    case "^":
                        memory.setValue(BasicFunction.exponent(memory.getValue(), inputNum));
                        break;

                    case "clear":
                        clearMemory();

                    case "stop":
                        stop();

                }

            } catch (Exception e) {

                System.out.println("\nA number please.");

                break;

            }

            memory.display();

        }

        System.out.println("An error occured. Please try again.");

        clearMemory();

    }

    public static void clearMemory() {

        /*
         * Stop the taking in input. Memory is cleared and the calculator is essentially
         * soft rebooted.
         */


        clearScanner();
        memory.clear();
        getNewValue();

    }

    public static void stop() {
        System.exit(0);
    }

    public static void clearScanner(){
        /// IMPORTENT!! Clears scanner.//
        scanner.nextLine();
        System.out.println();
        ////////////////////////////////
    }

}
