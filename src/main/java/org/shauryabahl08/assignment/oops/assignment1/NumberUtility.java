package org.shauryabahl08.assignment.oops.assignment1;

import java.util.Scanner;
// return is used to break the function / to end the function call.
public class NumberUtility {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = sc.nextInt();
    }

    public static boolean isEven(int number){
        return number % 2 == 0;
    }

    public static boolean isPrime(int number){
        for(int i = 2; i < number; i++){

            if(number % i == 0){
                return false;
            }

        }
        return true;
    }

    public static int reverseNumber(int number){
        int reverseNumber = 0;
        while(number > 0){
            reverseNumber = reverseNumber * 10 + number % 10;
            number = number/10;
        }
        return reverseNumber;
    }
}
