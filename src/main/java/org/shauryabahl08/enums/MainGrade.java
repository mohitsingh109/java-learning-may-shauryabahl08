package org.shauryabahl08.enums;

public class MainGrade {
    public static void main(String[] args) {
        // all the enum values?
        // values() --> return every enum value as array
//        int[] arr = {1, 2, 3, 4};
//        Grade[] grades = {Grade.A, Grade.B, Grade.C, Grade.D, Grade.F};
//        for (int value: arr) {
//            System.out.println(value);
//        }
        for(Grade g: Grade.values()) {
            System.out.println(g);
        }

        // ordinal() --> return the index/postion of the enum value
        Grade g = Grade.F;
        System.out.println("Ordinal of " + g + " is: " + g.ordinal());
    }
}
