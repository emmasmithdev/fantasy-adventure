package spells;

public class AttackSpell extends Spell {

    private int damage;

    public AttackSpell(String name, String effect, int damage) {
        super(name, effect);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public String castSpell(){
        return getName() + " spell cast. " + getEffect() + " You receive " + getDamage() + " damage.";
    }
}
