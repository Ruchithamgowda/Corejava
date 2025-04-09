package com.xworks.encapsulation.external;

import com.xworks.encapsulation.internal.Mutant;

public class MutantViewer {
    public void display() {
        Mutant mutant = new Mutant();
        System.out.println("Mutant Info (read-only):");
        System.out.println("Name: " + mutant.getName());
        System.out.println("Power: " + mutant.getPower());
}
}
