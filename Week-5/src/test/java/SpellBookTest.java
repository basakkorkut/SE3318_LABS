import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

public class SpellBookTest {

    @Test
    void testGetSpellByValidIndex() {
        SpellBook book = new SpellBook();
        book.addSpell("Alohomora");
        book.addSpell("Accio");
        String spell = book.getSpell(0);
        assertEquals("Alohomora", spell, "Should return the spell at index 0");
    }

    @Test
    void testGetSpellByInvalidIndex() {
        SpellBook book = new SpellBook();
        book.addSpell("Alohomora");

        assertThrows(IndexOutOfBoundsException.class, () -> {
            book.getSpell(5);
        });
    }

    @Test
    void testGetSpellsByPrefix_ExactMatch() {
        SpellBook book = new SpellBook();
        book.addSpell("Alohomora");
        book.addSpell("Accio");
        List<String> result = book.getSpellsByPrefix("Alo");
        assertEquals(1, result.size());
        assertEquals("Alohomora", result.get(0));
    }

    @Test
    void testGetSpellsByPrefix_EmptyPrefix() {
        SpellBook book = new SpellBook();
        book.addSpell("Alohomora");
        book.addSpell("Accio");
        List<String> result = book.getSpellsByPrefix("");
        assertEquals(2, result.size());
    }

    @Test
    void testGetSpellsByPrefix_NoMatch() {
        SpellBook book = new SpellBook();
        book.addSpell("Alohomora");
        book.addSpell("Accio");
        List<String> result = book.getSpellsByPrefix("XYZ");
        assertTrue(result.isEmpty(), "Should return empty list if no spells match");
    }
}
