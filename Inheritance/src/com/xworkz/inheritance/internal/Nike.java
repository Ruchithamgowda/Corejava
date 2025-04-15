package com.xworkz.inheritance.internal;

public class Nike extends shoe{
        private String model = "Air Max";

        public Nike() {
            System.out.println("No-arg const of Nike");
        }

        public void showDetails() {
            System.out.println("Model: " + model);
        }
    }