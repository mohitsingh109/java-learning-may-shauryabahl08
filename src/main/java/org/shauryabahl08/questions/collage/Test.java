package org.shauryabahl08.questions.collage;

public class Test {

    public static void main(String[] args) {
        Student s1 = new Student("John Doe", "12345");
        Student s2 = new Student("John Doe", "12345");
        String bla = "Bla Bla"; // Object is parent of String
        // equals is coming from Object
        // because every class parent is Object class
        // s1 == s2 will check memory address
        if (s1.equals(bla)) { // memory address
            System.out.println("Both are same");
        } else {
            System.out.println("Both are not same");
        }

    } // s1.equals(s2) -->
}
