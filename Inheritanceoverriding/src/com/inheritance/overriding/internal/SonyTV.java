package com.inheritance.overriding.internal;

public class SonyTV extends TV {
    public SonyTV(){
        System.out.println("Running the SonyTV const");
    }
    public void show(TV tv){
        if(tv!=null){
            tv.usetv();
            if(tv instanceof ProTv){
                ProTv refptv=(ProTv) tv;
                refptv.maintaintv();
            }
            else{
                System.out.println("TV is not Protv cannot call maintaintv");
            }
        }
        else{
            System.out.println("tv is null");
        }
    }
}