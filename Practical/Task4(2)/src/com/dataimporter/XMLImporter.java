package com.dataimporter;

public class XMLImporter extends DataImporter {

    @Override
    protected void parseData() {
        System.out.println("Parsing XML data...");
    }

    @Override
    protected void validateData() {
        System.out.println("Validating XML data...");
    }
}
