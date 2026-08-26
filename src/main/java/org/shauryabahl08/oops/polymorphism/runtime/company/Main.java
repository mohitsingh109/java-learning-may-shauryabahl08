package org.shauryabahl08.oops.polymorphism.runtime.company;

public class Main {

    public static void main(String[] args) {

        // Assume you have 1000 Employee
        // 1000 Employee is consist of Manage, JavaDeveloper, PythonDeveloper, VP, SVP, CEO, CTO ...etc..
        // if I want you to send a bonus of 5$ to each of the employee how you can do that?

        Manager manager1 = new Manager("Mohit", 10, "AI");
        Manager manager2 = new Manager("Karan", 25, "ETL");

        JavaDeveloper javaDeveloper1 = new JavaDeveloper("Shaurya", 11, "17");

        JavaDeveloper javaDeveloper2 = new JavaDeveloper("Arjun", 16, "22");

        // ...
        // 1000
        // m1.bonus()
        // m2.bonus() ... 10,00,000

        // Because of run time poly
        // In real life this will be pulled from database
        Employee[] employees = {manager1, manager2, javaDeveloper1, javaDeveloper2}; // 1000 Object

        for (Employee e: employees) { // for each loop
            e.bonus(5); // ??
        }

    }
}
