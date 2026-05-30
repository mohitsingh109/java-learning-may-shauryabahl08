package org.shauryabahl08.control_flow;

public class IfControlFlow {

    public static void main(String[] args) {
        // if statement
        int age = 67;
        /**
         * inside if statement we always need to pass the boolean value
         */
        if (age >= 18 && age < 65)
        {
            System.out.println("You are eligible to drive");
            System.out.println("Happy Drive");
        }


        // if else statement
        // ATM Balance
        int karanAccountBalance = 10000;

        int amountToTake = 5000;

        if (karanAccountBalance >= amountToTake) {
            System.out.println("Amount withdrawn: " + amountToTake);
        } else {
            System.out.println("Insufficient balance. Available balance: " + karanAccountBalance);
        }

        // 90 > 'A'
        // 75 - 90: 'B'
        // 50 - 74: 'C'
        // below 50 'D'
        // if, elseif, elseif, else

        int mark = 78;

        if (mark > 90) {
            System.out.println("Grade: A");
        } else if(mark >= 75 && mark <= 90) {
            System.out.println("Grade: B");
        } else if(mark >= 50 && mark <= 74) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }
    }
}
