package org.shauryabahl08.maths;

public class MathExample {

    public static void main(String[] args) {
        // Math is a utility class in java
        // Support math operation
        // Square root
        // Power
        // Max
        // Min
        // Random Number
        // Abs value

        System.out.println("Math operation");

        double result = Math.sqrt(25);
        System.out.println("Square root of 25: " + result);

        System.out.println("Power of 2^3: " + Math.pow(2, 3));

        System.out.println("Max of 10 and 20: " + Math.max(10, 20));

        System.out.println("Min of 10 and 20: " + Math.min(10, 20));

        System.out.println("Abs value of -10: " + Math.abs(-10));

        System.out.println("Ceil of 10.6: " + Math.ceil(10.6));

        System.out.println("Floor of 10.6: " + Math.floor(10.6));

        double valueToRound = 4.7;

        System.out.println("Round: " + Math.round(valueToRound));

        // Random number between 0 and 1
        // 0 <= value < 1
        for(int i = 0; i < 5; i++) {
            System.out.println("Random number between 0 and 1: " + Math.random());
        }

        // Generate a number from 1 to 10
        int number = (int)(Math.random() * 10) + 1;
        System.out.println(number);

        // Trigonometric

        System.out.println("Sin of 30: " + Math.sin(Math.toRadians(30)));

    }
}
