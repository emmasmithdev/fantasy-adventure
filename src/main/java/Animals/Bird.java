package Animals;

import behaviours.IFly;

public class Bird extends Animal implements IFly {

    public Bird(String name, int speed) {
        super(name, speed);
    }

    public String shapeShift(){
        return "now a bird...squawk!";
    }

    public String fly(){
        return "Flapping...leaping...flying!";
    }
}
