package org.shauryabahl08.oops.inheritance.car;

public class CarMain {

    public static void main(String[] args) {
        TataSafari ts = new TataSafari();
        ts.changeGear();

        BmwQ6 q6 = new BmwQ6();
        q6.changeGear();

        BmwQ7 q7 = new BmwQ7();
        // what all problem will occur?
        // 1) human error
        // 2) you will make lots of different function in child class
        // that will be hard to manage
        //q7.changeGearQ7();
        q7.changeGear();
    }
}
