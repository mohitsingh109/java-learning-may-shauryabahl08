package org.shauryabahl08.arraylist;

import java.util.ArrayList;

public class ArrayListLearning {

    public static void main(String[] args) {
        //1: size - array cannot increase or decrease in size
        //2: index - we need to know the index
        int[] arr = new int[2];

        // 20, 40
        arr[0] = 20;
        arr[1] = 40;

        // 50
        // [] --> ArrayList<>
        // int --> Integer
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20); // 0
        list.add(40); // 1
        list.add(50); // 2
        list.add(60); // 3

        //list.size() --> arr.length
        //list.get(i) --> arr[i]
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list.indexOf(50));
    }
}
