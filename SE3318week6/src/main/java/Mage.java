public class Mage extends Hero implements Questable {
    public Mage(String name,int level){
        super(name,level);
    }
    public void castSpell(){
        System.out.println("You attacked a Spell!");
    }
    public void speak(){
        System.out.println("I am Mage"+name);
    }
    public void acceptQuest(String questName){
        System.out.println("You accepted a quest!"+ questName);
    }

}
