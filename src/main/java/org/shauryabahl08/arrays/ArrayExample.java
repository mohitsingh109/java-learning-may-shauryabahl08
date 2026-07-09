package org.shauryabahl08.arrays;

import java.util.Scanner;

public class ArrayExample {

    public static void main(String[] args) {
        int[] arr = {10, 33, 21, 45, 62, 78, 21, 45, 90};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value you want to search: ");
        int value = sc.nextInt(); // 21 88
        int index = searchValue(arr, value);
        System.out.println(index); // 2, -1
        countEvenOdd(arr);
    }

    // I want to print odd and even number count in the array
    // int[] arr = {10, 33, 21, 45, 62, 78, 21, 45, 90};
    // Even Count: 4
    // Odd Count: 5
    public static void countEvenOdd(int[] arr) {
        int countEven = 0;
        int countOdd = 0;

//        for(int i = 0; i < arr.length; i++) {
//            if(arr[i] % 2 == 0) {
//                countEven++;
//            } else {
//                countOdd++;
//            }
//         }
        // int[] arr = {10, 33, 21, 45, 62, 78, 21, 45, 90};
        //for each loop (Array)
        for(int num : arr) {
            if(num % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        System.out.println("Even Count: " + countEven);
        System.out.println("Odd Count: " + countOdd);
    }


    public static int searchValue(int[] arr, int value) {
        // int[] arr = {10, 33, 21, 45, 62, 78, 21, 45, 90};
        // value = 93
        for(int i = 0; i < arr.length; i++) {
            if(value == arr[i]) {
                return i;
            }
        }

        return -1; // this will run only if numer not found
    }
}
