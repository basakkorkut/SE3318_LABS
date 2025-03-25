import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        HogwartsStudent Harry = new HogwartsStudent("Harry", "Gryffindor", 3);
        HogwartsStudent Draco = new HogwartsStudent("Draco", "Slytherin", 3);
        HogwartsStudent Luna = new HogwartsStudent("Luna", "Ravenclaw", 3);
        HogwartsStudent Hermione=new HogwartsStudent("Hermione","Gryffindor",3);
        HogwartsStudent Basak=new HogwartsStudent("Basak","Ravenclaw",1);


        Harry.learnSpell("Expelliarmus");
        Draco.learnSpell("Serpensortia");
        Luna.learnSpell("Lumos");
        Hermione.learnSpell("Expelliarmus");
        Basak.learnSpell("AvraKadavra");

        System.out.println("Harry knows Expelliarmus: " + Harry.knowsSpell("Expelliarmus"));


        SpellBook book = new SpellBook();
        book.addSpell("Expelliarmus");
        book.addSpell("Expecto Patronum");
        book.addSpell("Lumos");
        book.addSpell("Levicorpus");

        System.out.println("Spells starting with 'Ex': " + book.getSpellsByPrefix("Ex"));


        MagicClassroom class1 = new MagicClassroom();
        class1.addStudent(Harry);
        class1.addStudent(Draco);
        class1.addStudent(Luna);
        class1.addStudent(Basak);

        System.out.println("Find student by spell 'Lumos': " + class1.findStudentBySpell("Lumos").getName());


        WizardExam exam = new WizardExam(Arrays.asList("Lumos", "Expelliarmus"));
        exam.evaluate(Harry);
        exam.evaluate(Luna);


        Duel.start(Harry, Draco, "Expelliarmus");
        Duel.start(Harry, Luna, "Levicorpus");
    }
}
