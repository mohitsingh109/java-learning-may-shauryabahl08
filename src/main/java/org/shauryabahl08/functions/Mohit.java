package org.shauryabahl08.functions;

public class Mohit {

    //<Access Modifier> static <Return Type> <Function Name>(<Parameters>)

    // class function
    public static void greet(String name) {
        System.out.println("Hello " + name);
    }

    public static int add(int a, int b) {
        System.out.println("a: " + a + ", b: " + b); // 10 20
        ++a;
        ++b;
        int sum = a + b;
        return sum;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    // max? between whom?
    public static int max(int a, int b) {
        if( a > b) {
            return a;
        } else {
            return b;
        }
    }
}

// Animal a = getAnimal();