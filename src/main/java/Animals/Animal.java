package Animals;

import behaviours.IShift;

public abstract class Animal implements IShift {

    private String name;
    private int speed;

    public Animal(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }
}
