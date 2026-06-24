package org.shauryabahl08.functions;

import java.util.Scanner;

public class MenuSystem {

    public static void displayMenu() {
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check balance");
        System.out.println("4. Exit");
    }

    public static int userInput() {
        System.out.println("Please enter your choice: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        return choice;
    }

    public static int depositAmount(int currentBalance, int amount) {
        if (amount > 0) {
            currentBalance += amount;
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
        return currentBalance;
    }

    public static int withdrawAmount(int currentBalance, int amount) {
        if (amount > 0 && amount <= currentBalance) {
            currentBalance -= amount;
        } else if (amount > currentBalance) {
            System.out.println("Insufficient balance. Please enter a valid amount.");
        } else {
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
        }
        return currentBalance;
    }

    public static void main(String[] args) {
        int balance = 100;
        while (true) {
            displayMenu();
            int choice = userInput();
            if (choice == 1) {
                balance = depositAmount(balance, 30);
            } else if (choice == 2){
                balance = withdrawAmount(balance, 50);
            } else if (choice == 3) {
                System.out.println("Current balance: " + balance);
            } else if (choice == 4) {
                System.out.println("Exiting the program...");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
