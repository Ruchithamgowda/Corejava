package com.xworks.encapsulation.internal;

public class PostOffice {
    private String location;
    private String postMaster;
    private int pinCode;
    private boolean hasATM;
    private double rating;

    void setLocation(String location)
    {
        this.location = location;
    }
    void setPostMaster(String postMaster)
    {
        this.postMaster = postMaster;
    }
    void setPinCode(int pinCode)
    {
        this.pinCode = pinCode;
    }
    void setHasATM(boolean hasATM)
    {
        this.hasATM = hasATM;
    }
    void setRating(double rating)
    {
        this.rating = rating;
    }

    public String getLocation()
    {
        return location;
    }
    public String getPostMaster()
    {
        return postMaster;
    }
    public int getPinCode()
    {
        return pinCode;
    }
    public boolean isHasATM()
    { return hasATM;
    }
    public double getRating()
    {
        return rating;
    }
}
