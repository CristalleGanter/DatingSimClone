package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Scenario extends Date {

public Scenario(String location)
{
super(location);


}


public void startScenario(String keyWord)
{
    try {
        BufferedReader in = new BufferedReader(new FileReader("scenarios.txt"));
        String diag;


        while ((diag = in.readLine()) != null) {

            String[] keyWordLine = diag.split(keyWord);


            if (diag.contains(keyWord)) {

                for (String part : keyWordLine) {
                    System.out.print("\n" + part);
                }
            }
        }
    } catch (IOException e) {
        System.err.println("Unable to open file for processing");
        System.exit(2);
    }




}



//3 locations, 3 scenarios = 9 dates

// beach, restaurant, botanical garden








}
