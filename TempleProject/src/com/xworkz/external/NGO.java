package com.xworkz.external;

public class NGO {
    public void useTempleFund() {
        Temple temple = new Temple();
        int fund = temple.getTempleFund();
        System.out.println("NGO using temple fund: " +fund);
}

}
