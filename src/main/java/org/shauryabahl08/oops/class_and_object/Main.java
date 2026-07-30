package org.shauryabahl08.oops.class_and_object;

public class Main {

    public static void main(String[] args) {
        // I need to fill student template
        // Create a student object
        //<DT> <VN> = new <DT>()
        // creating an object of the student class
        Student stu1 = new Student();
        // new Student(); ---> creating an object in memory
        // filing the data
        stu1.name = "shaurya";
        stu1.age = 18;
        stu1.rollNumber = 25;
        stu1.address = "ABC";

//        stu1.study();
//        stu1.play();
//
//        System.out.println("Student name: " + stu1.name);
//        System.out.println("Student age: " + stu1.age);
//        System.out.println("Student roll number: " + stu1.rollNumber);

        Student stu2 = new Student();
        stu2.name = "Mohit";
        stu2.age = 25;
        stu2.rollNumber = 34;
        stu2.address = "XYZ";

        Student[] students = {stu1, stu2};
        searchStudentByRollNumber(students, 25);

    }

    public static void searchStudentByRollNumber(Student[] students, int rollNumber) {

        for(Student s: students) { // for each
            if(s.rollNumber == rollNumber) {
                System.out.println("Found the student");
                System.out.println("Student name: " + s.name);
                System.out.println("Student age: " + s.age);
                System.out.println("Student roll number: " + s.rollNumber);
                System.out.println("Student address: " + s.address);
            }
        }
    }
}
