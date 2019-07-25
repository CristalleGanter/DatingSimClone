package com.company;

import java.util.ArrayList;

public class CharacterMaker {


    ArrayList<Character> characters= new ArrayList<>();
    ArrayList<SecretCharacter> secretCharacters= new ArrayList<>();



    // maker.getCharacter("Aiko");

    public Character getCharacter(String characterName) {
        for (Character someCharacter : this.characters) {
            if (someCharacter.name.equals(characterName)) {
                return someCharacter;
            }
        }
        return null;
    }

    // Character character = new Character("Aiko", "Yumi", "black",
    //  "grey", "D", 5, 4, 109, 28);
    // character.extraProperties("mint green", "gambling", "autumn","casino", "November 9th");

    // characters.add(character);

    // character = new Character()


    public void loadCharacter() {





        Character Aiko = new Character("Aiko", "Yumi", "black",
                "light grey",  5, 4, 28, false);
        Aiko.extraProperties("mint green", "gambling", "autumn", "casino",
                "November 9th", "university professor", "master's degree");


        Character Audrey = new Character("Audrey", "Belrose",
                "red", "red",  5, 2, 21, false);
        Audrey.extraProperties("velvet red", "shopping", "spring", "nightclub",
                "April 6th", "college student", "attending university");


        Character Beli = new Character("Beli", "Lapran",
                "black", "fuchsia",  5, 11, 23, false);
        Beli.extraProperties("lilac purple", "meditation", "autumn", "park",
                "June 25th", "yoga instructor", "2 year degree");


        Character Jessie = new Character("Jessie", "Maye",
                "blonde", "blue",  5, 7,  36,false);
        Jessie.extraProperties("sherbert orange", "drinking", "winter", "bar and lounge",
                "January 27th", "adult actress", "dropout");


        Character Kyanna = new Character("Kyanna", "Delrio", "black",
                "violet",  5, 6, 21, false);
        Kyanna.extraProperties("ocean blue", "working out", "summer", "the gym",
                "March 16th", "hairdresser", "dropout");




        Character Tiffany = new Character("Tiffany", "Maye", "blonde",
                "blue",  5, 4,  20, false);

        Tiffany.extraProperties("milky pink", "cheerleading", "summer", "on campus",
                "December 22nd", "college student", "attending university");







        characters.add(Aiko);
        characters.add(Audrey);
        characters.add(Beli);
        characters.add(Jessie);
        characters.add(Kyanna);
        characters.add(Tiffany);



    }






public void loadSecretCharacter()
{

    SecretCharacter Kyu = new SecretCharacter("fairy", "Sky Garden", "Kyu", "Sugardust", "pink", "green", 5, 4, 384, false);
    Kyu.extraProperties("pink", "watching porn", "summer", "your room",
            "August 3rd", "love fairy", "fairy school");







    secretCharacters.add(Kyu);





}







}












