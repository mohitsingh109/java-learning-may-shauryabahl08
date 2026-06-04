package org.shauryabahl08.assignment;
import java.util.Scanner;

public class Shopping {
    /*
     * MINI SHOPPING BILL CALCULATOR
     *
     * Create a Java program that works like a shopping bill calculator.
     *
     * Requirements:
     * 1. For product:
     *      - Enter product name.
     *      - Enter product price.
     *      - Enter quantity.
     * 2. Calculate the total cost of the product.
     * 3. Apply discount rules:
     *      - If bill is above ₹5000, give 10% discount.
     *      - If bill is above ₹10000, give 15% discount.
     * 4. Display:
     *      - Product detail
     *      - Subtotal
     *      - Discount amount
     *      - Final payable amount
     *
     * Example:
     *
     * Product Name: Laptop Bag
     * Price: 1000
     * Quantity: 2
     *
     *
     * Subtotal = 2000
     * Discount = 0
     * Final Amount = 2000
     *
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Product name is: ");
        String productName = sc.nextLine();
        System.out.println("Product price is: ");
        double productPrice = sc.nextDouble();
        System.out.println("Product quantity is: ");
        int productQuantity = sc.nextInt();
        double subtotal = productPrice * productQuantity;
        System.out.println("Your subtotal is " + subtotal);

        System.out.println("The name of your product is "+productName+ " and you chose " + productQuantity+ "of them, so your subtotal is " + subtotal);
        double discount = 0;

        if (subtotal > 10000){
            discount = subtotal * 0.15;
        }
        else if (subtotal > 5000){
            discount = subtotal * 0.1;
        }
        System.out.println("Your discount is: " + discount);
        double finalAmount =  subtotal - discount;
        System.out.println("Your final payable amount is: " + finalAmount);
    }
}

