package com.specifier.access.internal;

public class Ranger {
    public Ranger() {
        System.out.println("Running Ranger constructor");
    }

    public void exploreForest() {
        System.out.println("Accessing public and package-private methods from internal package:");
        Forest forest = new Forest();
        forest.trees();
        forest.animals();
    }
}
