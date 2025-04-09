package com.xworks.encapsulation.internal;

public class Occupation {
    private String title;
    private String industry;
    private int experience;
    private boolean remote;
    private double salary;

    void setTitle(String title)
    {
        this.title = title;
    }
    void setIndustry(String industry)
    {
        this.industry = industry;
    }
    void setExperience(int experience)
    {
        this.experience = experience;
    }
    void setRemote(boolean remote)
    {
        this.remote = remote;
    }
    void setSalary(double salary)
    {
        this.salary = salary;
    }

    public String getTitle()
    {
        return title;
    }
    public String getIndustry()
    {
        return industry;
    }
    public int getExperience()
    {
        return experience;
    }
    public boolean isRemote()
    {
        return remote;
    }
    public double getSalary()
    {
        return salary;
    }
}
