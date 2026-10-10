package org.shauryabahl08.oops.polymorphism.runtime;

public class CardPayment extends Payment {

    @Override
    public void pay() {
        System.out.println("Processing payment using Card..");
    }

    public void foo() {
        System.out.println("foo");
    }
}
