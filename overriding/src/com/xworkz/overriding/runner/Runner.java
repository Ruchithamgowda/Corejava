package com.xworkz.overriding.runner;

import com.xworkz.overriding.internal.Keyboard;
import com.xworkz.overriding.internal.Piano;

public class Runner {
    public static void main(String[] args) {
        Piano piano=new Piano();
        Piano piano1=new Keyboard();
        piano1.play();

        Keyboard keyboard=new Keyboard();
        keyboard.play();
        keyboard.pressKey();

        System.out.println("=================================");


    }
}
