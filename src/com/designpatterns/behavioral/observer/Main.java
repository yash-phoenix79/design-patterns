package com.designpatterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer1= new ConcreteObserver("observer1");
        ConcreteObserver observer2= new ConcreteObserver("observer2");

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.setState("State A");

        subject.removeObserver(observer1);

        subject.setState("StateB");

    }
}
