package com.xworks.encapsulation.internal;

public class KeyChain {
    private String brand;
    private String material;
    private String color;
    private double price;
    private boolean customizable;

    void setBrand(String brand) { this.brand = brand; }
    void setMaterial(String material) { this.material = material; }
    void setColor(String color) { this.color = color; }
    void setPrice(double price) { this.price = price; }
    void setCustomizable(boolean customizable) { this.customizable = customizable; }

    public String getBrand() { return brand; }
    public String getMaterial() { return material; }
    public String getColor() { return color; }
    public double getPrice() { return price; }
    public boolean isCustomizable() { return customizable; }
}
