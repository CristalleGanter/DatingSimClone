package com.company;

import java.util.Scanner;


public class Convo extends Main{


Scanner read = new Scanner(System.in);


    DialogueLoader loadDialogue= new DialogueLoader();





//several methods for different aspects of convo?


    public void aikoq1(String answer)
    {


      if (answer.equals("1"))
      {
          System.out.print(loadDialogue.getdiag("aikodialogue.txt", "ifcorrect1:"));
      }
      else
      {

          System.out.print(loadDialogue.getdiag("aikodialogue.txt", "ifwrong1:"));
          System.out.println("\n");
      }

    }




    public void introduceaiko() {

        loadDialogue.alldiag("aikodialogue.txt", "greeting1:");
        System.out.println("\n");


        System.out.println("\n \nWhat do you want to do? \n1. Talk to her \n2. Ask Question \n3. Ask on a date \n4. Talk to another girl\n");


    }


public void talkaiko(String convochoice) {



    switch (convochoice)
    {
        case "1":
            System.out.println(loadDialogue.getdiag("aikodialogue.txt","question1:"));
            System.out.println("1. "+ loadDialogue.getdiag("aikodialogue.txt","q1answer1:"));
            System.out.println("2. "+loadDialogue.getdiag("aikodialogue.txt","q1answer2:"));
            System.out.println("3. "+loadDialogue.getdiag("aikodialogue.txt","q1answer3:"));

          String  answer=read.nextLine();
           aikoq1(answer);
            break;

        case "2":System.out.println(loadDialogue.getdiag("aikodialogue.txt", "beforeplayerasks2:"));
        break;

        case "3":System.out.println(loadDialogue.getdiag("aikodialogue.txt", "datereject:"));

        case "4": break;

    }


    }




    public void introduceaudrey() {

        loadDialogue.alldiag("audreydialogue.txt", "greeting1:");
        System.out.println("\n");


        System.out.println("\n \nWhat do you want to do? \n1. Talk to her \n2. Ask Question \n3. Ask on a date \n4. Talk to another girl\n");


    }


   public void talkaudrey (String convochoice) {



switch (convochoice)
       {
           case "1": System.out.println(loadDialogue.getdiag("audreydialogue.txt","question1:"));
               System.out.println("1. "+ loadDialogue.getdiag("audreydialogue.txt","q1answer1:"));
               System.out.println("2. "+loadDialogue.getdiag("audreydialogue.txt","q1answer2:"));
               System.out.println("3. "+loadDialogue.getdiag("audreydialogue.txt","q1answer3:"));

               break;

           case "2":System.out.println(loadDialogue.getdiag("audreydialogue.txt", "beforeplayerasks2:"));
           break;

           case "3":System.out.println(loadDialogue.getdiag("audreydialogue.txt", "datereject:"));
           break;

           case "4": break;

       }





   }

    public void introducebeli() {

        loadDialogue.alldiag("belidialogue.txt", "greeting1:");
        System.out.println("\n");


        System.out.println("\n \nWhat do you want to do? \n1. Talk to her \n2. Ask Question \n3. Ask on a date \n4. Talk to another girl\n");


    }




    public void talkbeli(String convochoice)
    {

        switch (convochoice)
        {
            case "1": System.out.println(loadDialogue.getdiag("belidialogue.txt", "greeting2:"));
            break;

            case "2":System.out.println(loadDialogue.getdiag("belidialogue.txt", "beforeplayerasks2:"));
            break;

            case "3":System.out.println(loadDialogue.getdiag("belidialogue.txt", "datereject:"));
            break;

            case "4": break;

        }
    }



    public void introducjessie() {

        loadDialogue.alldiag("jessiedialogue.txt", "greeting1:");
        System.out.println("\n");


        System.out.println("\n \nWhat do you want to do? \n1. Talk to her \n2. Ask Question \n3. Ask on a date \n4. Talk to another girl\n");


    }





    public void talkjessie(String convochoice)
    {

        switch (convochoice)
        {
            case "1": System.out.println(loadDialogue.getdiag("jessiedialogue.txt", "greeting2:"));
                break;

            case "2":System.out.println(loadDialogue.getdiag("jessiedialogue.txt", "beforeplayerasks2:"));
                break;

            case "3":System.out.println(loadDialogue.getdiag("jessiedialogue.txt", "datereject:"));
                break;

            case "4":
                break;

        }
    }







