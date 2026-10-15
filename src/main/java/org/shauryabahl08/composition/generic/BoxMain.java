package org.shauryabahl08.composition.generic;

public class BoxMain {

    public static void main(String[] args) {

        // Int Box
        // Double Box
        // String Box

        Box<Integer, String> intBox = new Box<>(10, "Abc");
        /**
         * public class Box {
         *
         *     private Integer value;
         *
         *     public Box(Integer value) {
         *         this.value = value;
         *     }
         *
         *     public Integer get() {
         *        return value;
         *     }
         * }
         */

        Box<Double, Integer> doubleBox = new Box<>(11.3, 34);
        Box<String, Boolean> stringBox = new Box<>("Test", true);
    }
}
