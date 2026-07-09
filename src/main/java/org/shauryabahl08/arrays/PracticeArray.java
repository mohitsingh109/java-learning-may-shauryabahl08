package org.shauryabahl08.arrays;

public class PracticeArray {

    public static void main(String[] args) {

        int[] arr = {10, 2, 30, 54, 50};
        System.out.println(findMax(arr));
        System.out.println(findMin(arr));

        int[] arr2 = {-10, -2, -30, -54, -50};
        System.out.println(findMax(arr2));
        System.out.println(findMin(arr2));
    }

    public static int findMax(int[] arr) {
        int maxValue = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }

        return maxValue;
    }

    public static int findMin(int[] arr) {
        int minValue = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }

        return minValue;
    }

    public static int sum(int[] arr) {
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }

    public static int product(int[] arr) {
        int prod = 1;

        for(int i = 0; i < arr.length; i++) {
            prod = prod * arr[i];
        }

        return prod;
    }
}
