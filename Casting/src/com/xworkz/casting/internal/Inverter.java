package com.xworkz.casting.internal;

public class Inverter extends Generator {
    @Override
    public void generate() {
        System.out.println("Inverter is generating backup power");
    }

    public void backup() {
        System.out.println("Inverter is providing backup");
    }
}
