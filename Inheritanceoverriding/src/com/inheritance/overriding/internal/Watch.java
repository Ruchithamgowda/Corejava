package com.inheritance.overriding.internal;

public class Watch extends Gadget {
    public Watch() {
        System.out.println("Watch constructor running");
    }

    public void show(Gadget gadget) {
        if (gadget != null) {
            gadget.use();
            if (gadget instanceof SmartGadget) {
                SmartGadget sg = (SmartGadget) gadget;
                sg.update();
            } else {
                System.out.println("Not a SmartGadget, cannot update");
            }
        } else {
            System.out.println("Gadget is null");
        }
    }
}
