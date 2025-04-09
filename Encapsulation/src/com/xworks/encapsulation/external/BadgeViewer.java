package com.xworks.encapsulation.external;

import com.xworks.encapsulation.internal.Badge;

public class BadgeViewer {
    public void display() {
        Badge badge = new Badge();

        System.out.println("\nBadge Viewer (Read-Only):");
        System.out.println("Name: " + badge.getName());
        System.out.println("Color: " + badge.getColor());
    }
}
