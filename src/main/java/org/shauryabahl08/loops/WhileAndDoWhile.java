package org.shauryabahl08.loops;

public class WhileAndDoWhile {

    public static void main(String[] args) {

        /**
         * while(<condtion>) {
         *     //body of while loop
         * }
         *
         * do {
         *     //body of while loop
         * }while(<condtition>);
         */
        //----------------do while (0 %)-------------------------
        // do while first run the body and then check the condition
        int i = 50;

        do {
            System.out.println("Hello i: " + i);
            i++;
        }while (i < 10);

        //----------------while (100 %)-------------------------
        // while first check the condition then run the body
        int j = 50;

        while (j < 10) {
            System.out.println("Hello j: " + j);
            j++;
        }
    }
}
