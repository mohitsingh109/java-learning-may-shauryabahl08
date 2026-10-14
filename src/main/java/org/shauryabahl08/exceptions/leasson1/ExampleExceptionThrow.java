package org.shauryabahl08.exceptions.leasson1;

public class ExampleExceptionThrow {

    public static void main(String[] args) {
        // if age is below 18 we want to throw an exception
        validateAgeFor(23);
        validateAgeFor(17);
        validateAgeFor(55);
    }

    public static void validateAgeFor(int age) {
        if (age < 18) {
            throw new InvalidAgeException("Age cannot be less than 18");
        }
        System.out.println("Age is valid: " + age);
    }
}
