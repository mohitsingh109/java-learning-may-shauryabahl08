package org.shauryabahl08.oops.inheritance;

public class Person {

    private String name;

    private int age;

//    private String address;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        //System.out.println("Person constructor is called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // What is method overriding
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        //??
    }

//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }


}
