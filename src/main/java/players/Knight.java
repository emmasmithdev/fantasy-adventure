package players;

import behaviours.IFight;
import behaviours.IProtect;

public class Knight extends Player {

    private IFight weapon;
    private IProtect defence;

    public Knight(String name, IFight weapon, IProtect defence) {
        super(name);
        this.weapon = weapon;
        this.defence = defence;
    }

    public IFight getWeapon() {
        return weapon;
    }

    public IProtect getDefence() {
        return defence;
    }

    public void setWeapon(IFight weapon) {
        this.weapon = weapon;
    }

    public void setDefence(IProtect defence) {
        this.defence = defence;
    }
}
