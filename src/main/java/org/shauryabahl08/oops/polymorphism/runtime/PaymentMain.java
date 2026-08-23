package org.shauryabahl08.oops.polymorphism.runtime;

public class PaymentMain {

    public static void main(String[] args) {

        // The Normal Way

        Payment payment1 = new UPIPayment();
        test(payment1);
        Payment payment2 = new CardPayment();
        test(payment2);
        Payment payment3 = new WalletPayment();
        test(payment3);

        // What is the Reference type/Data type?
        // Payment -- Yes

        // What is the actual object?
        // UPIPayment -- Yes

        // Reference                Object
        // Payment payment -------> UPIPayment
         //payment.pay(); // ??
        // will going to execute the pay of Payment class or Pay or UpiPayment
        // It's will be going to call the pay of UPI
        // At run time java looks at the actual object and select
        // the appropriate method that should be called

    }

    public static void test(Payment payment) {
        payment.pay();
        //payment.send(); -- No
        // do you know which pay() it will call?
    }
}
