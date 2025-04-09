package com.xworks.encapsulation.external;

import com.xworks.encapsulation.internal.KeyChain;

public class KeyChainViewer {
    public void display() {
        KeyChain keyChain = new KeyChain();

        System.out.println("\nKeyChain Viewer (Read-Only View):");
        System.out.println("Brand: " + keyChain.getBrand());
        System.out.println("Material: " + keyChain.getMaterial());
    }
}
