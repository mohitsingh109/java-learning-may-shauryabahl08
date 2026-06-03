package org.shauryabahl08;

import java.sql.SQLOutput;
import java.util.Objects;
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
        Scanner sc = new Scanner (System.in);
        System.out.println("Please choose your operation: (+,-,*,/,%)");
        String operator = sc.next();
        System.out.println("Your operator is: " + operator);

        System.out.println("Enter value1: ");
        double value1 = sc.nextDouble();
        System.out.println("Enter value2: ");
        double value2 = sc.nextDouble();


        if (Objects.equals(operator, "+")){
            System.out.println("Result: " + (value1 + value2));
        }
        else if (Objects.equals(operator, "-")) {
            System.out.println("Result: " + (value1 - value2));
        }
        else if (Objects.equals(operator, "*")) {
            System.out.println("Result: " + (value1 * value2));
        }
        else if (Objects.equals(operator, "/")) {

            System.out.println("Result: " + (value1 / value2));
        }
        else if (Objects.equals(operator, "%")) {
            System.out.println("Result: " + (value1 % value2));
        }
        else {
            System.out.println("Operator Not Valid!");
        }
        switch (operator) {
            case "+":
                System.out.println("Result: " + (value1 + value2));
                break;
            case "-":
                System.out.println("Result: " + (value1 - value2));
                break;
            case "*":
                System.out.println("Result: " + (value1 * value2));
                break;
            case "/":
                System.out.println("Result: " + (value1 / value2));
                break;
            case "%":
                System.out.println("Result: " + (value1 % value2));
                break;
            default:
                System.out.println("Operator Not Valid!");
                break;
        }

    }

}

