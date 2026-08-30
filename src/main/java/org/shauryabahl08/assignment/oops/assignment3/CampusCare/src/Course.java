package org.shauryabahl08.assignment.oops.assignment3.CampusCare.src;

public class Course {

    private String courseId;
    private String courseName;
    private Faculty instructor; // good to store the name or the object
    private int credits;
    private int maxStudents;
    private int studentCount;
    private Student[] students;

    public Course(String courseId, String courseName, Faculty instructor, int credits, int maxStudents){
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructor = instructor;
        this.credits = credits;
        this.maxStudents = maxStudents;
        this.students = new Student[maxStudents];
        this.studentCount = 0;
    }


    public boolean addStudent(Student student) {
        // add validation

        if(studentCount >= maxStudents) {
            System.out.println("Course is full. No seats available");
            return false;
        }

        students[studentCount] = student;
        studentCount++;
        return true;
    }

    public void removeStudent(Student student) {

    }

    private int getAvailableSeats() {
        return maxStudents - studentCount;
    }

    public void displayCourse() {
        System.out.println("--------------------------");
        System.out.println("Course ID       : " + courseId);
        System.out.println("Course Name     : " + courseName);
        System.out.println("Instructor      : " + instructor.getName());
        System.out.println("Credits         : " + credits);
        System.out.println("Students        : " + studentCount);
        System.out.println("Available Seats : " + getAvailableSeats());
    }
}
