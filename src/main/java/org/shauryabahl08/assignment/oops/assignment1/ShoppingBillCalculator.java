package org.shauryabahl08.assignment.oops.assignment1;

import java.util.Scanner;

public class ShoppingBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Product name: ");
        String productName = sc.nextLine();
        System.out.println("Product price: ");
        double price = sc.nextDouble();
        System.out.println("Product quantity: ");
        int quantity = sc.nextInt();
        double subtotal = calculateSubtotal(price, quantity);
        double gst = calculateGST(subtotal);
        double finalAmount = calculateFinalAmount(subtotal, gst);
        // this is the point where I've all the field required by printBill
        printBill(productName, subtotal, gst, finalAmount);
    }

    public static double calculateSubtotal(double price, int quantity){
        return price * quantity;
    }
    public static double calculateGST(double subtotal){
        return subtotal * 0.18;
    }
    public static double calculateFinalAmount(double subtotal, double gst){
        return subtotal + gst;
    }

    public static void printBill(String pName, double subTotal, double gst, double finalAmount){
        System.out.println("Product: " + pName);
        System.out.println("Subtotal: " + subTotal);
        System.out.println("GST: " + gst);
        System.out.println("Final Amount: " + finalAmount);
    }

}
