package org.shauryabahl08.oops.inheritance;

public class TestingInheritance {

    public static void main(String[] args) {
        Student s1 = new Student("John", 20, "12345");
        s1.display();
        //s1.setAddress("Bla Bal 1");

//        System.out.println("Name: " + s1.getName());
//        System.out.println("Age: " + s1.getAge());
//        System.out.println("Roll Number: " + s1.getRollNumber());

        Teacher t1 = new Teacher("Mohit", 20, "Java");
        t1.display();
        //How you can fix it?
        //t1.setAddress("Bla Bal 1");

//        System.out.println("Name: " + t1.getName());
//        System.out.println("Age: " + t1.getAge());
//        System.out.println("Subject: " + t1.getSubject());
    }
}


// The order of Constructor call will be from child to the parent
// Instance variable initialize will from parent to child
