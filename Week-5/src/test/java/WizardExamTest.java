import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class WizardExamTest {

    @Test
    void testPassWhenAllSpellsKnown() {
        List<String> requiredSpells = Arrays.asList("Expelliarmus", "Alohomora");
        WizardExam exam = new WizardExam(requiredSpells);

        HogwartsStudent student = new HogwartsStudent("Harry", "Gryffindor", 1);
        student.learnSpell("Expelliarmus");
        student.learnSpell("Alohomora");

        assertTrue(exam.pass(student), "Student should pass if all required spells are known");
    }

    @Test
    void testFailWhenSpellsMissing() {
        List<String> requiredSpells = Arrays.asList("Expelliarmus", "Alohomora");
        WizardExam exam = new WizardExam(requiredSpells);

        HogwartsStudent student = new HogwartsStudent("Ron", "Gryffindor", 1);
        student.learnSpell("Expelliarmus");

        assertFalse(exam.pass(student), "Student should fail if not all spells are known");
    }

    @Test
    void testEvaluateOutput() {
        List<String> requiredSpells = Arrays.asList("Expelliarmus");
        WizardExam exam = new WizardExam(requiredSpells);

        HogwartsStudent student = new HogwartsStudent("Hermione", "Gryffindor", 1);
        student.learnSpell("Expelliarmus");


        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        exam.evaluate(student);

        String output = outContent.toString().trim();
        assertEquals("Hermione passed the exam!", output);

        System.setOut(System.out);
    }
}
