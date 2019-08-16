package com.company;


import java.io.BufferedReader;
import java.io.FileReader;

import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {


        Convo talking = new Convo();

        Scanner scan = new Scanner(System.in);


        DialogueLoader loadDialogue = new DialogueLoader();

        CharacterMaker makeCharacter = new CharacterMaker();

        makeCharacter.loadCharacter();

        Date date1 = new Date("beach:");
        Date date2 = new Date("restaurant:");
        Date date3 = new Date("botanicalgarden:");


        Scenario scenario = new Scenario("beach");


        System.out.println("\nWhich girl would you like to talk to?" +
                "\n  Aiko \n  Audrey \n  Beli \n  Jessie \n  Kyanna \n  Tiffany\n  Exit\n");


        String convochoice = scan.nextLine();


        boolean exit = false;

        //  outer:  while (exit==false) {




        do
        {
            switch (convochoice) {

                case "aiko":
                    talking.introduceaiko();
                    String aikoconvo = scan.nextLine();
                    talking.talkaiko(aikoconvo);
                    System.out.println("\nWhich girl would you like to talk to?" +
                            "\n  Aiko \n  Audrey \n  Beli \n  Jessie \n  Kyanna \n  Tiffany\n  Exit\n");
                    System.out.println("\n");
                    convochoice=scan.nextLine();
                    break;
                case "audrey":

                    talking.introduceaudrey();

                    String audreyconvo = scan.nextLine();

                    talking.talkaudrey(audreyconvo);
                    System.out.println("\nWhich girl would you like to talk to?" +
                            "\n  Aiko \n  Audrey \n  Beli \n  Jessie \n  Kyanna \n  Tiffany\n  Exit\n");
                    System.out.println("\n");
                    convochoice=scan.nextLine();
                    break;

                case "beli":
                    talking.introducebeli();

                    String beliconvo = scan.nextLine();
                    talking.talkbeli(beliconvo);
                    System.out.println("\nWhich girl would you like to talk to?" +
                            "\n  Aiko \n  Audrey \n  Beli \n  Jessie \n  Kyanna \n  Tiffany\n  Exit\n");
                    System.out.println("\n");
                    convochoice=scan.nextLine();
                    break;

                case "jessie":
                    talking.introducjessie();

                    String jessieconvo = scan.nextLine();
                    talking.talkjessie(jessieconvo);
                    System.out.println("\nWhich girl would you like to talk to?" +
                            "\n  Aiko \n  Audrey \n  Beli \n  Jessie \n  Kyanna \n  Tiffany\n  Exit\n");
                    System.out.println("\n");
                    convochoice=scan.nextLine();
                    break;

                case "kyanna":
                    talking.introducekyanna();

                    String kyannaconvo = scan.nextLine();
                    talking.talkkyanna(kyannaconvo);
                    System.out.println("\nWhich girl would you like to talk to?" +
                            "\n  Aiko \n  Audrey \n  Beli \n  Jessie \n  Kyanna \n  Tiffany\n  Exit\n");
                    System.out.println("\n");
                    convochoice=scan.nextLine();
                    break;

                case "tiffany":
                    talking.introducetiffany();
                    String tiffanyconvo = scan.nextLine();
                    talking.talktiffany(tiffanyconvo);
                    System.out.println("\nWhich girl would you like to talk to?" +
                            "\n  Aiko \n  Audrey \n  Beli \n  Jessie \n  Kyanna \n  Tiffany\n  Exit\n");
                    System.out.println("\n");
                    convochoice=scan.nextLine();
                    break;

                case "exit":
                    exit = true;
                    break;


                default:
                    System.out.println("Please enter the lowercase name of a girl.");
                    exit = true;
                    break;
                // find way to loop back to beginning after breaking case
            }


        }
while(exit==false);

        //}
    }









/*


        while (!exit) {

            try {
                String choice = scan.nextLine();

                switch (choice) {

                    case "aiko":
                        loadDialogue.alldiag("aikodialogue.txt", "greeting1:");







            }
    catch(java.util.InputMismatchException e)
                {
                    System.out.println("Please enter the correct input.");
                    scan.next();


                }


        }

*/


//decorator pattern




    }

