package players;

import behaviours.IFly;
import behaviours.IProtect;
import behaviours.ISpell;
import spells.Spell;

public class Wizard extends Player {

    private ISpell spell;
    private IProtect protector;
    private IFly flyable;

    public Wizard(String name, ISpell spell, IProtect protector, IFly flyable) {
        super(name);
        this.spell = spell;
        this.protector = protector;
        this.flyable = flyable;
    }

    public ISpell getSpell() {
        return spell;
    }

    public IProtect getProtector() {
        return protector;
    }

    public IFly getFlyable() {
        return flyable;
    }

    public void setSpell(ISpell spell) {
        this.spell = spell;
    }

    public void setProtector(IProtect protector) {
        this.protector = protector;
    }

    public void setFlyable(IFly flyable) {
        this.flyable = flyable;
    }

    public String castSpell(){
        return getSpell().castSpell();
    }

    public String protection(){
        return getProtector().protect();
    }

    public String fly(){
        return getFlyable().fly();
    }
}
