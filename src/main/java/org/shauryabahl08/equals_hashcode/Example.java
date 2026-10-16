package org.shauryabahl08.equals_hashcode;

public class Example {

    public static void main(String[] args) {

        // == (compare memory address)
        // .equals() (to compare the content of the object)

        // string is immutable in java so if you modify the string it will create a new object
        // MCQ
        String s1 = "ABC";
        String s2 = "ABC";
        // s1 == s2
        if(s1.equals(s2)) {
            System.out.println("Both strings are equal");
        } else {
            System.out.println("Both strings are not equal");
        }
    }
}
