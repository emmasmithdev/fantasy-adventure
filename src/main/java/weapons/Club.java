package weapons;

public class Club extends Weapon {

    private int weight;

    public Club(int damage, int weight) {
        super(damage);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String fight(){
        return "Smash with a " + getWeight() + " pound club!";
    }
}
