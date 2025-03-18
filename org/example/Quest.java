package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Quest {
    private String name;
    private String difficulty;
    private Mentor mentor;
    private List<Adventurer> adventurers;

    Quest(String name,String difficulty,Mentor mentor){
        this.name = name;
        this.difficulty = difficulty;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }
    public void setAdventurers(List<Adventurer> adventurers) {
        this.adventurers = adventurers;
    }
    public void addAdventurer(Adventurer adventurer) {
        adventurers.add(adventurer);
    }
    public String getName() {
        return name;
    }
    public void listAdventurers(){
        System.out.println("Adventurers in quests"+name);
        for(Adventurer adventurer : adventurers){
            System.out.println(adventurer.getName());
        }
    }
}

