package com.gof.designpattern;

import com.gof.designpattern.proxy.PaymentProxy;

/**
 * Created by yl3 on 29.11.15.
 */
public class CommandCenter {

    public static void main( String[] args ) {

        PaymentProxy paymentProxy = new PaymentProxy("visa account information");

        paymentProxy.pay();

    }
}
