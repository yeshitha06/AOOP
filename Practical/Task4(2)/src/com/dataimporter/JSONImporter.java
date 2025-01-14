package com.dataimporter;

public class JSONImporter extends DataImporter {

    @Override
    protected void parseData() {
        System.out.println("Parsing JSON data...");
    }

    @Override
    protected void validateData() {
        System.out.println("Validating JSON data...");
    }
}
