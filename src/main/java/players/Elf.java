package players;

import behaviours.IShift;
import behaviours.ISpell;

public class Elf extends Player {

    private ISpell spell;
    private IShift shapeShifter;

    public Elf(String name, ISpell spell, IShift shapeShifter) {
        super(name);
        this.spell = spell;
        this.shapeShifter = shapeShifter;
    }

    public ISpell getSpell() {
        return spell;
    }

    public IShift getShapeShifter() {
        return shapeShifter;
    }

    public void setSpell(ISpell spell) {
        this.spell = spell;
    }

    public void setShapeShifter(IShift shapeShifter) {
        this.shapeShifter = shapeShifter;
    }

    public String castSpell(){
        return getSpell().castSpell();
    }

    public String shapeShift(){
        return "Elf is....." + getShapeShifter().shapeShift();
    }
}
