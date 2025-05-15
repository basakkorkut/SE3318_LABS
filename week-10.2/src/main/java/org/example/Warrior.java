package org.example;

public class Warrior extends Character {
    public Warrior(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }
    @Override
    public void specialAttack(Character opponent) {
        int damage = this.attackPower * 2;
        System.out.println(this.name + " performs a Power Strike on " + opponent.name + " for " + damage + " damage!");
        opponent.receiveDamage(damage);
    }

}