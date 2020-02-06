package spells;

public class HealingSpell extends Spell {

    private int health;

    public HealingSpell(String name, String effect, int health) {
        super(name, effect);
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public String castSpell(){
        return getName() + " spell cast. " + getEffect() + " Receive " + getHealth() + " health.";
    }
}
