package com.designpatterns.behavioral.strategy;

public class PaymentContext {

    private Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy=strategy;
    }

    public void executePayment(int amount){
        if (strategy == null) {
            throw new IllegalStateException("Payment strategy is not set!");
        }
        strategy.pay(amount);
    }

}
