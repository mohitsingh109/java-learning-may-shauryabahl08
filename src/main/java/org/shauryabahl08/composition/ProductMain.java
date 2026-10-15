package org.shauryabahl08.composition;

import java.util.ArrayList;
import java.util.List;

public class ProductMain {

    public static void main(String[] args) {

        Barcode barcode = new Barcode("1234567890");
        Product product = new Product("Laptop", 999.99, barcode);

        List<Product> products = new ArrayList<>();
        //List<String> products = new ArrayList<>();
        //List<Integer> intArr = new ArrayList<>();
        //List<Double> products = new ArrayList<>();
        // What is the other option we can do?
        // IntList
        // DoubleList
        // FloatList
        // ProductList
        // ... 1000+ more
        products.add(product);

        ShoppingCart shoppingCart = new ShoppingCart("CART123", products);

        // this is never use
        ArrayList<Object> arr = new ArrayList<>(); // Object

        arr.add(1); // 0
        arr.add("Hello"); // 1
        arr.add(product); // 2
        arr.add(1.2);

        Integer i = (Integer) arr.get(0);
        Product p = (Product) arr.get(2);
    }
}
