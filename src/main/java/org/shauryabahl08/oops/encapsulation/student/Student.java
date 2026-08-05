package org.shauryabahl08.oops.encapsulation.student;

//Access Modifier --> public, private, protected, default
public class Student {

    // Access Modifier
    // Instance ==> Object of this class
    // Instance variable
    private String name;

    private int age;

    // Class variable
    private static String schoolName = "ABC Public school";

    // Class function
    public static String getSchoolName(){
        return schoolName;
    }

    public static void setSchoolName(String value){
        schoolName = value;
    }

    // Instance methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String value) {
        name = value;
    }

    public void setAge(int value) {
        if(value > 0) {
            age = value;
        }
    }
}
