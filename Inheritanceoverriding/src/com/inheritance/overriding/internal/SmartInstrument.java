package com.inheritance.overriding.internal;

public class SmartInstrument extends Instrument {
    public SmartInstrument() {
        System.out.println("SmartInstrument constructor running");
    }

    @Override
    public void play() {
        System.out.println("Playing smart instrument with effects");
    }

    public void tune() {
        System.out.println("Tuning smart instrument");
    }
}
