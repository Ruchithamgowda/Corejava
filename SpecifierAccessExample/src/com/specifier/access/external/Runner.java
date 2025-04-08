package com.specifier.access.external;

import com.specifier.access.internal.Ranger;

public class Runner {
    public static void main(String[] args) {
        Ranger ranger = new Ranger();
        ranger.exploreForest();

        Tourist tourist = new Tourist();
        tourist.visitForest();
    }
}
