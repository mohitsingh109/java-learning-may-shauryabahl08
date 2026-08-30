package org.shauryabahl08.assignment.oops.assignment3.CampusCare.src;

public class Administrator extends User{

    private String role;

    public Administrator(String userId, String name, String email, String phoneNumber, String role) {
        super(userId, name, email, phoneNumber);
        this.role = role;
    }

    public String getRole(){
        return role;
    }

    public void setRole(String role){
        this.role = role;
    }
    @Override
    public void displayWelcomeMessage(){
        System.out.println("Welcome" + getName() + "! You currently manage 125 students.");
    }

}
