package org.shauryabahl08.enums;

import java.util.Scanner;

public class MainDay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // User can't take enum as an input so we need to take string input & then convert it to enum
        String userInput = sc.next(); // Monday, monday, MONDAY
        userInput = userInput.toUpperCase(); // MONDAY
        //Day today = Day.SUNDAY;
        //Java has a special function in enum called valueOf() to convert string to enum
        Day today = Day.valueOf(userInput);

        switch (today) {
            case MONDAY:
                System.out.println("Today is Monday");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Today is Wednesday");
                break;
            case THRUSDAY:
                System.out.println("Today is Thursday");
                break;
            case FRIDAY:
                System.out.println("Today is Friday");
                break;
            case SATURDAY:
                System.out.println("Today is Saturday");
                break;
            case SUNDAY:
                System.out.println("Today is Sunday");
                break;
        }
    }
}
