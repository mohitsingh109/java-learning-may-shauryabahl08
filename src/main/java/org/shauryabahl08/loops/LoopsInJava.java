package org.shauryabahl08.loops;

import java.util.Scanner;

public class LoopsInJava {

    public static void main(String[] args) {
        // Loops stuff in java
        // Anything that is a repeat process we put in loop

        // for, while, do-while

        // 1000 - Hello
        //for(init; <condition>; step operation)
        // bottom to up (step up loop)
//        for(int i = 0; i < 1000 ; i++) {
//            System.out.println("Hello - " + i); // i = 1000 Hello - 0, Hello - 1, Hello - 2
//        }

        // top to bottom (step down loop)
        // 1000, 999, 998 .... 2, 1
//        for(int i = 1000; i > 0; i--) {
//            System.out.println(i);
//        }

//        for(int i = 0; i <= 50; i += 3) {
//            System.out.println(i);
//        }

//        for(int i = 0, j = 0; i < 10 && j < 10; i++, j++) {
//            System.out.println("(I: " + i + " ) (J: " + j + " )");
//        }

        // How many number user want to input
        // Add the validation that number should be > 0
        // we need to run the loop count upto the number user entered
        // take the total sum

        // How many number you need to enter? 3 (user)
        // take 3 time input from the user
        // input 1: 10 (user)
        // input 2: 20 (user)
        // input 3: 30 (user)
        // Sum: 60

        Scanner sc = new Scanner(System.in);
        System.out.println("How many number you need to enter?");
        int count = sc.nextInt(); // 5
        int sum = 0;
        // 0 < count <= 10 - Python support this
        if (count > 0 && count <= 10) {
            for (int i = 1; i <= count; i++) {
                System.out.println("Input " + i + ":");
                int input = sc.nextInt(); // hand
                //sum += input; // sum = sum + input
                sum = sum + input; // sum += input;
                System.out.println("You input: " + input + " Current sum: " + sum);
            }

            System.out.println("Sum : " + sum);
        } else {
            System.out.println("Number should be between 1 to 10");
        }

        System.out.println("I'm outside the loop");

    }
}
