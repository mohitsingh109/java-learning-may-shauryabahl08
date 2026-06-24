package org.shauryabahl08.functions;

public class Test2 {

    // local variable
    public static void main(String[] args) {

        int value = 10;
        System.out.println("Value before increment: " + value); // 10
        increment(value); // calling the function
        decrement(value);
        System.out.println("Value after increment: " + value); // 10
    }

    public static void increment(int value) {
        // value is local variable to increment function
        value++;

        System.out.println("Value inside increment: " + value); // 11
    }

    public static void decrement(int somethingElse) {
        // somethingElse is local variable to increment function
        somethingElse--;

        System.out.println("somethingElse inside decrement: " + somethingElse); // 9
    }
}
