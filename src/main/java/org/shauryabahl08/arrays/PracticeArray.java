package org.shauryabahl08.arrays;

public class PracticeArray {

    public static void main(String[] args) {

        int[] arr = {10, 2, 30, 54, 50};
        System.out.println(findMax(arr));

        int[] arr2 = {-10, -2, -30, -54, -50};
        System.out.println(findMax(arr2));
    }

    public static int findMax(int[] arr) {
        int maxMemory = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] > maxMemory) {
                maxMemory = arr[i];
            }
        }

        return maxMemory;
    }
}
