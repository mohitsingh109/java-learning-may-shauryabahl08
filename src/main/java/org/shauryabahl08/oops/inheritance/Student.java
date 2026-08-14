package org.shauryabahl08.oops.inheritance;

public class Student extends Person {

    private String rollNumber;

    // super keyword should be the first line
    public Student(String name, int age, String rollNumber) {
        super(name, age); // calling parent constructor to init the value
        this.rollNumber = rollNumber;
        System.out.println("Student constructor is called");
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }
}
