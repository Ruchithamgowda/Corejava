package com.xworks.encapsulation.internal;

public class TankUser {
    public void test() {
        Tank tank = new Tank();

        tank.setModel("T-90");
        tank.setType("Main Battle Tank");
        tank.setCapacity(3);
        tank.setWeight(46.5);
        tank.setArmed(true);

        System.out.println("Tank Details (from TankUser):");
        System.out.println("Model: " + tank.getModel());
        System.out.println("Type: " + tank.getType());
        System.out.println("Capacity: " + tank.getCapacity() + " crew members");
        System.out.println("Weight: " + tank.getWeight() + " tons");
        System.out.println("Armed: " + tank.isArmed());
    }
}
