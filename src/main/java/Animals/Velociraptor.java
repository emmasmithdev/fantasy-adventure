package Animals;

import behaviours.IProtect;

public class Velociraptor extends Animal implements IProtect {

    public Velociraptor(String name, int speed) {
        super(name, speed);
    }

    public String shapeShift(){
        return "now a velociraptor...rawrrrrr!";
    }

    public String protect(){
        return "Protected by " + getName() + ". Opponent runs away in fear.";
    }
}
