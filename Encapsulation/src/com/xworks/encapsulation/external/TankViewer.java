package com.xworks.encapsulation.external;

import com.xworks.encapsulation.internal.Tank;

public class TankViewer {
    public void display() {
        Tank tank = new Tank();

        System.out.println("\nTank Viewer (Read-Only):");
        System.out.println("Model: " + tank.getModel());
        System.out.println("Type: " + tank.getType());
    }
}
