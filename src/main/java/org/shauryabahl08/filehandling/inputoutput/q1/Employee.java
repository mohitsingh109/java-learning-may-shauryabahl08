package org.shauryabahl08.filehandling.inputoutput.q1;

import java.util.Scanner;

public class Employee {

    private String name;

    private String role;

    private double annualSalary;

    private int yearOfExperience;

    private String bio;

    public Employee(String name, String role, double annualSalary, int yearOfExperience, String bio) {
        this.name = name;
        this.role = role;
        this.annualSalary = annualSalary;
        this.yearOfExperience = yearOfExperience;
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public String getBio() {
        return bio;
    }

    public static Employee read(Scanner input) {
        if(!input.hasNextLine()) {
            System.out.println("No more employees to read");
            return null; // no employee to read
        }

        String name = input.nextLine(); // Mohit Singh
        String details = input.nextLine(); // Software Engineer, 1450000.00, 6
        String bio = input.nextLine();
        Scanner scanner = new Scanner(details); // reading a string using scanner
        scanner.useDelimiter(", ");
        String role = scanner.next();
        double annualSalary = scanner.nextDouble();
        int yearOfExperience = scanner.nextInt();
        return new Employee(name, role, annualSalary, yearOfExperience, bio);
    }


    //  static function
    //  called not by object but by class name --> ans

    // if I don't create any single object of this class

    /**
     * // static function can't access any instance variable
     * public static String someFuntion() {
     *      print(name); // ??
     * }
     *
     *  Employee.someFuntion() // static function
     */

    // if there are 100 object then what it will going to return
}
