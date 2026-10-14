package org.shauryabahl08.exceptions.leasson1;

import java.util.Scanner;

public class ExampleMultipleCatchBlock {

    public static void main(String[] args) {

        String name = "Mohit";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your index: ");
        String indexText = scanner.next(); // abc

        try {
            int index = Integer.parseInt(indexText);
            System.out.println("Character at index " + index + " is: " + name.charAt(index));
            // close connection is not done here because if the exception occurs, the connection will not be closed
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for index. Please enter a valid integer.");
        } catch(StringIndexOutOfBoundsException e) {
            System.out.println("Index is out of bounds. Please enter a valid index between 0 and " + (name.length() - 1) + ".");
        } finally {
            System.out.println("Cleaning up resources...");
            // this is used to close the database connection, file connection, network connection, etc.
            scanner.close();
        }


        System.out.println("Program continues after exception handling.");
    }
}
