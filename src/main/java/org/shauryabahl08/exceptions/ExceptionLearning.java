package org.shauryabahl08.exceptions;

public class ExceptionLearning {

    // Exception Type:
    // 1. ArithmeticException
    // 2. NumberFormatException
    // 3. ArrayIndexOutOfBoundsException
    // 4. NullPointerException
    // 5. IllegalArgumentException
    public static void main(String[] args) {
        //1. ArithmeticException
//        int a = 10;
//        int b = 0;
//
//        int result = a / b;
//        System.out.println(result);

        //3. ArrayIndexOutOfBoundsException

//        int[] arr = {1, 2, 3};
//        System.out.println(arr[3]);

        // 4. NullPointerException
//        String name = null;
//
//        System.out.println(name.length());

        //2. NumberFormatException
//        String input = "abc"; //"12"
//
//        int number = Integer.valueOf(input);

        // What is exception?
        // How java throw multiple different exceptions?
        // How to throw an exception?

        register("John", 19); // pass
        register("Karan", 17); // error
        register("Aman", 20); // never executed
    }

    public static void register(String name, int age) {

        //How to throw an exception?
        if(age < 18) {
            throw new IllegalArgumentException("Age must be greater than or equal to 18");
        }

        System.out.println("User registered successfully");
    }
}
