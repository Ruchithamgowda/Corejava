package com.xworks.encapsulation.internal;

public class BadgeUser {
    public void use() {
        Badge badge = new Badge();

        badge.setName("CodeMaster");
        badge.setColor("Blue");
        badge.setMaterial("Metal");
        badge.setLevel(5);
        badge.setActive(true);

        System.out.println("Badge User View:");
        System.out.println("Name: " + badge.getName());
        System.out.println("Color: " + badge.getColor());
        System.out.println("Material: " + badge.getMaterial());
        System.out.println("Level: " + badge.getLevel());
        System.out.println("Active: " + badge.isActive());
    }
}
