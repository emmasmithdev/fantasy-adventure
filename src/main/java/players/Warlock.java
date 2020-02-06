package players;

import behaviours.ISpell;
import mythicalCreatures.MythicalCreature;
import spells.Spell;

import java.util.ArrayList;

public class Warlock extends Player {

    private Spell spell;
    private MythicalCreature protector;

    public Warlock(String name, Spell spell, MythicalCreature protector) {
        super(name);
        this.spell = spell;
        this.protector = protector;
    }

    public Spell getSpell() {
        return spell;
    }

    public MythicalCreature getProtector() {
        return protector;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public void setProtector(MythicalCreature protector) {
        this.protector = protector;
    }
}
