package org.example;

public abstract class Character {
    protected String name;
    protected int health;
    protected int attackPower;

    public Character(String name,int health,int attackPower) {
        this.name = name; this.health = health; this.attackPower = attackPower;
    }

    public String getName() {
        if(name != null) return name;
        else return "Unknown";
    }
    public void attack(Character other) {
        System.out.println(this.name + " attacks " + other.name + " for " + this.attackPower + " damage.");
        other.health -= this.attackPower;
        if (other.health < 0) {
            other.health = 0;
        }
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }



    public boolean isDefeated() {
        if(health <= 0) return true;
        return false;
    }

    public void complexMethodExample() {

    }
    public abstract void specialAttack(Character opponent);

    public void receiveDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }
    }

}
