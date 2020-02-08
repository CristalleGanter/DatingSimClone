package com.company;

import java.util.Scanner;
import java.util.Random;

public class Convo extends Main{


Scanner read = new Scanner(System.in);


    DialogueLoader loadDialogue= new DialogueLoader();

CharacterMaker makeCharacter= new CharacterMaker();






    Random random = new Random();


  //  int randomnumber = random.nextInt(8);
  //  int randomnumber2 = randomnumber+1;
   // int randomnumber3 = randomnumber+2;

    public void makerandomnumber(int randomnumber, int randomnumber2, int randomnumber3) {


       // super(randomnumber, randomnumber2, randomnumber3);

    }


    public void answerquestion(int questionnumber, String filename)
    {
        switch(questionnumber)
        {
            case 0: System.out.println(loadDialogue.getdiag(filename,"lastName:"));
                break;
            case 1: System.out.println(loadDialogue.getdiag(filename,"birthday:"));
                break;
            case 2:  System.out.println(loadDialogue.getdiag(filename,"age:"));
                break;
            case 3: System.out.println(loadDialogue.getdiag(filename,"height:"));
                break;
            case 4: System.out.println(loadDialogue.getdiag(filename,"weight:"));
                break;
            case 5: System.out.println(loadDialogue.getdiag(filename,"occupation:"));
                break;
            case 6: System.out.println(loadDialogue.getdiag(filename,"education:"));
                break;
            case 7:  System.out.println(loadDialogue.getdiag(filename,"hobby:"));
                break;
            case 8: System.out.println(loadDialogue.getdiag(filename,"favColor:"));
                break;
            case 9:  System.out.println(loadDialogue.getdiag(filename,"favSeason:"));
                break;
            case 10:  System.out.println(loadDialogue.getdiag(filename ,"favHangout:"));
                break;
        }

    }


    public void introduceaiko() {

        loadDialogue.alldiag("aikodialogue.txt", "greeting1:");
        System.out.println("\n");


        System.out.println("\n \nWhat do you want to do? \n1. Talk to her \n2. Ask Question \n3. Ask on a date \n4. Talk to another girl\n");


    }




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





