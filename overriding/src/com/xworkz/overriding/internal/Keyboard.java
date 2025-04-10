package com.xworkz.overriding.internal;

public class Keyboard extends Piano{
    public Keyboard(){
        System.out.println("no-arg constructor for Keyboard");
    }

    public void play(){
        System.out.println("running play in Keyboard");
    }
    public void pressKey(){
        System.out.println("running pressKey in Keyboard ");
    }
}
