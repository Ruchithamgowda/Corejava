package com.inheritance.overriding.internal;

public class SmartGadget extends Gadget {
    public SmartGadget() {
        System.out.println("SmartGadget constructor running");
    }

    @Override
    public void use() {
        System.out.println("Using smart gadget with connectivity");
    }

    public void update() {
        System.out.println("Updating smart gadget firmware");
    }
}
