package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DialogueLoader {

//make array list , method with input file name, string of favcolor, return dialogue


    public void alldiag(String Filename, String keyWord) {


        try {
            BufferedReader in = new BufferedReader(new FileReader(Filename));
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





    public String getdiag(String Filename, String keyWord) {

String line="";

try{
    BufferedReader read = new BufferedReader(new FileReader(Filename));
    String diag;

    while ((diag=read.readLine())!=null)
    {
        String[] keyWordLine = diag.split(keyWord);


        if(diag.contains(keyWord))
        {
            for (String part: keyWordLine)
            {

                line= part;
            }

        }



    }


}

catch(IOException e)
        {
            System.err.println("Unable to open file for processing");
            System.exit(2);
        }
 return line;





    }
































}
