package org.shauryabahl08.oops.inheritance;

public class Student extends Person {

    private String rollNumber;

    public Student(String name, int age, String rollNumber) {
        super(name, age); // we use super to init the parent instance variables
        this.rollNumber = rollNumber;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }
}
