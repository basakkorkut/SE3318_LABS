import java.util.List;

public class WizardExam {
    private List<String> requiredSpells;

    public WizardExam(List<String> requiredSpells) {
        this.requiredSpells = requiredSpells;
    }

    public boolean pass(HogwartsStudent student) {
        return requiredSpells.stream().allMatch(student::knowsSpell);
    }

    public void evaluate(HogwartsStudent student) {
        if (pass(student)) {
            System.out.println(student.getName() + " passed the exam!");
        } else {
            System.out.println(student.getName() + " failed the exam.");
        }
    }
}
