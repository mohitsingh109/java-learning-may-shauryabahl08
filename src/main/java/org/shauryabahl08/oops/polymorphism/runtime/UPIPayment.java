package org.shauryabahl08.oops.polymorphism.runtime;

public class UPIPayment extends Payment {

    @Override
    public void pay() {
        System.out.println("Processing payment using UPI..");
    }

    public void send() {
        System.out.println("Processing payment using UPI..");
    }
}
