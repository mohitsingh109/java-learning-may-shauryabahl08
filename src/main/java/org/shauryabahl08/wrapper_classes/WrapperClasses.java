package org.shauryabahl08.wrapper_classes;

public class WrapperClasses {

    // Java --> Not a pure object-oriented programming language
    // what is pure object-oriented programming language?
    // if everything is done using class & object

    public static void main(String[] args) {
        // why java is not pure object-oriented programming language?
        // because it supports primitive data types

        int age = 10; // ??
        double amount = 10.55;
        String name = "Mohit"; // this is fulfilled the  pure object-oriented programming language rule

        Integer age1 = 10;
        Double amount1 = 10.55;
        Character ch = 'a';
        Long l = 10L;
        Short s = 11;
        Float f = 33.4f;
        Boolean b = false;

        String qty = "545";

        // String qty = "545"; to int using primitive data type

        Integer qty1 = Integer.valueOf(qty); // convert string to integer
        qty1 += 10;
        System.out.println(qty1);

        //Future topic: When we learn about collection in java it only supports class

    }
}
