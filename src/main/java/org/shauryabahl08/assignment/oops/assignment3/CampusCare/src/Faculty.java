package org.shauryabahl08.assignment.oops.assignment3.CampusCare.src;

public class Faculty extends User {

    private String department;

    public Faculty (String userId, String name, String email, String phoneNumber, String department){
        super(userId, name, email, phoneNumber);
        this.department = department;
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    @Override
    public void displayWelcomeMessage(){
        System.out.println("Welcome" + getName() + "! You are teaching 3 courses.");
    }
}
