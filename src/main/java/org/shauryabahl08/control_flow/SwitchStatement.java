package org.shauryabahl08.control_flow;

public class SwitchStatement {

    public static void main(String[] args) {
        int choice = 2;

        if (choice == 1) {
            System.out.println("Selected Pizza");
        } else if (choice == 2) {
            System.out.println("Selected Burger");
        } else if (choice == 3) {
            System.out.println("Selected Pasta");
        } else if (choice == 4) {
            System.out.println("Selected sweet dish");
        } else {
            System.out.println("Invalid choice");
        }

        switch (choice) {
            case 1:
                System.out.println("Selected Pizza");
                break;
            case 2:
                System.out.println("Selected Burger");
                break;
            case 3:
                System.out.println("Selected Pasta");
                break;
            case 4:
                System.out.println("Selected sweet dish");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

}
