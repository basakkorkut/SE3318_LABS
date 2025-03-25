import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MagicClassroom {
    private List<HogwartsStudent> students;

    public MagicClassroom() {
        this.students = new ArrayList<>();
    }
    /**
     * Adds a student to the classroom.
     * @param student The student to be added.
     * REQUIRES: student != null
     * EFFECTS: Adds the student to the internal list.
     */

    public void addStudent(HogwartsStudent student) {
        if (student != null) {
            students.add(student);
        }
    }
    /**
     * Finds a student by name.
     * @param name The name of the student.
     * @return the matching student or null
     * REQUIRES: name != null
     * EFFECTS: Searches the list by student name.
     */

    public HogwartsStudent findStudent(String name) {
        for (HogwartsStudent s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }
    /**
     * Finds the first student who knows a specific spell.
     * @param spell The spell to search for.
     * @return matching student or null
     * REQUIRES: spell != null
     * EFFECTS: Returns the first student who knows the spell.
     */

    public HogwartsStudent findStudentBySpell(String spell) {
        for (HogwartsStudent s : students) {
            if (s.knowsSpell(spell)) {
                return s;
            }
        }
        return null;
    }

    public List<HogwartsStudent> getStudentsByHouse(String house) {
        return students.stream()
                .filter(s -> s.getHouse().equalsIgnoreCase(house))
                .collect(Collectors.toList());
    }

    public List<HogwartsStudent> getStudentsSortedByHouse() {
        return students.stream()
                .sorted(Comparator.comparing(HogwartsStudent::getHouse))
                .collect(Collectors.toList());
    }
}
