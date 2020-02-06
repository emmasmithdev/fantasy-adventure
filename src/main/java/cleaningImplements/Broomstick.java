package cleaningImplements;

import behaviours.IFly;

public class Broomstick implements IFly {

    private String make;
    private int speed;

    public Broomstick(String make, int speed) {
        this.make = make;
        this.speed = speed;
    }

    public String getMake() {
        return make;
    }

    public int getSpeed() {
        return speed;
    }

    public String fly(){
        return "Hovering...lifting up...flying!";
    }
}
