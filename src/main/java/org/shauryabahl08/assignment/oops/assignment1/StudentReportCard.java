package org.shauryabahl08.assignment.oops.assignment1;

import java.util.Scanner;

public class StudentReportCard {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your roll number: ");
        int rollNumber = sc.nextInt();
        System.out.println("Enter marks for maths: ");
        int mathMarks = sc.nextInt();
        System.out.println("Enter marks for english: ");
        int englishMarks = sc.nextInt();
        System.out.println("Enter marks for science");
        int scienceMarks = sc.nextInt();

        int totalMarks = calculateTotal(mathMarks, englishMarks, scienceMarks);
        double percentage = calculatePercentage(totalMarks);
        String grade = calculateGrade(percentage);
        displayReport(name, rollNumber, totalMarks, percentage, grade);
    }

    public static int calculateTotal(int mathMarks, int englishMarks, int scienceMarks){
        int totalMarks = mathMarks + englishMarks + scienceMarks;
        return totalMarks;
    }

    public static double calculatePercentage(int totalMarks){
        double percentage = (totalMarks/300.0) * 100.0;
        return percentage;
    }

    public static String calculateGrade(double percentage){
        String grade;
        if (percentage >= 90){
            grade = "A";
        }
        else if (percentage >= 75){
            grade = "B";
        }
        else if (percentage >= 60){
            grade = "C";
        }
        else if (percentage >= 40){
            grade = "D";
        }
        else {
            grade = "F";
        }
        return grade;
    }

    public static void displayReport(String name, int rollNumber, int totalMarks, double percentage, String grade){
       System.out.println("Student Name : " + name);
       System.out.println("Roll No : " + rollNumber);
       System.out.println();
       System.out.println("Total Marks : " + totalMarks);
       System.out.println("Percentage : " + percentage + "%");
       System.out.println();
       System.out.println("Grade : " + grade);
    }
}
