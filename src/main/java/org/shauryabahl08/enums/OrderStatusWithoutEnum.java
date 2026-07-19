package org.shauryabahl08.enums;

public class OrderStatusWithoutEnum {

    public static void main(String[] args) {
        // without enums
        String status = "Pending"; // user1
        status = "pendding"; // user2
        status = "PENDING"; // user3
        status = "PendinG";

        // These all are different string. Java won't stop you
        // This leads to bugs

        if(status.equals("Pending") || status.equals("pendding") || status.equals("PENDING")) {
            System.out.println("Order is pending");
        } else {
            System.out.println("Order is not pending");
        }

        // Solution - Enum
        // it is used to define fixed set os values

    }
}
