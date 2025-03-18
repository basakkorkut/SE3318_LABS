package org.example;
import org.example.Joinable;
import org.example.Quest;

import java.util.ArrayList;
import java.util.List;

public class Adventurer extends Character implements Joinable {
    private String race;
    private List<Quest> quests;

    public Adventurer(String name, String title, String race) {
        super(name, title);
        this.race = race;
        this.quests = new ArrayList<>();
    }

    public void joinQuest(Quest quest){
        this.quests.add(quest);
    }
    public void showQuests(){
        for(int i = 0; i < quests.size(); i++){
            System.out.println(quests.get(i));

        }
    }
}



