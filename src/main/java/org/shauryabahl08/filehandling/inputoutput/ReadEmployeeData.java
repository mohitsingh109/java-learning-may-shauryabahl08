package org.shauryabahl08.filehandling.inputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadEmployeeData {

    public static void main(String[] args) {

        File file = new File("src/main/java/org/shauryabahl08/filehandling/inputoutput/employee.txt");

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String employeeDetails = scanner.nextLine(); // Mohit Singh, Software Engineer, 28, 75000.00
                // using string split function
                String[] employeeDetailsArray = employeeDetails.split(","); // [Mohit Singh, Software Engineer, 28, 75000.00]
                String name = employeeDetailsArray[0];
                String designation = employeeDetailsArray[1];
                // type case string to int
                // read about wrapper classes in java
                // string to int
                // () between a primitive data type is called type casting
                // () between object
                // trim() --> use to remove the white space from the string
                String ageString = employeeDetailsArray[2].trim();
                int age = Integer.parseInt(ageString);
                // trim() --> use to remove the white space from the string
                // string to double
                // () between a primitive data type is called type casting
                // () between object
                double salary = Double.parseDouble(employeeDetailsArray[3]);
                System.out.println("Name: " + name + ", Designation: " + designation + ", Age: " + age + ", Salary: " + salary);

                // Employee employee = new Employee(name, designation, age, salary);
                scanner.close();
            }
        } catch(FileNotFoundException fe) {
            System.out.println("File not found");
        }
    }
}
