package org.example;

/**
 * Represents a character in Middle Earth.
 */
public final class Character {

    // ✔ FIXED: Added Javadoc comment to variables
    private String name;
    private String race;
    private int age;

    // ✔ FIXED: Defined constant for magic number
    private static final int AGE_THRESHOLD = 50;

    /**
     * Constructs a new character with name, race, and age.
     *
     * @param name the character's name
     * @param race the character's race
     * @param age  the character's age
     */
    // ✔ FIXED: Marked parameters as final
    // ✔ FIXED: Used this. to avoid field shadowing
    public Character(final String name, final String race, final int age) {
        this.name = name;
        this.race = race;
        this.age = age;
    }

    /**
     * Prints character details to the console.
     */
    // ✔ FIXED: Added Javadoc for method
    // ✔ FIXED: Added braces to if block
    public final void printDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Race: " + this.race);
        System.out.println("Age: " + this.age);

        if (this.age > AGE_THRESHOLD) {
            System.out.println("This character is considered old.");
        }
    }
}
