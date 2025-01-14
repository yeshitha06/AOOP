package com.dataimporter;

public abstract class DataImporter {

    // Template method
    public final void importData(String filePath) {
        readData(filePath);
        parseData();
        validateData();
        saveData();
    }

    // Steps in the template method
    protected void readData(String filePath) {
        System.out.println("Reading data from file: " + filePath);
    }

    protected abstract void parseData(); // Abstract step for parsing data

    protected void validateData() {
        System.out.println("Validating data...");
    }

    protected void saveData() {
        System.out.println("Saving data...");
    }
}
