package org.shauryabahl08.exceptions.leasson1;

public class Example {

    public static void main(String[] args) {
        // All exception defined by java
        // Null pointer
        // arithmetic exception
        // stack overflow
        // file not found
        // array index out of bounds

        int[] arr = {1, 2, 3};
        //ArrayIndexOutOfBoundsException
        //System.out.println(arr[3]);

        // why I initialize this to null
        // null means nothing
        //NullPointerException
        String name = null;
        //System.out.println(name.length());

        // string to int
        String value = "abc";
        int age = Integer.parseInt(value); // NumberFormatException

        //int a = "aajha"; // error (compile time error)
    }
}
