package org.example;

public class Mage extends Character {
    public Mage(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void specialAttack(Character opponent) {
        int damage = this.attackPower + 40;
        System.out.println(this.name + " casts Fireball on " + opponent.name + " for " + damage + " damage!");
        opponent.receiveDamage(damage);
    }

}
