package org.example;

/**
 *  Entry point of the application.
 *
 */
// ✔ FIXED: Left curly placed on same line with class declaration
public class App {
    //  Magic number extracted to constant
    private static final int QUEST_POINTS = 100;

    public static void main(String[] args) {


        Character frodo = new Character("Frodo", "Hobbit", 50);
        Character basak=new Character("Basak","Hobbit",23);
        basak.printDetails();
        frodo.printDetails();

        MiddleEarthMap map = new MiddleEarthMap();
        map.navigate( "Mordor",true);


        Quest quest = new Quest();
        quest.completeQuest(QUEST_POINTS, true);

    }
}

