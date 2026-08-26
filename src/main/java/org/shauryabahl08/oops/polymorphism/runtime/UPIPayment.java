package org.shauryabahl08.oops.polymorphism.runtime;

public class UPIPayment extends Payment {

    private String upiId;

    public UPIPayment(String upiId) {
        super();
        this.upiId = upiId;
    }

    @Override
    public void pay() {
        System.out.println("Processing payment using UPI..");
    }

    public void send() {
        System.out.println("Processing payment using UPI..");
    }

    public String getUpiId() {
        return upiId;
    }

    public void setUpiId(String upiId) {
        this.upiId = upiId;
    }
}
