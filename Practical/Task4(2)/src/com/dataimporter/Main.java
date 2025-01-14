package com.dataimporter;

public class Main {

    public static void main(String[] args) {
        // Create instances of different importers
        DataImporter csvImporter = new CSVImporter();
        DataImporter xmlImporter = new XMLImporter();
        DataImporter jsonImporter = new JSONImporter();

        // Import data using the template method
        System.out.println("CSV Import Process:");
        csvImporter.importData("data.csv");

        System.out.println("\nXML Import Process:");
        xmlImporter.importData("data.xml");

        System.out.println("\nJSON Import Process:");
        jsonImporter.importData("data.json");
    }
}
