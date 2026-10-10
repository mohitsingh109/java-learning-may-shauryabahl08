package org.shauryabahl08.filehandling.inputoutput;

import java.util.Scanner;

public class ReadEmployeeDataUseDelimiter {

    public static void main(String[] args) {
        // Scanner will be used to take user input, to read file, to read string
        Scanner scanner = new Scanner("Mohit Singh, Software Engineer, 28, 75000.00");
        scanner.useDelimiter(", ");
        if (scanner.hasNext()) { // do I've some data or not
            String name = scanner.next();
            String designation = scanner.next();
            int age = scanner.nextInt();
            double salary = scanner.nextDouble();
            System.out.println("Name: " + name + ", Designation: " + designation + ", Age: " + age + ", Salary: " + salary);
        }
    }
}
