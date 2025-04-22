import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

public class MagicClassroomTest {

    @Test
    void testAddValidStudent() {
        MagicClassroom classroom = new MagicClassroom();
        HogwartsStudent student = new HogwartsStudent("Harry", "Gryffindor", 1);
        classroom.addStudent(student);

        HogwartsStudent found = classroom.findStudent("Harry");
        assertNotNull(found, "Student should be found after being added");
        assertEquals("Harry", found.getName());
    }

    @Test
    void testAddNullStudent() {
        MagicClassroom classroom = new MagicClassroom();
        classroom.addStudent(null);

        HogwartsStudent found = classroom.findStudent("AnyName");
        assertNull(found, "No student should be found since null student was not added");
    }

    @Test
    void testFindStudentByName() {
        MagicClassroom classroom = new MagicClassroom();
        HogwartsStudent harry = new HogwartsStudent("Harry", "Gryffindor", 1);
        classroom.addStudent(harry);

        HogwartsStudent result = classroom.findStudent("Harry");
        assertNotNull(result);
        assertEquals("Harry", result.getName());
    }

    @Test
    void testFindStudentBySpell() {
        MagicClassroom classroom = new MagicClassroom();
        HogwartsStudent hermione = new HogwartsStudent("Hermione", "Gryffindor", 1);
        hermione.learnSpell("Alohomora");
        classroom.addStudent(hermione);

        HogwartsStudent result = classroom.findStudentBySpell("Alohomora");
        assertNotNull(result);
        assertEquals("Hermione", result.getName());
    }

    @Test
    void testGetStudentsByHouse() {
        MagicClassroom classroom = new MagicClassroom();
        HogwartsStudent harry = new HogwartsStudent("Harry", "Gryffindor", 1);
        HogwartsStudent draco = new HogwartsStudent("Draco", "Slytherin", 1);
        classroom.addStudent(harry);
        classroom.addStudent(draco);

        List<HogwartsStudent> gryffindorStudents = classroom.getStudentsByHouse("Gryffindor");
        assertEquals(1, gryffindorStudents.size());
        assertEquals("Gryffindor", gryffindorStudents.get(0).getHouse());
    }

    @Test
    void testGetStudentsSortedByHouse() {
        MagicClassroom classroom = new MagicClassroom();
        HogwartsStudent harry = new HogwartsStudent("Harry", "Gryffindor", 1);
        HogwartsStudent draco = new HogwartsStudent("Draco", "Slytherin", 1);
        HogwartsStudent cedric = new HogwartsStudent("Cedric", "Hufflepuff", 1);
        classroom.addStudent(harry);
        classroom.addStudent(draco);
        classroom.addStudent(cedric);

        List<HogwartsStudent> sortedStudents = classroom.getStudentsSortedByHouse();

        assertEquals("Gryffindor", sortedStudents.get(0).getHouse());
        assertEquals("Hufflepuff", sortedStudents.get(1).getHouse());
        assertEquals("Slytherin", sortedStudents.get(2).getHouse());
    }
}
