package org.shauryabahl08.arrays;

public class ArrayLearning {

    public static void main(String[] args) {
        String[] name = {"Mohit", "Aman", "Ayan", "Arjun"};
        // String[] name = fetch data from db
        // what is the length/size of the array?
        System.out.println(name.length);
        // Array is used to store list of values/ multiple values
        // Array index always start from 0
        // Array is fixed in size
        // Array are all about getting using by for loop

        String value = name[1];
        System.out.println(value);
        System.out.println(name[3]);
        //Task: print all the names
        printArray(name);
        //update a value in an array
        name[2] = "Aryan";
        printArray(name);

        // What are differt ways to create an array?
        // direct init
        int[] numbers = {1, 2, 3, 4, 5};
        // create empty array
        int[] marks = new int[5]; // array that can store 5 values
        marks[0] = 10;
        marks[1] = 40;
        marks[2] = 50;
        marks[3] = 45;
        marks[4] = 65;
        //marks[50] = 565; we'll get an error
        // {10, 40, 50, 45, 65}??
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }

    public static void printArray(String[] name) {
        System.out.println("=======================");
        for(int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        System.out.println("=======================");
    }
}
