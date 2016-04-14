package com.company;

class Country {

    String name, ShortHistory, PoliticalStructure;
    //map is not a string, so I should put in an URL of google maps?
    // Or maybe just a picture of political map of the country and it's position? Or both?
}

public class App {

    public static void main(String[] args) {

        Country country1 = new Country();
        Country country2 = new Country();
        Country country3 = new Country();

        country1.name = "Country";
        country2.name = "Bosnia and Herzegovina";
        country3.name = "Russia";


        country1.ShortHistory = "ShortHistory";
        country2.ShortHistory = "ShortHistory";
        country3.ShortHistory = "ShortHistory";


        country1.PoliticalStructure = "PoliticalStructure";
        country2.PoliticalStructure = "PoliticalStructure";
        country3.PoliticalStructure = "PoliticalStructure";


 //how do we put the map??

    }
}
public class HumanRights extends App{


}
