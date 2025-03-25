import java.util.Random;

public class Duel {
    public static void start(HogwartsStudent s1, HogwartsStudent s2, String spell) {
        boolean s1Knows = s1.knowsSpell(spell);
        boolean s2Knows = s2.knowsSpell(spell);

        System.out.println("Duel between " + s1.getName() + " and " + s2.getName() + " using spell: " + spell);

        if (!s1Knows && !s2Knows) {
            System.out.println("Draw! Neither knows the spell.");
        } else if (s1Knows && !s2Knows) {
            System.out.println(s1.getName() + " wins!");
        } else if (!s1Knows && s2Knows) {
            System.out.println(s2.getName() + " wins!");
        } else {
            Random rand = new Random();
            if (rand.nextBoolean()) {
                System.out.println(s1.getName() + " wins by magical strength!");
            } else {
                System.out.println(s2.getName() + " wins by magical strength!");
            }
        }
    }
}
