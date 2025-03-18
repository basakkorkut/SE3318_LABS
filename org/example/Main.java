package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Mentor gandalf=new Mentor("Gandalf","The Grey");

        Quest ringQuest=new Quest("Destroy the one ring","Easy",gandalf);
        Quest helmQuest = new Quest("Defend Helm's Deep", "Medium","Gandalf");

        gandalf.assignQuest(ringQuest);
        gandalf.assignQuest(helmQuest);

        Adventurer frodo = new Adventurer("Frodo", "Ring", "Hobbit");
        Adventurer aragorn = new Adventurer("Aragorn", "King", "Man");
        Adventurer legolas = new Adventurer("Legolas", "Prince", "Elf");
        Adventurer gimli = new Adventurer("Gimli", "Warrior", "Dwarf");

        frodo.joinQuest(ringQuest);
        aragorn.joinQuest(helmQuest);
        legolas.joinQuest(helmQuest);
        gimli.joinQuest(helmQuest);

        frodo.showQuests();
       gandalf.showQuests();
       helmQuest.listAdventurers();


    }

}