package Animals;

public class Cat extends Animal {

    public Cat(String name, int speed) {
        super(name, speed);
    }

    public String shapeShift(){
        return "now a cat...meoowwww!";
    }
}