    public void talkaiko(String convochoice) {

        makeCharacter.loadCharacter();

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

            case "2":

//get random numbers to initiate in main loop
                int testrandomnumber = random.nextInt(8);
                int testrandomnumber2 = testrandomnumber+1;
                int testrandomnumber3 = testrandomnumber+2;
                  System.out.println(loadDialogue.getdiag("aikodialogue.txt", "beforeplayerasks2:")+"\n");
                  System.out.print("1. ");askquestion(testrandomnumber);
                  System.out.println();
                  System.out.print("2. ");askquestion(testrandomnumber2);
                  System.out.println();
                  System.out.print("3. ");askquestion(testrandomnumber3);
                  String choosequestion = read.nextLine();
                  switch(choosequestion) {
                      case "1": answerquestion(testrandomnumber, "aikodialogue.txt");
                      break;
                      case "2": answerquestion(testrandomnumber2, "aikodialogue.txt");
                      break;
                      case "3": answerquestion(testrandomnumber3, "aikodialogue.txt");
                      break;
                  }
            break;

            case "3":
                if (  makeCharacter.getCharacter("Aiko").getisFriend())
                {
                    System.out.println(loadDialogue.getdiag("aikodialogue.txt","dateaccept:"));
                }
                else {
                    System.out.println(loadDialogue.getdiag("aikodialogue.txt", "datereject:"));
                }

            case "4": break;

        }

    }

    public void introduceaudrey() {

        loadDialogue.alldiag("audreydialogue.txt", "greeting1:");
        System.out.println("\n");
        System.out.println("\n \nWhat do you want to do? \n1. Talk to her \n2. Ask Question \n3. Ask on a date \n4. Talk to another girl\n");

    }


    public void audreyq1(String answer)
    {


        if (answer.equals("2"))
        {
            System.out.print(loadDialogue.getdiag("audreydialogue.txt", "ifcorrect1:"));
        }
        else
        {

            System.out.print(loadDialogue.getdiag("audreydialogue.txt", "ifwrong1:"));
            System.out.println("\n");
        }

    }



   public void talkaudrey (String convochoice) {

       makeCharacter.loadCharacter();

        switch (convochoice)
        {
            case "1": System.out.println(loadDialogue.getdiag("audreydialogue.txt","question1:"));
                System.out.println("1. "+ loadDialogue.getdiag("audreydialogue.txt","q1answer1:"));
                System.out.println("2. "+loadDialogue.getdiag("audreydialogue.txt","q1answer2:"));
                System.out.println("3. "+loadDialogue.getdiag("audreydialogue.txt","q1answer3:"));
                String  answer=read.nextLine();
                audreyq1(answer);
                break;

            case "2":
                int testrandomnumber = random.nextInt(8);
                int testrandomnumber2 = testrandomnumber+1;
                int testrandomnumber3 = testrandomnumber+2;
                    System.out.println(loadDialogue.getdiag("audreydialogue.txt", "beforeplayerasks2:")+"\n");
                    System.out.print("1. ");askquestion(testrandomnumber);
                    System.out.println();
                    System.out.print("2. ");askquestion(testrandomnumber2);
                    System.out.println();
                    System.out.print("3. ");askquestion(testrandomnumber3);
                String choosequestion = read.nextLine();
                switch(choosequestion) {
                    case "1": answerquestion(testrandomnumber, "audreydialogue.txt");
                        break;
                    case "2": answerquestion(testrandomnumber2, "audreydialogue.txt");
                        break;
                    case "3": answerquestion(testrandomnumber3, "audreydialogue.txt");
                        break;
                }
            break;

            case "3":
                System.out.println(loadDialogue.getdiag("audreydialogue.txt", "datereject:"));
                break;

            case "4": break;

        }

   }

    public void introducebeli() {
        loadDialogue.alldiag("belidialogue.txt", "greeting1:");
        System.out.println("\n");
        System.out.println("\n \nWhat do you want to do? \n1. Talk to her \n2. Ask Question \n3. Ask on a date " +
                "\n4. Talk to another girl\n");

    }



    public void beliq1(String answer)
    {


        if (answer.equals("1"))
        {
            System.out.print(loadDialogue.getdiag("belidialogue.txt", "ifcorrect1:"));
        }
        else
        {

            System.out.print(loadDialogue.getdiag("belidialogue.txt", "ifwrong1:"));
            System.out.println("\n");
        }

    }



    public void talkbeli(String convochoice)
    {
        makeCharacter.loadCharacter();
        switch (convochoice)
        {
            case "1": System.out.println(loadDialogue.getdiag("belidialogue.txt","question1:"));
                System.out.println("1. "+ loadDialogue.getdiag("belidialogue.txt","q1answer1:"));
                System.out.println("2. "+loadDialogue.getdiag("belidialogue.txt","q1answer2:"));
                System.out.println("3. "+loadDialogue.getdiag("belidialogue.txt","q1answer3:"));

                String  answer=read.nextLine();
                beliq1(answer);
            break;

            case "2":System.out.println(loadDialogue.getdiag("belidialogue.txt", "beforeplayerasks2:")+"\n");
                int testrandomnumber = random.nextInt(8);
                int testrandomnumber2 = testrandomnumber+1;
                int testrandomnumber3 = testrandomnumber+2;
                System.out.print("1. ");askquestion(testrandomnumber);
                System.out.println();
                System.out.print("2. ");askquestion(testrandomnumber2);
                System.out.println();
                System.out.print("3. ");askquestion(testrandomnumber3);
                String choosequestion = read.nextLine();
                switch(choosequestion) {
                    case "1": answerquestion(testrandomnumber, "belidialogue.txt");
                        break;
                    case "2": answerquestion(testrandomnumber2, "belidialogue.txt");
                        break;
                    case "3": answerquestion(testrandomnumber3, "belidialogue.txt");
                        break;
                }
            break;

            case "3":System.out.println(loadDialogue.getdiag("belidialogue.txt", "datereject:"));
            break;

            case "4": break;

        }
    }



    public void introducjessie() {

        loadDialogue.alldiag("jessiedialogue.txt", "greeting1:");
        System.out.println("\n");


        System.out.println("\n \nWhat do you want to do? \n1. Talk to her \n2. Ask Question \n3. Ask on a date " +
                "\n4. Talk to another girl\n");

    }



    public void jessieq1(String answer)
    {


        if (answer.equals("2"))
        {
            System.out.print(loadDialogue.getdiag("jessiedialogue.txt", "ifcorrect1:"));
        }
        else
        {

            System.out.print(loadDialogue.getdiag("jessiedialogue.txt", "ifwrong1:"));
            System.out.println("\n");
        }

    }


    public void talkjessie(String convochoice)
    {
        makeCharacter.loadCharacter();
        switch (convochoice)
        {
            case "1": System.out.println(loadDialogue.getdiag("jessiedialogue.txt","question1:"));
                System.out.println("1. "+ loadDialogue.getdiag("jessiedialogue.txt","q1answer1:"));
                System.out.println("2. "+loadDialogue.getdiag("jessiedialogue.txt","q1answer2:"));
                System.out.println("3. "+loadDialogue.getdiag("jessiedialogue.txt","q1answer3:"));

                String  answer=read.nextLine();
                jessieq1(answer);
                break;

            case "2":System.out.println(loadDialogue.getdiag("jessiedialogue.txt", "beforeplayerasks2:")+"\n");
                int testrandomnumber = random.nextInt(8);
                int testrandomnumber2 = testrandomnumber+1;
                int testrandomnumber3 = testrandomnumber+2;
                System.out.print("1. ");askquestion(testrandomnumber);
                System.out.println();
                System.out.print("2. ");askquestion(testrandomnumber2);
                System.out.println();
                System.out.print("3. ");askquestion(testrandomnumber3);
                String choosequestion = read.nextLine();
                switch(choosequestion) {
                    case "1": answerquestion(testrandomnumber, "jessiedialogue.txt");
                        break;
                    case "2": answerquestion(testrandomnumber2, "jessiedialogue.txt");
                        break;
                    case "3": answerquestion(testrandomnumber3, "jessiedialogue.txt");
                        break;
                }
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
        System.out.println("\n \nWhat do you want to do? \n1. Talk to her \n2. Ask Question \n3. Ask on a date " +
                "\n4. Talk to another girl\n");

    }


    public void kyannaq1(String answer)
    {


        if (answer.equals("2"))
        {
            System.out.print(loadDialogue.getdiag("kyannadialogue.txt", "ifcorrect1:"));
        }
        else
        {

            System.out.print(loadDialogue.getdiag("kyannadialogue.txt", "ifwrong1:"));
            System.out.println("\n");
        }

    }


    public void talkkyanna(String convochoice)
    {
        makeCharacter.loadCharacter();
        switch (convochoice)
        {
            case "1":System.out.println(loadDialogue.getdiag("kyannadialogue.txt","question1:"));
                System.out.println("1. "+ loadDialogue.getdiag("kyannadialogue.txt","q1answer1:"));
                System.out.println("2. "+loadDialogue.getdiag("kyannadialogue.txt","q1answer2:"));
                System.out.println("3. "+loadDialogue.getdiag("kyannadialogue.txt","q1answer3:"));

                String  answer=read.nextLine();
                kyannaq1(answer);
                break;

            case "2":System.out.println(loadDialogue.getdiag("kyannadialogue.txt", "beforeplayerasks2:")+"\n");
                int testrandomnumber = random.nextInt(8);
                int testrandomnumber2 = testrandomnumber+1;
                int testrandomnumber3 = testrandomnumber+2;
                System.out.print("1. ");askquestion(testrandomnumber);
                System.out.println();
                System.out.print("2. ");askquestion(testrandomnumber2);
                System.out.println();
                System.out.print("3. ");askquestion(testrandomnumber3);
                String choosequestion = read.nextLine();
                switch(choosequestion) {
                    case "1": answerquestion(testrandomnumber, "kyannadialogue.txt");
                        break;
                    case "2": answerquestion(testrandomnumber2, "kyannadialogue.txt");
                        break;
                    case "3": answerquestion(testrandomnumber3, "kyannadialogue.txt");
                        break;
                }
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
        System.out.println("\n \nWhat do you want to do? \n1. Talk to her \n2. Ask Question \n3. Ask on a date " +
                "\n4. Talk to another girl\n");
    }


    public void tiffanyq1(String answer)
    {


        if (answer.equals("3"))
        {
            System.out.print(loadDialogue.getdiag("tiffanydialogue.txt", "ifcorrect1:"));
        }
        else
        {

            System.out.print(loadDialogue.getdiag("tiffanydialogue.txt", "ifwrong1:"));
            System.out.println("\n");
        }

    }

    public void talktiffany(String convochoice)
    {
        makeCharacter.loadCharacter();
        switch (convochoice)
        {
            case "1": System.out.println(loadDialogue.getdiag("tiffanydialogue.txt","question1:"));
                System.out.println("1. "+ loadDialogue.getdiag("tiffanydialogue.txt","q1answer1:"));
                System.out.println("2. "+loadDialogue.getdiag("tiffanydialogue.txt","q1answer2:"));
                System.out.println("3. "+loadDialogue.getdiag("tiffanydialogue.txt","q1answer3:"));

                String  answer=read.nextLine();
                tiffanyq1(answer);
                break;

            case "2":System.out.println(loadDialogue.getdiag("tiffanydialogue.txt", "beforeplayerasks2:")+"\n");
                int testrandomnumber = random.nextInt(8);
                int testrandomnumber2 = testrandomnumber+1;
                int testrandomnumber3 = testrandomnumber+2;
                System.out.print("1. ");askquestion(testrandomnumber);
                System.out.println();
                System.out.print("2. ");askquestion(testrandomnumber2);
                System.out.println();
                System.out.print("3. ");askquestion(testrandomnumber3);
                String choosequestion = read.nextLine();
                switch(choosequestion) {
                    case "1": answerquestion(testrandomnumber, "tiffanydialogue.txt");
                        break;
                    case "2": answerquestion(testrandomnumber2, "tiffanydialogue.txt");
                        break;
                    case "3": answerquestion(testrandomnumber3, "tiffanydialogue.txt");
                        break;
                }
            break;

            case "3":System.out.println(loadDialogue.getdiag("tiffanydialogue.txt", "datereject:"));
                break;

            case "4":
                break;

        }
    }




    public void introducekyu()
    {
        loadDialogue.alldiag("kyudialogue.txt", "greeting1:");
        System.out.println("\n");
        System.out.println("\n \nWhat do you want to do? \n1. Talk to her \n2. Ask Question \n3. Ask on a date " +
                "\n4. Talk to another girl\n");

    }



    public void kyuq1(String answer)
    {
        if (answer.equals("2"))
        {
            System.out.print(loadDialogue.getdiag("kyudialogue.txt", "ifcorrect1:"));
        }
        else
        {
            System.out.print(loadDialogue.getdiag("kyudialogue.txt", "ifwrong1:"));
            System.out.println("\n");
        }

    }


    public void talkkyu(String convochoice)
    {
        makeCharacter.loadSecretCharacter();
        switch (convochoice)
        {
            case "1": System.out.println(loadDialogue.getdiag("kyudialogue.txt","question1:"));
                System.out.println("1. "+ loadDialogue.getdiag("kyudialogue.txt","q1answer1:"));
                System.out.println("2. "+loadDialogue.getdiag("kyudialogue.txt","q1answer2:"));
                System.out.println("3. "+loadDialogue.getdiag("kyudialogue.txt","q1answer3:"));
                String  answer=read.nextLine();
                kyuq1(answer);
                break;

            case "2":System.out.println(loadDialogue.getdiag("kyudialogue.txt", "beforeplayerasks2:")+"\n");
                int testrandomnumber = random.nextInt(8);
                int testrandomnumber2 = testrandomnumber+1;
                int testrandomnumber3 = testrandomnumber+2;
                System.out.print("1. ");askquestion(testrandomnumber);
                System.out.println();
                System.out.print("2. ");askquestion(testrandomnumber2);
                System.out.println();
                System.out.print("3. ");askquestion(testrandomnumber3);
                break;

            case "3":
                if (  makeCharacter.getSecretCharacter("Kyu").getisFriend() )
            {
                System.out.println(loadDialogue.getdiag("kyudialogue.txt","dateaccept:"));
            }
            else {
                System.out.println(loadDialogue.getdiag("kyudialogue.txt", "datereject:"));
            }
                break;

            case "4": break;

        }
    }


    public void talkceleste(String convochoice)
    {
        makeCharacter.loadSecretCharacter();
        switch (convochoice)
        {
            case "1":System.out.println(loadDialogue.getdiag("celestedialogue.txt","question1:"));
                System.out.println("1. "+ loadDialogue.getdiag("celestedialogue.txt","q1answer1:"));
                System.out.println("2. "+loadDialogue.getdiag("celestedialogue.txt","q1answer2:"));
                System.out.println("3. "+loadDialogue.getdiag("celestedialogue.txt","q1answer3:"));

                String  answer=read.nextLine();
                break;

            case "2":
                break;

            case "3":


                break;

            case "4":
                break;

        }
    }





public void askquestion(int randomnumber)
{

    switch(randomnumber)
    {
        case 0: System.out.println(loadDialogue.getdiag("questions.txt","asklastname:"));
        break;
        case 1: System.out.println(loadDialogue.getdiag("questions.txt","askbirthday:"));
        break;
        case 2:  System.out.println(loadDialogue.getdiag("questions.txt","askage:"));
        break;
        case 3: System.out.println(loadDialogue.getdiag("questions.txt","askheight:"));
        break;
        case 4: System.out.println(loadDialogue.getdiag("questions.txt","askweight:"));
        break;
        case 5: System.out.println(loadDialogue.getdiag("questions.txt","askoccupation:"));
        break;
        case 6: System.out.println(loadDialogue.getdiag("questions.txt","askeducation:"));
        break;
        case 7:  System.out.println(loadDialogue.getdiag("questions.txt","askhobby:"));
        break;
        case 8: System.out.println(loadDialogue.getdiag("questions.txt","askfavcolor:"));
        break;
        case 9:  System.out.println(loadDialogue.getdiag("questions.txt","askfavseason:"));
        break;
        case 10:  System.out.println(loadDialogue.getdiag("questions.txt","askfavhangout:"));
        break;
}


}



public void asksecretquestion()
{
    System.out.println(loadDialogue.getdiag("questions.txt","seccharasklastname:"));
    System.out.println(loadDialogue.getdiag("questions.txt","seccharaskhomeworld:"));
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
