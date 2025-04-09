package com.xworks.encapsulation.external;

import com.xworks.encapsulation.internal.PostOffice;

public class PostOfficeViewer {
    public void display() {
        PostOffice office = new PostOffice();

        System.out.println("\nPostOffice Viewer (Read-Only):");
        System.out.println("Location: " + office.getLocation());
        System.out.println("PostMaster: " + office.getPostMaster());
    }
}
