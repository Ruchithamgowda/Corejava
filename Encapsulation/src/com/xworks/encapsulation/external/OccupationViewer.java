package com.xworks.encapsulation.external;

import com.xworks.encapsulation.internal.Occupation;

public class OccupationViewer {
    public void display() {
        Occupation occupation = new Occupation();

        System.out.println("\nOccupation Viewer (Read-Only):");
        System.out.println("Title: " + occupation.getTitle());
        System.out.println("Industry: " + occupation.getIndustry());
    }
}
