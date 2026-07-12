package org.shauryabahl08.arrays;

public class MergeArrayQuestion {

    public static void main(String[] args) {
        // arr1 = [1, 2, 3]
        // arr2 = [4, 5, 6]
        // result = arr1 + arr2
        // result = [1, 2, 3, 4, 5, 6]
        // is array size is fixed or dynamic?
        // fix
        // If we can't modify the array/list size?
        // No
        // create a new array the len you want?
        // result_length = arr1.length + arr2.length

        int[] arr1 = {1, 2, 3, 66, 77};
        int[] arr2 = {4, 5, 6};
        int[] result = merge(arr1, arr2);
        for (int num: result) {
            System.out.print(num + " ");
        }
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int totalElements = arr1.length + arr2.length;
        int[] result = new int[totalElements];

        // arr1 values in result
        for(int i = 0; i < arr1.length; i++) {
            //copy value from arr1 to result
            result[i] = arr1[i];
        }

        // arr2 values in result
        for(int i = 0; i < arr2.length; i++) {
            result[i + arr1.length] = arr2[i];
        }

        return result;
    }
}
