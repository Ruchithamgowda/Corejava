package com.inheritance.overriding.internal;

public class ProTv extends  TV{
    public ProTv(){
        System.out.println("no-arg ProTv const is ruuning");
    }
    @Override
    public void usetv(){
        System.out.println("running overrided usetv method from ProTv class");
    }
    public void maintaintv(){
        System.out.println("running maintaintv method from protv class");
    }

}