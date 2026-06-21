package org.shauryabahl08.functions;

public class Test {
    // special function that tell java where to start the execution of the program

    // main is the function we created
    public static void main(String[] args) {
        // we are calling the println function
//        System.out.println("Hello World");

        // how to call?
//        welcome(); // calling the welcome function
//        welcome();
//        welcome();

//        greetUser("Mohit"); //calling the greetUser function with argument "Mohit"
//        greetUser("Karan");
//        greetUser("Aman");

//        studentInfo("Rohit", 20);
//        studentInfo("Ankit", 43);

        int sum = Calculator.add(20, 40);
        System.out.println(sum);

        int value = Calculator.sub(50, 32);
        System.out.println(value);

    }

    // how to define a function?
    // AM = Access Modifier
    // RT = what function will return (void means I don't want to return anything)
    // FN = functon name
    // FA = function arguments

    //AM          RT    FN
    //this is function that return nothing and don't take any argument
    public static void welcome() {
        System.out.println("Welcome to functions in java");
    }

    //this is function that return nothing and take one argument of type string
    public static void greetUser(String name) {
        System.out.println("Hello.. " + name + ", welcome to functions in java");
    }

    //this is function that return nothing and take two arguments of type string & int
    public static void studentInfo(String name, int age) {
        System.out.println("Student name: " + name + ", age: " + age);
    }

    // What is function?
    // a block of code that perform a task instead
    // of writing the same code again and again we can
    // write a function and call it whenever we want to perform that task

}
