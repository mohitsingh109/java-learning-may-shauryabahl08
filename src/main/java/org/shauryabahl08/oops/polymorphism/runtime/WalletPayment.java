package org.shauryabahl08.oops.polymorphism.runtime;

public class WalletPayment extends Payment {

    @Override
    public void pay() {
        System.out.println("Processing payment using Wallet...");
    }
}
