package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Date {
    public String location;






    public Date(String location) {
        this.location = location;
    }


    public void goOnDate() {


        try {
            BufferedReader in = new BufferedReader(new FileReader("dates.txt"));
            String date;


            while ((date = in.readLine()) != null) {

                String[] locationLine = date.split(location, 2);


                if (date.contains(location)) {

                    for (String part : locationLine) {
                        System.out.print("\n" + part);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Unable to open file for processing");
            System.exit(2);
        }


    }


    public void dressUp(String keyWord) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("dates.txt"));
            String date;


            while ((date = in.readLine()) != null) {

                String[] keyWordLine = date.split(keyWord, 2);


                if (date.contains(keyWord)) {

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





    public void unlockCharacter() {
        System.out.println("\nAfter you get home from your date, Kyu, the love fairy who has been giving you advice behind the scenes, enters your room.\nKyu: Wow! I can't believe you pulled that off! That looked like a lotta fun... \nYou know what? Screw it. I'm in!");




    }

}