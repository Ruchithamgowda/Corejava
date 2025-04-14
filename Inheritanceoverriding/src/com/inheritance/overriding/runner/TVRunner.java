package com.inheritance.overriding.Runner;

import com.inheritance.overriding.internal.*;

public class TVRunner {
    public static void main(String[] args) {
        // for tv
        TV tv=new TV();
        tv.usetv();
        TV ptv=new ProTv();
        ptv.usetv();
        ProTv proTv=new ProTv();
        proTv.usetv();
        proTv.maintaintv();
        SonyTV sonyTV=new SonyTV();
        sonyTV.show(tv);
        sonyTV.show(proTv);
        System.out.println("===============================================================");