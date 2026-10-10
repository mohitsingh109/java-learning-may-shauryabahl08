package org.shauryabahl08.functions;

public class Test3 {
    //JVM --> Test3.main(args)
    public static void main(String[] args) {
        // 5 person
        String[] names = {"John", "Jane", "Bob", "Alice", "Mike"};
        //                 name
//        for(String name: names) {
//            Mohit.greet(name);
//        }

        int a = 10;
        int b = 20;
        int sum = Mohit.add(b, a);
        String result = "Sum: " + sum;
        System.out.println(result);
        System.out.println("a: " + a + ", b: " + b);


//        int sum = Mohit.add(a, b);
//        System.out.println("Sum: " + sum); // 32
//        System.out.println("a: " + a + ", b: " + b); // a: 11, b: 21

//        sum = Mohit.add(11, 15);
//        System.out.println("Sum: " + sum);

        // non primitive data type
        String name = null;
    }


    public static String toString(int[] row) {
        // row = {1, 2, 3}
        String result = ""; // "1 2 3 "
        int n = row.length; // 3
        for (int i = 0; i < n; i = i + 1) // i = 1
            result = result + row[i] + " "; // "1 " + 2 + " "
        return result;
    }
}

