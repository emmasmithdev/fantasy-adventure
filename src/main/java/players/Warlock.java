package players;

import behaviours.IProtect;
import behaviours.ISpell;
import mythicalCreatures.MythicalCreature;
import spells.AttackSpell;
import spells.Spell;

import java.util.ArrayList;

public class Warlock extends Player {

    private ISpell spell;
    private IProtect protector;

    public Warlock(String name, ISpell spell, IProtect protector) {
        super(name);
        this.spell = spell;
        this.protector = protector;
    }

    public ISpell getSpell() {
        return spell;
    }

    public IProtect getProtector() {
        return protector;
    }

    public void setSpell(ISpell spell) {
        this.spell = spell;
    }

    public void setProtector(IProtect protector) {
        this.protector = protector;
    }

    public String castSpell(){
        return getSpell().castSpell();
    }

    public String protection(){
        return getProtector().protect();
    }
}
