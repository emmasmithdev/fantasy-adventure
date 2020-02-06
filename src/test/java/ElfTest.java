import Animals.Cat;
import Animals.Velociraptor;
import org.junit.Before;
import org.junit.Test;
import players.Elf;
import spells.HealingSpell;
import spells.InformationSpell;

import static org.junit.Assert.assertEquals;

public class ElfTest {

    Elf elf;
    HealingSpell healingSpell;
    InformationSpell infoSpell;
    Cat cat;
    Velociraptor raptor;

    @Before
    public void before (){
        raptor = new Velociraptor("Chris", 50);
        cat = new Cat("Neo", 40);
        infoSpell = new InformationSpell("Tell All", "Talk talk talk.");
        healingSpell = new HealingSpell("Daisy Petals", "Cures fatigue.", 2);
        elf = new Elf("Buddy", healingSpell, cat);
    }

    @Test
    public void canCastHealingSpell(){
        assertEquals("Daisy Petals spell cast. Cures fatigue. Receive 2 health.", elf.castSpell());
    }

    @Test
    public void canCastInformationSpell(){
        elf.setSpell(infoSpell);
        assertEquals("Tell All spell cast. Talk talk talk.", elf.castSpell());
    }

    @Test
    public void canShapeShiftToCat(){
        assertEquals("Elf is.....now a cat...meoowwww!", elf.shapeShift());
    }

    @Test
    public void canShapeShiftToVelociraptor(){
        elf.setShapeShifter(raptor);
        assertEquals("Elf is.....now a velociraptor...rawrrrrr!", elf.shapeShift());
    }

}
