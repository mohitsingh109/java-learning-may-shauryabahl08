package org.shauryabahl08.oops.encapsulation;

// Private --> Only access inside the class
//Getter -> to get the value of all the variable in the class
//Setter --> to set the value of all the variable in the class
public class BankAccount {

    String accountHolder;

    private double balance;

    //Getter function
    public double getBalance() {
        // validate user?
        // password/otp
        // you enter the otp & verified
        return balance;
    }

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }


    //Setter function
//    public void setBalance(double value) {
//        // validate user?
//        // password/otp
//        // you enter the otp & verified
//        if(value > 0) {
//            balance = value;
//        } else {
//            System.out.println("Invalid Balance");
//        }
//    }
}

