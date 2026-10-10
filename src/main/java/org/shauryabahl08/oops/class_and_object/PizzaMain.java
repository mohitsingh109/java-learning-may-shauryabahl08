package org.shauryabahl08.oops.class_and_object;

public class PizzaMain {

    public static void main(String[] args) {
        Chef chef = new Chef("Gordon Ramsay", "Good in veg pizza had 15 year of exp");

        Pizza pizza = new Pizza("Farmhouse", "It's a veg pizza", chef, 5);
    }
}
