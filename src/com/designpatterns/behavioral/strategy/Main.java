package com.designpatterns.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext= new PaymentContext();
        paymentContext.setStrategy(new CreditCard("123-435-355"));
        paymentContext.executePayment(122);
        paymentContext.setStrategy(new PayPal("yahhehf@kwfh.in"));
        paymentContext.executePayment(35);
    }
}
