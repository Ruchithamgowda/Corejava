package com.inheritance.overriding.runner;

import com.inheritance.overriding.internal.*;

public class MachineRunner {
    public static void main(String[] args) {
        Machine machine = new Machine();
        machine.operate();

        Machine smartM = new SmartMachine();
        smartM.operate();

        SmartMachine sm = new SmartMachine();
        sm.operate();
        sm.diagnose();

        Washer washer = new Washer();
        washer.show(machine);
        washer.show(sm);

        System.out.println("=======================");
    }
}
