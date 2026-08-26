package org.shauryabahl08.oops.polymorphism.compiletime;

public class MathMain {

    public static void main(String[] args) {

        //ploy = Many Forms
        // if this calculator class has 1000 function
        // how you will know what one to call?
        // we should use the calculator class
        // Goal 1:
        // add two int number

        int a = 10;
        int b = 20;

        System.out.println(Calculator.add(a, b));

        // Goal 2:
        // add two float number
        float aa = 10.4f;
        float bb = 10.45f;
        System.out.println(Calculator.add(aa, bb));

        // Goal 3:
        // add three int number
        System.out.println(Calculator.add(1, 2, 3));

        System.out.println(Calculator.add(1, 2, 3, 4));

        // display()
        // diaplay() --> firstname, lastname, age, address
        // diaplay() --> firstname, address
        // diaplay() --> firstname, phone-number
    }
}
