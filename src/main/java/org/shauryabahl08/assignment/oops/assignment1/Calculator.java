package org.shauryabahl08.assignment.oops.assignment1;

import java.util.Scanner;

public class Calculator {

    // define the function
    public static int add(int value1, int value2) {
        int result = value1 + value2;
        return result;
    }

    public static int subtract(int value1, int value2) {
        int result = value1 - value2;
        return result;
    }

    public static int multiply(int value1, int value2) {
        int result = value1 * value2;
        return result;
    }

    public static int divide(int value1, int value2) {
        int result = value1 / value2;
        return result;
    }

    public static void main(String[] args) {

        // we are creating an object of Scanner class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();

        //calling the function
        int addition = add(firstNumber, secondNumber);
        int subtraction = subtract(firstNumber, secondNumber);
        int multiplication = multiply(firstNumber, secondNumber);
        int division = divide(firstNumber, secondNumber);

        System.out.println("Addition       :" + addition);
        System.out.println("Subtraction    :" + subtraction);
        System.out.println("Multiplication :" + multiplication);
        System.out.println("Division       :" + division);
    }
}
