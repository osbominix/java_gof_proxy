package com.gof.designpattern.proxy.basis;

/**
 * Created by yl3 on 29.11.15.
 */
public class Visa implements Payment {

    private String visaAccountInfo;

    public Visa(String visaAccountInfo) {
        this.visaAccountInfo = visaAccountInfo;
    }

    public void pay() {
        System.out.println("pay via Visa");
    }
}
