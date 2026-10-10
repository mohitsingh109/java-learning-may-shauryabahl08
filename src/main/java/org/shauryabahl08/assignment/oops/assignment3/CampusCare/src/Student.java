package org.shauryabahl08.assignment.oops.assignment3.CampusCare.src;

public class Student extends User {

   private String major;

   public Student (String userId, String name, String email, String phoneNumber, String major){
       super(userId, name, email, phoneNumber);
       this.major = major;
   }

   public String getMajor(){
       return major;
   }

   public void setMajor(String major){
       this.major = major;
   }

   @Override
    public void displayWelcomeMessage(){
       System.out.println("Welcome" + getName() + "! You have 4 courses enrolled.");
    }
}
