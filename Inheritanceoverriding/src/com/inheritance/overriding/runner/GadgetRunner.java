package com.inheritance.overriding.runner;

import com.inheritance.overriding.internal.*;

public class GadgetRunner {
    public static void main(String[] args) {
        Gadget g = new Gadget();
        g.use();

        Gadget sg = new SmartGadget();
        sg.use();

        SmartGadget smartGadget = new SmartGadget();
        smartGadget.use();
        smartGadget.update();

        Watch watch = new Watch();
        watch.show(g);
        watch.show(smartGadget);

        System.out.println("========================");
    }
}
