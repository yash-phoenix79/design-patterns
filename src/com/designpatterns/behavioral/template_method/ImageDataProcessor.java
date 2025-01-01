package com.designpatterns.behavioral.template_method;

public class ImageDataProcessor extends DataProcessor{
    @Override
    protected void processData() {
        System.out.println("Processing image data...");
    }

    @Override
    protected void saveData(){
        System.out.println("Saving image in a new way..");
    }

}
