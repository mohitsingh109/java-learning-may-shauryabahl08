package org.shauryabahl08.assignment.oops.assignment3.CampusCare.src;

public class Course {

    private String courseId;
    private String courseName;
    private String instructor;
    private int credits;
    private int maxStudents;
    private int studentCount;

    public Course (String courseId, String courseName, String instructor, int credits, int maxStudents){
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructor = instructor;
        this.credits = credits;
        this.maxStudents = maxStudents;
        this.studentCount = 0;
    }
}
