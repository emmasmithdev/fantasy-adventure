package players;

public abstract class Player {

    private String name;
    private int health;

    public Player(String name) {
        this.name = name;
        this.health = 10;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
