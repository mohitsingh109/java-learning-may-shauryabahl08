package org.shauryabahl08.typecasting;

public class TypeConversion {

    public static void main(String[] args) {
        // What is type casting
        // Converting one data type to another

        // Automatic type casting - wide space
        // No data lose
        // Smaller Datatype --> Lager Datatype

        int age = 10;
        double ageDouble = age;
        System.out.println("Age in double: " + ageDouble);

        char garde = 'A';
        int value = garde; //ASCII value of A = 65
        //ASCII Table
        System.out.println("Value of grade: " + value);

        // Manual type casting - Narrowing
        // larger datatype  ---> Smaller datatype
        // Please explict mention this
        // data lose

        double price = 99.99;
        int intPrice = (int) price;
        System.out.println("Price in int: " + intPrice);
        int valueTen = 10;
        System.out.println((double) valueTen/3);

    }
}
