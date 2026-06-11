package org.shauryabahl08.loops;

import java.util.Scanner;

public class ContinueBreakInLoop {

    public static void main(String[] args) {

        // Continue & Break (You can use this inside the loops)
        Scanner sc = new Scanner(System.in);
//        int sum = 0;
//        for (int i = 1; i < 1000; i++) {
//            System.out.println("Give me the product price: ");
//            int userInput = sc.nextInt();
//            if ((sum + userInput) > 500) {
//                System.out.println("Sum will be above 500 so I don't want to continue");
//                break;
//            }
//            sum += userInput;
//        }
//
//        System.out.println("Sum = " + sum);

//        while(true) { // infinite loop
//            System.out.println("Enter your message or type 'quit' to stop: ");
//            String userText = sc.nextLine();
//
//            if (userText.equals("quit")) {
//                break;
//            }
//
//            System.out.println("User enter: " + userText);
//        }

        int sum = 0;
        int prod = 1;
        for(int i = 0; i < 10; i++) {
            System.out.println("Enter your number: ");
            int num = sc.nextInt();
            if (num % 2 != 0) { // odd condition
                System.out.println("You enter a odd number skip processing");
                continue; // it skip the below code
            }
            System.out.println("Your Number is: " + num);
            sum += num;
            prod *= num;
        }

        System.out.println("Sum = " + sum);
        System.out.println("Prod = " + prod);
    }
}
