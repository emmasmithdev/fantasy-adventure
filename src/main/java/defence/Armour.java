package defence;

public class Armour extends Defence {

    private String material;

    public Armour(int protectionLevel, String material) {
        super(protectionLevel);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public String protect(){
        return "Protect with " + getMaterial() + " armour! Reduce damage by " + getProtectionLevel() + ".";
    }
}
