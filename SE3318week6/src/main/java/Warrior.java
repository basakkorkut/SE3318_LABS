public class Warrior extends Hero implements Questable{
    public Warrior(String name,int level){
        super(name,level);
    }
    public void attack(){
        System.out.println("You attacked a warrior!");
    }
    public void acceptQuest(String questName){
        System.out.println("You accepted a quest!"+ questName);
    }
    public void speak(){
        System.out.println("I am a warrior!");
    }
}
