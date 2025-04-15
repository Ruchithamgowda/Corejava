package com.inheritance.overriding.internal;

public class Washer extends Machine {
    public Washer() {
        System.out.println("Washer constructor running");
    }

    public void show(Machine machine) {
        if (machine != null) {
            machine.operate();
            if (machine instanceof SmartMachine) {
                SmartMachine sm = (SmartMachine) machine;
                sm.diagnose();
            } else {
                System.out.println("Not a SmartMachine, cannot diagnose");
            }
        } else {
            System.out.println("Machine is null");
        }
    }
}
