package com.designpatterns.behavioral.strategy;

public class CreditCard implements Strategy{

    private String cardNumber;

    public CreditCard(String number){
        this.cardNumber=number;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card: " + cardNumber);
    }
}
