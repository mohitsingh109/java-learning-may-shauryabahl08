package org.shauryabahl08.oops.inheritance;

public class Student extends Person {

    private String rollNumber;

    //Note: super keyword should be the first line in the child constructor
    public Student(String name, int age, String rollNumber) {
        super(name, age); // calling parent constructor to init the value
        this.rollNumber = rollNumber;
        //System.out.println("Student constructor is called");
    }

    @Override
    public void display() {
        System.out.println("===========Student==========");
        super.display();// calling the display of person class
        System.out.println("Roll No: " + rollNumber);
        System.out.println("===========================");
    }


    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }
}
