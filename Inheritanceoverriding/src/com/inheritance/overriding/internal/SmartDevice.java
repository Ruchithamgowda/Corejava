package com.inheritance.overriding.internal;

public class SmartDevice extends Device {
    public SmartDevice() {
        System.out.println("no-arg SmartDevice constructor is running");
    }

    @Override
    public void useDevice() {
        System.out.println("running overridden useDevice method from SmartDevice class");
    }

    public void maintainDevice() {
        System.out.println("running maintainDevice method from SmartDevice class");
    }
}
