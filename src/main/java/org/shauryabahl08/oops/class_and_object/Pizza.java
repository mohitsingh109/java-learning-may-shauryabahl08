package org.shauryabahl08.oops.class_and_object;

public class Pizza {

    private String name;

    private String description;

    private Chef chef;

    private String[] toppings;

    private int currentToppingIndex;

    public Pizza(String name, String description, Chef chef, int toppingsCount) {
        this.name = name;
        this.description = description;
        this.chef = chef;
        this.toppings = new String[toppingsCount];
        this.currentToppingIndex = 0;
    }

    public boolean contains(String topping) {
        for(int i = 0; i < currentToppingIndex; i++) {
            if (toppings[i].equals(topping)) {
                return true;
            }
        }
        return false;
    }

    public void addTopping(String topping) {

        if (toppings.length == currentToppingIndex) {
            System.out.println("Cannot add more toppings. Maximum limit reached.");
            return;
        }

        if(contains(topping)) {
            System.out.println("Topping already exists.");
            return;
        }

        toppings[currentToppingIndex] = topping;
        currentToppingIndex++;
    }

    public void displayPizza() {
        System.out.println("--------------------------");
        System.out.println("Pizza Name     : " + name);
        System.out.println("Description    : " + description);
        System.out.println("Chef           : " + chef.getName());
        System.out.println("--------------------------");
    }

}
