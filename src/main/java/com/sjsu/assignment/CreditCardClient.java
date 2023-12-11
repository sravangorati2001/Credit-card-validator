package com.sjsu.assignment;

import com.sjsu.assignment.card.context.CreditCardContext;

public class CreditCardClient {

    public static void main(String[] args) {
        CreditCardContext creditCardContext = new CreditCardContext();

        // Define base directory for input and output
        String inputBaseDir = "src/main/resources/input/";
        String outputBaseDir = "src/main/resources/output/";

        // Process CSV files
//        String csvInputFilename = inputBaseDir + "input_file.csv";
//        String csvOutputFilename = outputBaseDir + "output_file.csv";
//        creditCardContext.process(csvInputFilename, csvOutputFilename);
//
//        // Process JSON files
//        String jsonInputFilename = inputBaseDir + "input_file.json";
//        String jsonOutputFilename = outputBaseDir + "output_file.json";
//        creditCardContext.process(jsonInputFilename, jsonOutputFilename);

        // Process XML files
        String xmlInputFilename = inputBaseDir + "demo2_inp.xml";
        String xmlOutputFilename = outputBaseDir + "output_file2.xml";
        creditCardContext.process(xmlInputFilename, xmlOutputFilename);
    }
}
