package com.designpatterns.behavioral.memento;

public class Originator {

    private String state;

    public void setState(String state){
        this.state=state;
    }

    public String getState(){
        System.out.println("Current state is " + state);
        return state;
    }

    // Creates a memento containing the current state
    public Memento saveStateToMemento(){
        System.out.println("Saving state to Memento"+ state);
        return new Memento(state);
    }

    //Restore state from Memento
    public void restoreStateFromMemento(Memento memento){
        state=memento.getState();
        System.out.println("State has been restored");
    }

}
