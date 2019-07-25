package com.company;

public class Character {
    String name;
    String lastName;
    String hairColor;
    String eyeColor;
    String hobby;
    String favSeason;
    String favHangout;
    String favColor;
    String birthday;
    String occupation;
    String education;
    int weight;
    int heightft;
    int heightin;
    int age;
    private boolean isFriend;


//singleton pattern



    public void becomeFriends()
    {
        isFriend=true;
    }



public boolean getisFriend()
{
    return isFriend;
}

    public  Character(String name, String lastName, String hairColor, String eyeColor,
                       int heightft, int heightin, int age, boolean isFriend)
    {

        this.name= name;
        this.lastName= lastName;
        this.hairColor= hairColor;
        this.eyeColor=eyeColor;
        this.heightft= heightft;
        this.heightin= heightin;
        this.age= age;
        this.isFriend=isFriend;
    }

    public void extraProperties(String favColor, String hobby, String favSeason, String favHangout, String birthday, String occupation, String education)
    {
        this.favColor=favColor;
        this.hobby=hobby;
        this.favSeason=favSeason;
        this.favHangout=favHangout;
        this.birthday=birthday;
        this.occupation=occupation;
        this.education=education;


    }












}
