package mythicalCreatures;

import behaviours.IProtect;

public abstract class MythicalCreature implements IProtect {

    private String name;
    private int health;
    private int protectionLevel;

    public MythicalCreature(String name, int health, int protectionLevel) {
        this.name = name;
        this.health = health;
        this.protectionLevel = protectionLevel;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getProtectionLevel() {
        return protectionLevel;
    }

    public String protect(){
        return "Protected by " + getName() + ". Remove " + getProtectionLevel() + " from damage.";
    }
}
