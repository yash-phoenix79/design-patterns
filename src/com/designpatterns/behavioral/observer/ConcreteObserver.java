package com.designpatterns.behavioral.observer;

public class ConcreteObserver implements Observer{

    private String name;

    public ConcreteObserver(String name){
        this.name=name;
    }

    @Override
    public void update(String state) {
    System.out.println(name+ "Received update" +state);
    }
}
