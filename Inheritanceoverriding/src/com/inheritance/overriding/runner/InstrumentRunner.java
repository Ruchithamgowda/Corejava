package com.inheritance.overriding.runner;

import com.inheritance.overriding.internal.*;

public class InstrumentRunner {
    public static void main(String[] args) {
        Instrument inst = new Instrument();
        inst.play();

        Instrument smartInst = new SmartInstrument();
        smartInst.play();

        SmartInstrument si = new SmartInstrument();
        si.play();
        si.tune();

        Piano piano = new Piano();
        piano.show(inst);
        piano.show(si);

        System.out.println("======================================");
    }
}
