import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DuelTest {

    @Test
    void testDuelBothKnowSpell() {
        HogwartsStudent s1 = new HogwartsStudent("Harry", "Gryffindor", 1);
        HogwartsStudent s2 = new HogwartsStudent("Draco", "Slytherin", 1);
        s1.learnSpell("Expelliarmus");
        s2.learnSpell("Expelliarmus");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Duel.start(s1, s2, "Expelliarmus");

        String output = outContent.toString();
        assertTrue(output.contains("wins by magical strength!"));

        System.setOut(System.out);
    }

    @Test
    void testDuelOnlyOneKnowsSpell() {
        HogwartsStudent s1 = new HogwartsStudent("Harry", "Gryffindor", 1);
        HogwartsStudent s2 = new HogwartsStudent("Draco", "Slytherin", 1);
        s1.learnSpell("Expelliarmus");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Duel.start(s1, s2, "Expelliarmus");

        String output = outContent.toString();
        assertTrue(output.contains("Harry wins!"));

        System.setOut(System.out);
    }

    @Test
    void testDuelNeitherKnowsSpell() {
        HogwartsStudent s1 = new HogwartsStudent("Harry", "Gryffindor", 1);
        HogwartsStudent s2 = new HogwartsStudent("Draco", "Slytherin", 1);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Duel.start(s1, s2, "Expelliarmus");

        String output = outContent.toString();
        assertTrue(output.contains("Draw! Neither knows the spell."));

        System.setOut(System.out);
    }

    @Test
    void testDuelNullSpell() {
        HogwartsStudent s1 = new HogwartsStudent("Harry", "Gryffindor", 1);
        HogwartsStudent s2 = new HogwartsStudent("Draco", "Slytherin", 1);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Duel.start(s1, s2, null);

        String output = outContent.toString();
        assertTrue(output.contains("Draw! Neither knows the spell."));

        System.setOut(System.out);
    }
}
