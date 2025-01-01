package com.designpatterns.behavioral.template_method;

public class TextDataProcessor extends DataProcessor{
    @Override
    protected void processData() {
        System.out.println("Processing text data...");
    }
}
