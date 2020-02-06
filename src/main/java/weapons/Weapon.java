package weapons;

import behaviours.IFight;

public abstract class Weapon implements IFight {

    private int damage;

    public Weapon(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
