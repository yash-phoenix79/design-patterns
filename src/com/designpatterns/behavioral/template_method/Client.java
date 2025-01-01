package com.designpatterns.behavioral.template_method;

public class Client {
    public static void main(String[] args) {
        DataProcessor textProcessor = new TextDataProcessor();
        DataProcessor imageProcessor = new ImageDataProcessor();

        System.out.println("Text Data processing..");
        textProcessor.process();

        System.out.println("\nImage Data Processing:");
        imageProcessor.process();

    }
}
