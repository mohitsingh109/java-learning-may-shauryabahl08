package org.shauryabahl08.composition;

public class Product {

    private String name;

    private double price;

    private Barcode barcode; // composition

    public Product(String name, double price, Barcode barcode) {
        this.name = name;
        this.price = price;
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Barcode getBarcode() {
        return barcode;
    }
}
