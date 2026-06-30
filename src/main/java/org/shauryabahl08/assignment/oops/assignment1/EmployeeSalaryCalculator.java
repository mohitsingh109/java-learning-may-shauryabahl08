package org.shauryabahl08.assignment.oops.assignment1;

import java.util.Scanner;

public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Employee name: ");
        String name = sc.nextLine();
        System.out.println("Basic Salary: ");
        double salary = sc.nextDouble();

        double hra = calculateHRA(salary);
        double da = calculateDA(salary);
        double tax = calculateTax(salary);
        double netSalary = calculateNetSalary(salary, hra, da, tax);
        printSalarySlip(name, salary, hra, da, tax, netSalary);
    }

    public static double calculateHRA(double salary){
        double hra = salary * 0.20;
        return hra;
    }

    public static double calculateDA(double salary){
        double da = salary * 0.10;
        return da;
    }

    public static double calculateTax(double salary){
        double tax = salary * 0.05;
        return tax;
    }
    public static double calculateNetSalary(double salary, double hra, double da, double tax){
        double netSalary = salary + hra + da - tax;
        return netSalary;
    }

    public static void printSalarySlip(String name, double salary, double hra, double da, double tax, double netSalary){
        System.out.println("Employee name: " + name);
        System.out.println("Basic Salary: " + salary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Tax: " + tax);
        System.out.println("Net Salary: " + netSalary);
    }

}
