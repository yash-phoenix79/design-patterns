package com.designpatterns.behavioral.strategy;

public class PayPal implements Strategy{

    private String email;
    public PayPal(String email){
        this.email=email;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Payment via paypal");
    }
}
