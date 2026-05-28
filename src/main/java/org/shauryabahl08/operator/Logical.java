package org.shauryabahl08.operator;

public class Logical {

    public static void main(String[] args) {
        // && (and), || (or), !
        // when we've multiple condition exist we need to use this

        // AND &&
        // Both condition should be true to get true
        // T T T
        // F T F
        // T F F
        // F F F

        int age = 25;
        boolean hasLicense = true;

        boolean shouldDrive = age >= 18 && age < 65 && hasLicense == true;
        System.out.println("Should drive: " + shouldDrive);

        hasLicense = false;
        shouldDrive = age >= 18 && hasLicense == true;
        System.out.println("Should drive: " + shouldDrive);

        // OR ||
        // Only one condition must be true
        // T T T
        // F T T
        // T F T
        // F F F
        int age1 = 67;
        boolean shouldNotDrive = age1 < 18 || age1 > 65 || age1 == 45;
        System.out.println("Should not drive: " + shouldNotDrive);

        int accountBalance = 1200;
        int amountToPaid = 200;
        boolean isActive = true;
        boolean canNotPurchase =  amountToPaid > accountBalance  || isActive == false;
        System.out.println("Can not purchase: " + canNotPurchase);

        // ! (reverse the ans)

        String name = "Mohit";

        boolean nameMatch = !(name == "Mohit");
        System.out.println("Name match: " + nameMatch);


        // Short Circuit Evaluation
        int marks = 25;

        boolean resultAnd = marks > 50 && marks < 100;

        boolean resultOr = marks != 30 || marks == 25 || marks < 50;
    }
}
