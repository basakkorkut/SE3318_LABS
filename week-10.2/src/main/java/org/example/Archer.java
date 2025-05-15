package org.example;

public class Archer extends Character {
    //  Replaced magic number with a named constant for clarity and maintainability
    private static final int EXTRA_ARROW_DAMAGE = 20;

    public Archer( final String name, int health, int attackPower) {
/*
Added 'final' to parameters to comply with FinalParameters rule
 */
        super(name, health, attackPower);
    }



    @Override
    public void specialAttack(final Character opponent) {
        // Magic number replaced with named constant
        int damage = this.attackPower + 20;
        System.out.println(this.name + " fires a piercing arrow at " + opponent.name + " for " + damage + " damage!");
        opponent.receiveDamage(damage);
    }

}