package weapons;

public class Sword extends Weapon {

    private String length;

    public Sword(int damage, String length) {
        super(damage);
        this.length = length;
    }

    public String getLength() {
        return length;
    }

    public String fight(){
        return "Slice with a " + getLength() + "sword!";
    }
}
