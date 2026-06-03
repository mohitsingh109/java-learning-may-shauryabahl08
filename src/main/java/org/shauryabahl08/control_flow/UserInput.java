package org.shauryabahl08.control_flow;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // User input can be taken via a Scanner class
        // int
        // double
        // String
        // boolean

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter you age:");
//        int age = sc.nextInt();
//        System.out.println("Your age is: " + age);

//        System.out.println("Enter you name:");
//        String name = sc.next(); // "+", "-", "/", "*", "%"
//        System.out.println("Your name is: " + name);

        System.out.println("Enter your number: ");
        double value = sc.nextDouble();
        System.out.println("Your number is: " + value);

    }
}