    public void introducekyanna() {

        loadDialogue.alldiag("kyannadialogue.txt", "greeting1:");
        System.out.println("\n");


        System.out.println("\n \nWhat do you want to do? \n1. Talk to her \n2. Ask Question \n3. Ask on a date \n4. Talk to another girl\n");


    }




    public void talkkyanna(String convochoice)
    {

        switch (convochoice)
        {
            case "1": System.out.println(loadDialogue.getdiag("kyannadialogue.txt", "greeting2:"));
                break;

            case "2":System.out.println(loadDialogue.getdiag("kyannadialogue.txt", "beforeplayerasks2:"));
                break;

            case "3":System.out.println(loadDialogue.getdiag("kyannadialogue.txt", "datereject:"));
                break;

            case "4":
                break;

        }
    }






    public void introducetiffany() {

        loadDialogue.alldiag("tiffanydialogue.txt", "greeting1:");
        System.out.println("\n");


        System.out.println("\n \nWhat do you want to do? \n1. Talk to her \n2. Ask Question \n3. Ask on a date \n4. Talk to another girl\n");


    }


    public void talktiffany(String convochoice)
    {

        switch (convochoice)
        {
            case "1": System.out.println(loadDialogue.getdiag("tiffanydialogue.txt", "greeting2:"));
                break;

            case "2":System.out.println(loadDialogue.getdiag("tiffanydialogue.txt", "beforeplayerasks2:"));
                break;

            case "3":System.out.println(loadDialogue.getdiag("tiffanydialogue.txt", "datereject:"));
                break;

            case "4":
                break;

        }
    }


       /*


    public void talkaiko (String convo)
    {




        if(convochoice.equals("1")) {
            if (convo.equals("1")) {
                System.out.println(loadDialogue.getdiag("aikodialogue.txt", "ifcorrect1:"));
                makeCharacter.getCharacter("Aiko").becomeFriends();
            } else {
                System.out.println(loadDialogue.getdiag("aikodialogue.txt", "ifwrong1:"));
            }
        }


        if(convochoice.equals("2")) {
            makeCharacter.getCharacter("Aiko").becomeFriends();
            if (convo.equals("1")) {
                System.out.println(loadDialogue.getdiag("aikodialogue.txt", "lastName:"));
            } else {
                System.out.println(loadDialogue.getdiag("aikodialogue.txt", "hobby:"));
            }
        }

        if(convochoice.equals("3")) {
            if (!makeCharacter.getCharacter("Aiko").getisFriend()) {
                System.out.println(loadDialogue.getdiag("aikodialogue.txt", "datereject:"));}
            else {
                System.out.println(loadDialogue.getdiag("aikodialogue.txt", "dateaccept:"));
                date1.goOnDate();
                date1.dressUp("aikoswimsuit:");
                scenario.startScenario("beachscen:");
                scenario.startScenario("beachscenop1:");
                scenario.startScenario("beachscenop2:");
                String datechoice=read.nextLine();

                if (datechoice.equals("1"))
                {

                    System.out.println("Now that they know they can get away with it, that group keeps 'accidentally' hitting their ball towards you. At one point it knocked over Aiko's soda bottle and stained her bag!");
                    System.out.println(loadDialogue.getdiag("aikodialogue.txt","datefail:"));
                }
                else
                {
                    System.out.println("Aiko couldn't stop laughing after you throw the ball and the group has to swim out to get it back. She's got quite a mean streak in her.\n The two of you swim in the ocean a bit and have a good time.");

                    System.out.println("Aiko:"+loadDialogue.getdiag("aikodialogue.txt", "datesuccess:"));
                    date1.unlockCharacter();
                    date3.goOnDate();
                    date3.dressUp("kyucasual");
                    scenario.startScenario("gardenscen:");
                    scenario.startScenario("gardenscenop1:");
                    scenario.startScenario("gardenscenop2:");
                    String datechoicespec=read.nextLine();
                    if (datechoicespec.equals("1"))
                    {
                        System.out.println("You try to hold in your sneeze, but just can't. You scare away the butterfly and get snot all over Kyu!");
                        System.out.println("Kyu:"+loadDialogue.getdiag("kyudialogue.txt", "datefail:"));
                    }
                    else
                    {
                        System.out.println("You decide to just sneeze, and as you take a deep breath, the tickle in your nose suddenly vanishes. \nKyu enjoys interacting with the butterfly while it sites on your face. apparently fairies and butterflies can understand each other.");
                        System.out.println("Kyu:"+loadDialogue.getdiag("kyudialogue.txt", "datesuccess:"));
                    }

                }

            }
        }
    }

*/

}
