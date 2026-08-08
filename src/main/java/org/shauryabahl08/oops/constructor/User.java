package org.shauryabahl08.oops.constructor;

public class User {

    private String name;

    private int age;

    // address, phoneNumber, email ...7

    // Default Constructor public User() {}
    // Default constructor is provided by java if we don't create any constructor

    // Constructor
    // it's name is same as class name
    // it doesn't have any return type
    // it also uses access modifier
    // this is a keyword to help you initialize the instance variable with the same name as parameter

    // Constructor overloading - when a class has more than 1 constructor
    public User(String name, int age) {
        // variable preference
        this.name = name;
        this.age = age;
    }

    public User(String name) {
        this.name = name;
    }

    public User(int age) {
        this.age = age;
    }

    // default contractor
    public User() {
        System.out.println("Hi I'm default constructor");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
    }
}
