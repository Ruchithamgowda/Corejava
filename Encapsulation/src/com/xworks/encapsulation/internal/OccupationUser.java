package com.xworks.encapsulation.internal;

public class OccupationUser {
    public void use() {
        Occupation occupation = new Occupation();

        occupation.setTitle("Software Engineer");
        occupation.setIndustry("IT Services");
        occupation.setExperience(3);
        occupation.setRemote(true);
        occupation.setSalary(85000.0);

        System.out.println("Occupation User View:");
        System.out.println("Title: " + occupation.getTitle());
        System.out.println("Industry: " + occupation.getIndustry());
        System.out.println("Experience: " + occupation.getExperience() + " years");
        System.out.println("Remote: " + occupation.isRemote());
        System.out.println("Salary: $" + occupation.getSalary());
    }
}
