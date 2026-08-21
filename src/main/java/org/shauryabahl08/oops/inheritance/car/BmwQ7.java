package org.shauryabahl08.oops.inheritance.car;

public class BmwQ7 extends Car {

    // where user can change gear with voice cmd

    @Override
    public void changeGear() {
        System.out.println("Changing gear with voice cmd");
    }
}
