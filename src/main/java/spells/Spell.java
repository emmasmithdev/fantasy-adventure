package spells;

import behaviours.ISpell;

public abstract class Spell implements ISpell {

    private String name;
    private String effect;

    public Spell(String name, String effect) {
        this.name = name;
        this.effect = effect;
    }

    public String getName() {
        return name;
    }

    public String getEffect() {
        return effect;
    }
}
