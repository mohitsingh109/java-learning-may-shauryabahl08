package org.shauryabahl08.oops.encapsulation;

public class RunMyCode {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Shaurya", 100);
        //valid user
        //account.accountHolder = "Shaurya";
        //account.balance = 100;
        //account.setBalance(100);

        // hacker & mistake by user?
        //account.balance = -1000000;
        //account.setBalance(-10000);
        //account.setBalance(1000); // hack Shaurya
        //System.out.println("Balance: " + account.balance);

        System.out.println("Balance: " + account.getBalance());
    }
}
