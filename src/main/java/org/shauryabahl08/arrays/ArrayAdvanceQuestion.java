package org.shauryabahl08.arrays;

public class ArrayAdvanceQuestion {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        reverse(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverse(int[] arr) {
        // 5, 2, 3, 4, 1
        //       lr
        // 5, 4, 3, 2, 1
        // two pointer approach
        // Data Structure & Algo - (Java)
        int left = 0;
        int right = arr.length - 1;

        while(left < right) {
            // this has some problem
            int temp = arr[left]; // 1
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
