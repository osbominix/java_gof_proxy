package com.gof.designpattern.proxy;

import com.gof.designpattern.proxy.basis.Payment;
import com.gof.designpattern.proxy.basis.Visa;

import java.lang.reflect.ParameterizedType;

/**
 * Created by yl3 on 29.11.15.
 */
public class PaymentProxy implements Payment{

    private Visa visa;
    private String visaAccountInfo;

    public PaymentProxy(String visaAccountInfo) {
        this.visaAccountInfo = visaAccountInfo;
    }

    public void pay() {
        if (visa == null) {
            visa = new Visa(visaAccountInfo);
        }

        visa.pay();
    }
}
