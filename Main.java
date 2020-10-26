package com.company;




import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
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
                "\n  Aiko \n  Audrey \n  Beli \n  Jessie \n  Kyanna \n  Tiffany\n  Kyu \n  Exit\n");

        String convochoice = scan.nextLine();

        boolean exit = false;


        do
        {
            switch (convochoice.toLowerCase()) {

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

                case "kyu":

                    talking.introducekyu();
                    String kyuconvo = scan.nextLine();
                    talking.talkkyu(kyuconvo);
                    System.out.println("\nWhich girl would you like to talk to?" +
                            "\n  Aiko \n  Audrey \n  Beli \n  Jessie \n  Kyanna \n  Tiffany\n  Exit\n");
                    System.out.println("\n");
                    convochoice=scan.nextLine();
                    break;

                case "exit":
                    exit = true;
                    break;


                default:
                    System.out.println("Please enter the name of a girl.");
                    System.out.println("\nWhich girl would you like to talk to?" +
                            "\n  Aiko \n  Audrey \n  Beli \n  Jessie \n  Kyanna \n  Tiffany\n  Exit\n");
                    System.out.println("\n");
                    convochoice=scan.nextLine();
                    break;

            }


        }
while(exit==false);


    }
    
    }
