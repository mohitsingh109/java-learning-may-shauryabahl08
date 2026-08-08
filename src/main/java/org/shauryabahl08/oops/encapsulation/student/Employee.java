package org.shauryabahl08.oops.encapsulation.student;

// 1000 Employee
public class Employee {

    //instance variable
    private String name;

    private String department;

    // class variable
    // This will be created only once and shared by all the object
    private static String companyName = "ABC Company";
    // total number of employee?

    // company name

    // class function
    public static String getCompanyName() {
        return companyName;
    }
}
