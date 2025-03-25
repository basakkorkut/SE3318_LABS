import java.util.ArrayList;
import java.util.List;

public class HogwartsStudent {
    private String name;
    private String house;
    private int year;
    private List<String> spellsLearned;

    public HogwartsStudent(String name, String house, int year) {
        this.name = name;
        this.house = house;
        this.year = year;
        this.spellsLearned = new ArrayList<>();
    }
    /**
     * Teaches a new spell to the student.
     * @param spell The spell to be learned.
     * @return true if successfully added, false otherwise.
     * REQUIRES: spell != null
     * EFFECTS: Adds spell to the list if not already known.
     */


    public boolean learnSpell(String spell) {
        if (spell == null || spellsLearned.contains(spell)) {
            return false;
        }
        spellsLearned.add(spell);
        return true;
    }/**
     * Teaches a new spell to the student.
     * @param spell The spell to be learned.
     * @return true if successfully added, false otherwise.
     * REQUIRES: spell != null
     * EFFECTS: Adds spell to the list if not already known.
     */


    public boolean knowsSpell(String spell) {
        return spell != null && spellsLearned.contains(spell);
    }


    public String getName() {
        return name;
    }

    public String getHouse() {
        return house;
    }

    public int getYear() {
        return year;
    }

    public List<String> getSpellsLearned() {
        return spellsLearned;
    }
}
