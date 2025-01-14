package com.dataimporter;

public class CSVImporter extends DataImporter {

    @Override
    protected void parseData() {
        System.out.println("Parsing CSV data...");
    }

    @Override
    protected void validateData() {
        System.out.println("Validating CSV data...");
    }
}
