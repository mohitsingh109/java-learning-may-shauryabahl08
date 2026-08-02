package org.shauryabahl08.oops.class_and_object.bank_account;

public class BankAccountWithoutOops {

    public static void main(String[] args) {

        String[] accountNumbers = new String[3];
        String[] holderNames = new String[3];
        double[] balances = new double[3];

        // shaurya
        accountNumbers[0] = "12345";
        holderNames[0] = "shaurya";
        balances[0] = 100;

        // Mohit
        accountNumbers[1] = "67890";
        holderNames[1] = "Mohit";
        balances[1] = 56;

        // Aman
        accountNumbers[2] = "26436";
        holderNames[2] = "Aman";
        balances[2] = 78;

        // if I need to create a deposit operation what I need to do?
        // i need account number also?

        deposit(balances, accountNumbers, holderNames, "67890", 5.5);
    }

    // Hi shaurya we've successful deposited <amount> in your account
    public static void deposit(double[] balances, String[] holderNames, String[] accountNumbers, String targetAccountNumber, double amount) {

        if (amount <= 0) {
            System.out.println("Amount can't be negative");
            return;
        }

        for(int i = 0; i < accountNumbers.length; i++) {
            if(targetAccountNumber.equals(accountNumbers[i])) {
                balances[i] = balances[i] + amount;
                System.out.println("Hi " + holderNames[i] + " we've successful deposited " + amount + " in your account");
            }
        }
    }

    // find a account by it's account number give me all the details??
}
