package org.shauryabahl08.composition.generic;

// generic class
public class Box<DT, DT1> {

    private DT value;

    private DT1 value1;

    public Box(DT value, DT1 value1) {
        this.value = value;
        this.value1 = value1;
    }

    public DT get() {
       return value;
    }

    public DT1 getValue1() {
        return value1;
    }
}
