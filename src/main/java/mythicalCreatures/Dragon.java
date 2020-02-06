package mythicalCreatures;

import behaviours.IFly;

public class Dragon extends MythicalCreature implements IFly {

    public Dragon(String name, int health, int protectionLevel) {
        super(name, health, protectionLevel);
    }

    public String fly(){
        return "Running...flapping wings...flying!";
    }
}
