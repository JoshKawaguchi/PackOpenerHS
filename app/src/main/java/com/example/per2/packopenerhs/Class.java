package com.example.per2.packopenerhs;

import java.util.ArrayList;

public class Class {
    public ArrayList<Card> common;
    public ArrayList<Card> rare;
    public ArrayList<Card> epic;
    public ArrayList<Card> legendary;

//    1 = common
//    2 = rare
//    3 = epic
//    4 = legendary

    public Class(ArrayList<Card> set, int rarity) {
        if(rarity == 1)
        {
            common = set;
        }
        if(rarity == 2)
        {
            rare = set;
        }
        if(rarity == 3)
        {
            epic = set;
        }
        if(rarity == 4)
        {
            legendary = set;
        }
    }

}
