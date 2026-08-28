package org.shauryabahl08.assignment.array;

import java.util.Scanner;

public class StoreStudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[5];
        for (int i = 0; i < arr.length; i++){
            int marks = sc.nextInt();
            arr [i] = marks;

        }

        for (int num : arr){
            System.out.println(num);

        }
    }
}
