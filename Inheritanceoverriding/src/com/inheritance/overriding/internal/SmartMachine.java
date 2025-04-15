package com.inheritance.overriding.internal;

public class SmartMachine extends Machine {
    public SmartMachine() {
        System.out.println("SmartMachine constructor running");
    }

    @Override
    public void operate() {
        System.out.println("Operating smart machine with automation");
    }

    public void diagnose() {
        System.out.println("Running diagnostics on smart machine");
    }
}
