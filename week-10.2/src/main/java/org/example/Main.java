package org.example;



public class Main {
    public static void main(String[] args) {
        Character mage = new Mage("Gandalf", 100, 30);
        Character warrior = new Warrior("Aragorn", 150, 20);
        Character archer = new Archer("Legolas", 120, 25);

        mage.attack(warrior);
        warrior.attack(archer);
        archer.attack(mage);

        System.out.println("\nAfter attacks:");
        System.out.println(mage);
        System.out.println(warrior);
        System.out.println(archer);

        mage.specialAttack(warrior);

    }
}

