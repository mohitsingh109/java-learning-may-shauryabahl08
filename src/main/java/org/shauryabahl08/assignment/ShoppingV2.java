package org.shauryabahl08.assignment;

import java.util.Scanner;

public class ShoppingV2 {

    /*
     * MINI SHOPPING BILL CALCULATOR
     *
     * Create a Java program that works like a shopping bill calculator.
     *
     * Requirements:
     * 1. Ask the user how many products they want to purchase.
     * 2. For each product:
     *      - Enter product name.
     *      - Enter product price.
     *      - Enter quantity.
     * 3. Calculate the total cost of each product.
     * 4. Calculate the grand total of all products.
     * 5. Apply discount rules:
     *      - If bill is above ₹5000, give 10% discount.
     *      - If bill is above ₹10000, give 15% discount.
     * 6. Display:
     *      - Product details
     *      - Subtotal
     *      - Discount amount
     *      - Final payable amount
     *
     * Example:
     *
     * Product 1: Laptop Bag
     * Price: 1000
     * Quantity: 2
     *
     * Product 2: Mouse
     * Price: 500
     * Quantity: 3
     *
     * Subtotal = 3500
     * Discount = 0
     * Final Amount = 3500
     *
     */
    public static void main(String[] arg){
        Scanner sc = new Scanner (System.in);
        System.out.println("How many products do you want to purchase?: ");
        int numberOfProducts = sc.nextInt();
        double grandTotal = 0.0;
       if(numberOfProducts > 0){
           for(int i = 1; i <= numberOfProducts; i++){
               sc.nextLine();
               System.out.println("What is the name of your product? ");
               String nameOfProduct = sc.nextLine();
               System.out.println("What is the price of your product? ");
               double priceOfProduct = sc.nextDouble();
               System.out.println("Enter the quantity of products: ");
               int quantityOfProduct = sc.nextInt();
               System.out.println("The product total is: " + (priceOfProduct * quantityOfProduct));
               grandTotal += priceOfProduct * quantityOfProduct;
           }
           System.out.println("Your grand total is: " + grandTotal);
           double discount = 0;
           if (grandTotal >= 10000){
               discount = grandTotal * 0.15;
           }
           else if (grandTotal>= 5000) {
               discount = grandTotal * 0.1;
           }
           System.out.println("Your discount amount is: " + discount);
           System.out.println("Your amount to be payed is: " + (grandTotal - discount));
       }
       else {
           System.out.println("Your value is invalid");
       }
    }
}
