package org.shauryabahl08.assignment.oops.assignment1;

import java.util.Scanner;

public class BankAccountSimulator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double balance = 0.0;
        while(true){
            displayMenu();
            System.out.println("Choose your option:");
            int option = sc.nextInt();

            if(option == 1 ){
                System.out.println("Enter the amount you want to deposit: ");
                double depositAmount = sc.nextDouble();
                balance = deposit(balance, depositAmount);
            }
            else if (option == 2){
                System.out.println("Enter the amount you want to withdraw: ");
                double withdrawAmount = sc.nextDouble();
                balance = withdraw(balance, withdrawAmount);
            }
            else if(option == 3){
                checkBalance(balance);
            }
            else if (option == 4){
                break;
            }
            else{
                System.out.println("Invalid Number");
            }
        }

    }
    public static void displayMenu(){
        System.out.println("1. Deposit: ");
        System.out.println("2. Withdraw: ");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public static double deposit(double balance, double amount){
        return balance + amount;
    }

    public static double withdraw(double balance, double amount){
        return balance - amount;
    }

    public static void checkBalance(double balance){
        System.out.println("Your current balance is " + balance);
    }


}

