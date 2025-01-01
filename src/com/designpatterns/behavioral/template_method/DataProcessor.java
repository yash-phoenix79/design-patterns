package com.designpatterns.behavioral.template_method;

abstract class DataProcessor {

    public final void process(){
        loadData();
        processData();
        saveData();
    }

    protected void loadData(){
        System.out.println("Loading data...");
    }

    protected abstract void processData();

    protected void saveData(){
        System.out.println("Saving data...");
    }

}
