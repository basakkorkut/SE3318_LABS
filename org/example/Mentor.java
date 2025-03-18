package org.example;
import java.util.ArrayList;
import java.util.List;

public class Mentor extends Character {
    private List<Quest> quests;

    public Mentor(String name, String title) {
        super(name, title);
        this.quests = new ArrayList<>();
    }
    public void assignQuest(Quest quest) {
        quests.add(quest);
    }

    public void showQuests(){
        for(int i = 0; i < quests.size(); i++){
            System.out.println(quests.get(i));
        }
    }


}
