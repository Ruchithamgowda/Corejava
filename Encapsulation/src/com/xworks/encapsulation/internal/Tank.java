package com.xworks.encapsulation.internal;

public class Tank {
    private String model;
    private String type;
    private int capacity;
    private double weight;
    private boolean armed;

    void setModel(String model)
    {
        this.model = model;
    }
    void setType(String type)
    {
        this.type = type;
    }
    void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }
    void setWeight(double weight)
    {
        this.weight = weight;
    }
    void setArmed(boolean armed)
    {
        this.armed = armed;
    }

    public String getModel()
    {
        return model;
    }
    public String getType()
    {
        return type;
    }
    public int getCapacity()
    {
        return capacity;
    }
    public double getWeight()
    { return weight;
    }
    public boolean isArmed()
    { return armed;
    }
}
