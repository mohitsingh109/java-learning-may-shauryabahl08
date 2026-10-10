package org.shauryabahl08.filehandling.inputoutput.q1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeParser {
    //
    public static void main(String[] args) {
        // how to create an empty array list
        ArrayList<Employee> employees = new ArrayList<>();

        File file = new File("src/main/java/org/shauryabahl08/filehandling/inputoutput/q1/employee_hard.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                Employee employee = Employee.read(scanner);
                employees.add(employee);
            }
        } catch (FileNotFoundException fe) {
            System.out.println("File not found");
        }

        //output
        for (Employee employee : employees) {
            System.out.println(employee.getName());
            System.out.println(employee.getBio());
            System.out.println(employee.getRole());
            System.out.println(employee.getAnnualSalary());
            System.out.println(employee.getYearOfExperience());
            System.out.println("-----------------------------");
        }
    }
}
