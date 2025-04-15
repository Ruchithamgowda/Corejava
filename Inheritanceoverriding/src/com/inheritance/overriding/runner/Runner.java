package com.inheritance.overriding.runner;

public class Runner {
    public static void main(String[] args){
        String name="Nanditha";
        String updateName=name.concat("A");
        System.out.println("name:"+name);
        System.out.println("updateName:"+updateName);
        String u_name="NandithaA";
        if(updateName == u_name){
            System.out.println("matching");
        }else{
            System.out.println("not matching");
        }
    }
}
