import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class HogwartsStudentTest {

    @Test
    void testLearnValidSpell(){
        HogwartsStudent student =new HogwartsStudent("Harry","Gryffindor",1);
        boolean result=student.learnSpell("Expelliarmus");
        assertTrue(result,"Valid spell should be learned successfully");
        assertTrue(student.knowsSpell("Expelliarmus"));


    }
    @Test
    void testKnowsSpell() {
        HogwartsStudent student = new HogwartsStudent("Harry", "Gryffindor", 1);
        student.learnSpell("Expelliarmus");
        assertTrue(student.knowsSpell("Expelliarmus"), "Should know learned spell");
        assertFalse(student.knowsSpell("Avada Kedavra"), "Should not know unlearned spell");
    }
    @Test
    void testLearnNullSpell() {
        HogwartsStudent student = new HogwartsStudent("Harry", "Gryffindor", 1);
        boolean result = student.learnSpell(null);
        assertFalse(result, "Learning null spell should fail");
    }

    @Test
    void testLearnDuplicateSpell() {
        HogwartsStudent student = new HogwartsStudent("Harry", "Gryffindor", 1);
        student.learnSpell("Expelliarmus");
        boolean secondAttempt = student.learnSpell("Expelliarmus");
        assertFalse(secondAttempt, "Learning duplicate spell should fail");
        assertEquals(1, student.getSpellsLearned().size(), "Spell should not be duplicated");
    }



}
