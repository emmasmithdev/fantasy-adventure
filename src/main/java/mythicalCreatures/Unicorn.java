package mythicalCreatures;

import behaviours.IFly;

public class Unicorn extends MythicalCreature implements IFly {

    public Unicorn(String name, int health, int protectionLevel) {
        super(name, health, protectionLevel);
    }

    public String fly(){
        return "Galloping...raise front legs...jump...flying!";
    }
}
