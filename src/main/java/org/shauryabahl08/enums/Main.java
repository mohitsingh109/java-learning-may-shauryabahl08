package org.shauryabahl08.enums;

public class Main {

    public static void main(String[] args) {
        //String status = "Pending";
        OrderStatus status = OrderStatus.PACKED;
        System.out.println("Order status: " + status);


        if(status == OrderStatus.PENDING) {
            System.out.println("Order is pending");
        } else if (status == OrderStatus.PACKED) {
            System.out.println("Order is packed");
        } else {
            System.out.println("Order is not pending");
        }
    }
}
