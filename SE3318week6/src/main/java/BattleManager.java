public class BattleManager {
   public void Battle(Hero hero,Enemy enemy){
       hero.speak();
       enemy.speak();
       if(hero.getLevel()>enemy.getLevel()){
           System.out.println("Hero win.");
           hero.levelUp();
       }
       else{
           System.out.println("Enemy win.");
           enemy.levelUp();
       }
   }
}
