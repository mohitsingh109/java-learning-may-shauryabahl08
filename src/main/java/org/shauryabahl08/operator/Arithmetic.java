package org.shauryabahl08.operator;

import java.util.SortedMap;

public class Arithmetic {

    // +, -, /, *, %, ++, -- (int, short, long, double, float)

    public static void main(String[] args) {
        int a = 25;
        int b = 6;

        int add = a + b;
        System.out.println("Add: " + add);

        int sub = a - b;
        System.out.println("Sub: " + sub);

        int mul = a * b;
        System.out.println("Mul: " + mul);

        int divide = a / b;
        System.out.println("Divide: " + divide);

        int mod = a % b;
        System.out.println("Mod: " + mod);

        a++;
        // a = a + 1
        System.out.println("Increment a: " + a);

        b--;
        // b = b - 1
        System.out.println("Decrement b: " + b);

        float num1 = 10.4f;
        float num2 = 3.2f;
        float num3 = 4.5f;

        float result = num1 + num2 + num3;
        System.out.println("Result: " + result);

        int a1 = 10;
        int b1 = 10;
        int c1 = 10;

        int total = a1++ + b1++ + c1++;
        //total = 10++ + 10++ + 10++
        //total = 10 + 10 + 10 (30)
        //int total = ++a1 + ++b1 + ++c1; // this give 33

        System.out.println("Total: " + total);
        System.out.println("a1: " + a1);
        System.out.println("b1: " + b1);
        System.out.println("c1: " + c1);

        // BODMAS
        int guess = 10 - 6 * 2 / 3 * 4 - 4;
        System.out.println("Guess: " + guess);
    }
}
