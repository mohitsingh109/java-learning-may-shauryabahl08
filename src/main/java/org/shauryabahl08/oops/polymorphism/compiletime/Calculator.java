package org.shauryabahl08.oops.polymorphism.compiletime;

public class Calculator {

    // how we can create a class function that will help with
    // below requirement
    // I want a function that add two int
    // I want a function that add two float
    // I want a function that add three int
    // I want a function that sub two double

    // Method overloading == compile time poly
    // Function with same name but different argument is called Method overloading
    public static int add(int a, int b) {
        return a + b;
    }

    public static float add(float a, float b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

}
