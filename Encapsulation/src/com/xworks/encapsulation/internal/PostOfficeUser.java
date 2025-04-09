package com.xworks.encapsulation.internal;

public class PostOfficeUser {
    public void use() {
        PostOffice office = new PostOffice();

        office.setLocation("Bangalore");
        office.setPostMaster("Mr. Ramesh");
        office.setPinCode(560001);
        office.setHasATM(true);
        office.setRating(4.5);
        
        System.out.println("PostOffice User View:");
        System.out.println("Location: " + office.getLocation());
        System.out.println("PostMaster: " + office.getPostMaster());
        System.out.println("Pincode: " + office.getPinCode());
        System.out.println("ATM Available: " + office.isHasATM());
        System.out.println("Rating: " + office.getRating());
    }
}
