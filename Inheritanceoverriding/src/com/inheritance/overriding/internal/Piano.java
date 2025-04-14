package com.inheritance.overriding.internal;

public class Piano extends Instrument {
    public Piano() {
        System.out.println("Piano constructor running");
    }

    public void show(Instrument instrument) {
        if (instrument != null) {
            instrument.play();
            if (instrument instanceof SmartInstrument) {
                SmartInstrument si = (SmartInstrument) instrument;
                si.tune();
            } else {
                System.out.println("Not a SmartInstrument, cannot tune");
            }
        } else {
            System.out.println("Instrument is null");
        }
    }
}
