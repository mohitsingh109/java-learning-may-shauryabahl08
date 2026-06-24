package org.shauryabahl08.assignment;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 *
 * Move display menu, user input, each choice code into a function
 */

public class SmartCityManagementSystem {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("===== SMART CITY UTILITY MANAGEMENT =====");
            System.out.println();
            System.out.println("1. Water Usage Checker");
            System.out.println("2. Electricity Bill Calculator");
            System.out.println("3. Traffic Signal Simulator");
            System.out.println("4. Parking Slot Finder");
            System.out.println("5. Citizen Complaint Tracker");
            System.out.println("6. Exit");
            System.out.println();
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            if(choice == 1){
                System.out.println("How many liters of water do you consume in a day?");
                double liters = sc.nextDouble();
                if (liters > 300){
                    System.out.println("You have high water consumption. Please conserve water!");
                }
                else if (liters >= 100 && liters <= 300){
                    System.out.println("Normal usage");
                }
                else {
                    System.out.println("Excellent water conservation");
                }
            }
            else if (choice == 2){
                System.out.println ("Enter the number of electricity units consumed: ");
                int billAmount = 0;
                int electricityConsumed = sc.nextInt();
                if (electricityConsumed <= 100){
                   billAmount = electricityConsumed * 5;
                }
                else if (electricityConsumed <= 200){
                    electricityConsumed -= 100;
                    billAmount = 500 + (electricityConsumed * 7);
                }
                else {
                    electricityConsumed -= 200;
                    billAmount = 1200 + (electricityConsumed * 10);
                }
                System.out.println ("Your total bill is: " + billAmount);

            }
            else if (choice == 3){
                System.out.println("Enter signal colour: ");
                String signalColour = sc.next();
                switch (signalColour){
                    case "R":
                        System.out.println("Stop");
                        break;

                    case "Y":
                        System.out.println("Ready");
                        break;

                    case "G":
                        System.out.println("Go");
                        break;

                    default:
                        System.out.println("Invalid signal colour.");
                }

            }
            else if (choice == 4){
                System.out.println("Enter the total number of parking slots: ");
                int parkingSlots = sc.nextInt();
                for (int i = 1; i <= parkingSlots; i++){
                    if (i == 20){
                        break;
                    }
                    if (i % 4 == 0){
                        System.out.println("Slot booked for VIP people");
                        continue;
                    }
                    System.out.println(i);
                }

            }
            else if (choice == 5){
                System.out.println("How many complaints do you want to register? ");
                int complaints = sc.nextInt();
                int validComplaints = 0;
                int i = 0;
                while (i < complaints){
                    i++;
                    System.out.println("Enter the complaint ID: ");
                    int complaintId = sc.nextInt();
                    if (complaintId < 0){
                        System.out.println("Invalid complaint ID");
                        continue;
                    }
                    if (complaintId == 999){
                        break;
                    }
                    validComplaints++;

                }
                System.out.println("Total number of valid complaints: " + validComplaints);
            }
            else if (choice == 6){
                System.out.println("You have chosen to exit");
                break;
            }
            else {
              System.out.println("Invalid choice");
            }

        }
    }
}
