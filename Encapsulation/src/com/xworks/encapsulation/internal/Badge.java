package com.xworks.encapsulation.internal;

public class Badge {
    private String name;
    private String color;
    private String material;
    private int level;
    private boolean active;

    void setName(String name)
    {
        this.name = name;
    }
    void setColor(String color)
    {
        this.color = color;
    }
    void setMaterial(String material)
    {
        this.material = material;
    }
    void setLevel(int level)
    {
        this.level = level;
    }
    void setActive(boolean active)
    {
        this.active = active;
    }

    public String getName()
    {
        return name;
    }
    public String getColor()
    {
        return color;
    }
    public String getMaterial()
    {
        return material;
    }
    public int getLevel()
    {
        return level;
    }
    public boolean isActive()
    {
        return active;
    }
}
