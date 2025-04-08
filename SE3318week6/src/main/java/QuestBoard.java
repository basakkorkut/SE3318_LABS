public class QuestBoard {
    public void assignQuest(Questable character, String questName) {
        System.out.println("Assigning quest: " + questName);
        character.acceptQuest(questName);
    }
}
