package org.shauryabahl08.operator;

public class Relational {

    public static void main(String[] args) {

        // >, <, >=, <=, ==, !=
        //>, <, >=, <= it's works with number data type (int, double, float...)
        //==, != this can be used by string as well as char
        // It's is used for comparison
        // it's result is always boolean
        int age = 20;
        boolean isAgeGte18 = age > 18;
        System.out.println("Is age greater than 18: " + isAgeGte18);
        System.out.println("Is age less than 18: " + (age < 18));
        System.out.println(age >= 20);
        System.out.println(age <= 20);
        System.out.println(age == 20); //True
        System.out.println(age != 20); // Ture
        System.out.println('A' == 'A'); // True

    }
}
