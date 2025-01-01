package com.designpatterns.behavioral.command;

public class RemoteControl {
    private Command command;
    public  void setCommand(Command command){
        this.command=command;
    }
    public void executeButton(){
        command.execute();
    }
    public void undoButton(){
        command.undo();
    }
}
