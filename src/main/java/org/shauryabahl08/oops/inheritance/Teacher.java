package org.shauryabahl08.oops.inheritance;

public class Teacher extends Person {

    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age); // calling parent constructor to init the value
        this.subject = subject;
        System.out.println("Teacher constructor is called");
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
