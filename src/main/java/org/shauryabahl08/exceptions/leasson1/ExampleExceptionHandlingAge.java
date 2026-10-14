package org.shauryabahl08.exceptions.leasson1;

import java.util.Scanner;

public class ExampleExceptionHandlingAge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        String input = scanner.nextLine();

        // file reading there is possibility some of the age are invalid a, abc, #%
        // assign a default value to age = 18
        int age;
        try {
            age = Integer.parseInt(input);
            System.out.println("You entered age: " + age);
        } catch (NumberFormatException e) {
            age = 18;
            System.out.println("Invalid input. Please enter a valid integer for age.");
            e.printStackTrace();
        }

        System.out.println("Hello......");
    }
}
