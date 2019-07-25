package com.company;

public class SecretCharacter extends Character {

    String species;
    String homeworld;
    public String askHomeworld()
    {
        return homeworld;
    }





    public  SecretCharacter(String species, String homeworld, String name, String lastName, String hairColor, String eyeColor,
                             int heightft, int heightin, int age, boolean isFriend)
    {
        super(name, lastName, hairColor, eyeColor,  heightft, heightin, age, isFriend);
        this.species=species;
        this.homeworld=homeworld;


    }








}
