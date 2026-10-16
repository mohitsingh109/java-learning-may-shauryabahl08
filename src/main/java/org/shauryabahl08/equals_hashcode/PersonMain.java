package org.shauryabahl08.equals_hashcode;

public class PersonMain {

    public static void main(String[] args) {

        Person p1 = new Person("John 1", "jhon@gmail.com", 25);
        Person p2 = new Person("John 1", "jhon@gmail.com", 25);

        // this refer to the current object who is calling the function
//        p1.setName("John Doe"); // this refers the p1 inside the class
//        p2.setName("John Doe");

        // p1 & p2 are different object
        // they have different memory location

        // who is calling the equals method?
        // p1
        // what i.m passing the the aarg?
        // object of person class
        System.out.println("P1 class name: " + p1.getClass());
        if (p1.equals(p1)) {
            System.out.println("Both persons are equal");
        } else {
            System.out.println("Both persons are not equal");
        }
    }
}
