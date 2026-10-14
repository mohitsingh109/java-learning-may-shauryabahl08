package org.shauryabahl08.exceptions.leasson1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionCheckedAndUnchecked {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        String input = scanner.nextLine();
        int age = Integer.parseInt(input); // unchecked exception, if input is not a number, it will throw NumberFormatException
        System.out.println("Your age is: " + age);

        //unchecked exception are those that never force you to handle them

        File file = new File("unknown.txt");

        //checked exception are those that force you to handle them, if you don't handle them, your code will not compile

        Scanner scanner1 = new Scanner(file);

    }
}
