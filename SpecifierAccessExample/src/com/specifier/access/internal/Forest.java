package com.specifier.access.internal;

public class Forest {
    public Forest() {
        System.out.println("In no-arg Forest constructor running");
    }

    public void trees() {
        System.out.println("Running public trees method");
    }

    void animals() {
        System.out.println("Running package-default animals method");
    }

    private void secrets() {
        System.out.println("Running private secrets method");
    }
}
