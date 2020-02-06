package players;

import behaviours.ISpell;
import spells.HealingSpell;

public class Cleric extends Player {

    private HealingSpell spell;

    public Cleric(String name, HealingSpell spell) {
        super(name);
        this.spell = spell;
    }

    public ISpell getSpell() {
        return spell;
    }

    public String castSpell(){
        return getSpell().castSpell();
    }

}
