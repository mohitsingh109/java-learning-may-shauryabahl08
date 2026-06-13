package org.shauryabahl08.loops;

import java.util.Scanner;

public class ContinueBreakLoopV2 {

    public static void main(String[] args) {
        // Break, Continue (it should be used inside the loop)

        // break;

        // I want user to enter up to 100 number, but it's sum
        // should be below <= 500 keep asking next input
        // if user enter negative I don't want to add them to the sum
        // if it's above 500 I don't want to ask any further input from the user

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter your number: ");
            int num = sc.nextInt();
            if (num < 0) {
                System.out.println("Number is negative, skip processing");
                continue; // skip the below code and move to the next iteration
            }
            sum += num;
            System.out.println("Current sum: " + sum);
            if(sum > 500) {
                break;
            }
        }

        System.out.println("Total Sum: " + sum);
    }
}
