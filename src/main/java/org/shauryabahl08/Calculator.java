package org.shauryabahl08;

import java.util.Scanner;

public class Calculator {

    /**
     * Create a calculator where user will pass the symbols
     * Symbols => (+,-,/,*,%)
     * datatype user want to provide ("int", "float")
     * Two input => (value1, value2)
     * + --> value1 + value2
     * - --> value1 - value2
     * * --> value1 * value2
     * ...
     *
     * if-esle & swtich
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // This is the way to take input from user
        System.out.println("Enter the symbol (+, -, *, /, %): ");
        String symbol = scanner.nextLine(); // here we are taking the input using nextLine()
        System.out.println("Selected Symbol " + symbol);


        if (symbol.equals("+")) {
            System.out.println("Addition");
        }
    }
}
