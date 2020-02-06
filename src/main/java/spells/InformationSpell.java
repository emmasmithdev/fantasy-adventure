package spells;

public class InformationSpell extends Spell{

    public InformationSpell(String name, String effect) {
        super(name, effect);
    }


    public String castSpell(){
        return getName() + " spell cast. " + getEffect();
    }
}
