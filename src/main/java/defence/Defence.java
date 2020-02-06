package defence;

import behaviours.IProtect;

public abstract class Defence implements IProtect {

    private int protectionLevel;

    public Defence(int protectionLevel) {
        this.protectionLevel = protectionLevel;
    }

    public int getProtectionLevel() {
        return protectionLevel;
    }
}
