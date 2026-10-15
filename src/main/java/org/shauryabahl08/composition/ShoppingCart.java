package org.shauryabahl08.composition;

import java.util.List;

public class ShoppingCart {

    private String number;

    private List<Product> products; // composition

    public ShoppingCart(String number, List<Product> products) {
        this.number = number;
        this.products = products;
    }

    public String getNumber() {
        return number;
    }

    public List<Product> getProducts() {
        return products;
    }
}

// ArrayList, LinkedList

