package org.shauryabahl08.question;

public class DeleteValueFromArray {

    public static void main(String[] args) {

        int[] arr = {10, 45, 23, 54, 96};
        int valueToDelete = 10;

        // find the index of the value to delete
        // this for loop will help me find the index of the value
        int indexToDelete = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == valueToDelete) {
                indexToDelete = i;
                break;
            }
        }

        if(indexToDelete != -1) { // element is found
            int newLength = arr.length - 1;
            int[] newArr = new int[newLength];

            for(int i = 0, j = 0; i < arr.length; i++) {
                if(i != indexToDelete) {
                    newArr[j] = arr[i];
                    j++;
                }
            }

            arr = newArr; // update the reference to the new array
        }

        for(int val: arr) {
            System.out.println(val);
        }
    }
}
