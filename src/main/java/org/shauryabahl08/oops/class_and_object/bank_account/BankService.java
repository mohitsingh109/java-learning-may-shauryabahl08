package org.shauryabahl08.oops.class_and_object.bank_account;

public class BankService {

    public static void main(String[] args) {
        BankAccount[] bankAccounts = new BankAccount[3];

        BankAccount acc1 = new BankAccount();
        acc1.accountNumber = "12345";
        acc1.holderName = "Shaurya";
        acc1.balance = 100;

        BankAccount acc2 = new BankAccount();
        acc2.accountNumber = "67890";
        acc2.holderName = "Mohit";
        acc2.balance = 56;


        BankAccount acc3 = new BankAccount();
        acc3.accountNumber = "43534";
        acc3.holderName = "Aman";
        acc3.balance = 78;

        bankAccounts[0] = acc1;
        bankAccounts[1] = acc2;
        bankAccounts[2] = acc3;


    }

    //targetAccountNumber = 12345
    public static void deposit(BankAccount[] bankAccounts, String targetAccountNumber, double amount) {
        for(BankAccount acc : bankAccounts) { // For each loop
            if(targetAccountNumber.equals(acc.accountNumber)) {
                acc.deposit(amount); // I'm calling the behavior of that object
            }
        }
    }


    public static BankAccount findAccount(BankAccount[] bankAccounts, String targetAccountNumber) {
        for(BankAccount acc: bankAccounts) {
            if(targetAccountNumber.equals(acc.accountNumber)) {
                return acc;
            }
        }

        return null; // we'll discuss this later
    }
}
