package com.designpatterns.behavioral.memento;

public class MementoTest {
    public static void main(String[] args) {

        System.out.println("Game starts");

        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State 1");
        caretaker.addMemento(originator.saveStateToMemento());

        System.out.println(originator.getState());

        originator.setState("State 2");
        caretaker.addMemento(originator.saveStateToMemento());

        System.out.println(originator.getState());

        originator.setState("State 3");

        System.out.println(originator.getState());

        originator.restoreStateFromMemento(caretaker.getMemento(0));
        System.out.println(originator.getState());
        originator.restoreStateFromMemento(caretaker.getMemento(1));
        System.out.println(originator.getState());

        System.out.println("Game ends");

    }
}
