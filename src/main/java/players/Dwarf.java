package players;

import behaviours.IFight;

public class Dwarf extends Player {

    private IFight weapon;

    public Dwarf(String name, IFight weapon) {
        super(name);
        this.weapon = weapon;
    }

    public IFight getWeapon() {
        return weapon;
    }

    public void setWeapon(IFight weapon) {
        this.weapon = weapon;
    }

    public String fight(){
        return this.weapon.fight();
    }

    public void loseHealth(int amount){
        int health = getHealth();
        this.setHealth(health - amount);
    }

    public void addHealth(int amount){
        int health = getHealth();
        this.setHealth(health + amount);
    }
}
