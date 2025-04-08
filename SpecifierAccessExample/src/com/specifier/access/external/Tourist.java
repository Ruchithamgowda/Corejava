package com.specifier.access.external;

import com.specifier.access.internal.Forest;

public class Tourist {
    public Tourist() {
        System.out.println("Running Tourist constructor");
    }

    public void visitForest() {
        System.out.println("Accessing public method of Forest from external package:");
        Forest forest = new Forest();
        forest.trees();
    }
}

