package com.xworks.encapsulation.internal;

public class KeyChainUser {
    public void test() {
        KeyChain keyChain = new KeyChain();

        keyChain.setBrand("Titan");
        keyChain.setMaterial("Metal");
        keyChain.setColor("Silver");
        keyChain.setPrice(399.50);
        keyChain.setCustomizable(false);

        System.out.println("KeyChain Details (from KeyChainUser):");
        System.out.println("Brand: " + keyChain.getBrand());
        System.out.println("Material: " + keyChain.getMaterial());
        System.out.println("Color: " + keyChain.getColor());
        System.out.println("Price: ₹" + keyChain.getPrice());
        System.out.println("Customizable: " + keyChain.isCustomizable());
    }
}
