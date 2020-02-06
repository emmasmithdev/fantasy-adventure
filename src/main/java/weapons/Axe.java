package weapons;

public class Axe extends Weapon {

    private int force;

    public Axe(int damage, int force) {
        super(damage);
        this.force = force;
    }

    public int getForce() {
        return force;
    }

    public String fight(){
        return "Chop with a force " + getForce() + " axe! Receive " + getDamage() + " damage.";
    }
}
