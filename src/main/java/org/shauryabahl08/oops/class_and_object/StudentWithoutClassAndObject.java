package org.shauryabahl08.oops.class_and_object;

public class StudentWithoutClassAndObject {

    public static void main(String[] args) {
        // I want you to store 10 student
        // name
        // age
        // rollNumber
        // address

        // if I give you a task to find user (name, age, rollNumber) with its roll number
        // rollNumber = 25

        // loop over rollNumber array and find index where it's value is 25
        // after we find

        // I need you to search student by age in range age > 10 and age < 20 return all the student

        String[] name = new String[10];
        int[] age = new int[10];
        int[] rollNumber = new int[10];

        name[0] = "Mohit";
        age[0] = 25;
        rollNumber[0] = 35;

        name[1] = "Shaurya";
        age[1] = 18;
        rollNumber[1] = 25;

        //... other student

        for (int i= 0; i < rollNumber.length; i++) {
            if (rollNumber[i] == 25) {
                System.out.println("Index: " + i);
            }
        }
    }
}
