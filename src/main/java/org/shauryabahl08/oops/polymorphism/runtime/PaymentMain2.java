package org.shauryabahl08.oops.polymorphism.runtime;

public class PaymentMain2 {

    public static void main(String[] args) {

        // Run time poly:
        // Parent can hold the child object but reverse is not allowed

        // Advantage of using
        // Security -> it can only access method that are in the ref object

        // Reference/Data type ---> Object
        makePayment(new UPIPayment("mohit@hdfc.net"));
        makePayment(new WalletPayment());
        makePayment(new CardPayment());

        makePayment1(new UPIPayment("mohit@hdfc.net"));


    }

    public static void printBla(int a) {
        System.out.println(a);
    }

    public static void makePayment(Payment payment) {
        payment.pay(); // which pay??
    }

    public static void makePayment1(UPIPayment payment) {
        payment.pay(); // which pay??
    }
}
