package org.shauryabahl08.functions;

public class VariableType {

    public static void main(String[] args) {
//        int value = 10;
//        //System.out.println("Value before calling dummy function: " + value);
//        dummy(value); // calling
//        dummy(15);
//        dummy(18);
//        System.out.println("Value after calling dummy function: " + value);

//        int a = 10;
//        int b = 11;
//        int c = 12;
//
////        int funFunctionResult = funFunction(a, b, c);
////        int funFunctionResult = funFunction(b, a, c);
//        int funFunctionResult = funFunction(c, a, b);
//        System.out.println("Result of funFunction: " + funFunctionResult);
        // Print: a: 12 b: 10 c: 11, Result of funFunction: 33

        String result = funFunction2(5, "Hello", 10);
        System.out.println("Result: " + result); //Result: Result: 15, String: Hello
    }

    public static String funFunction2(int a, String b, int c) {
        return "Result: " + (a + c) + ", String: " + b;
    }

    public static int funFunction(int a, int b, int c) {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        return a + b + c;
    }

    // define
    public static void dummy(int value) {
        value ++;
        System.out.println("Value inside dummy function: " + value);
    }
}
