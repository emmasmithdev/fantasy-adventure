import org.junit.Before;
import org.junit.Test;
import players.Cleric;
import spells.HealingSpell;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    HealingSpell healingSpell;

    @Before
    public void before(){
        healingSpell = new HealingSpell("Healing Herbs", "Mends broken bones.", 7);
        cleric = new Cleric("Brother John", healingSpell);
    }
    
    @Test
    public void hasName(){
        assertEquals("Brother John", cleric.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(10, cleric.getHealth());
    }

    @Test
    public void canCastHealingSpell(){
        assertEquals("Healing Herbs spell cast. Mends broken bones. Receive 7 health.", cleric.castSpell());
    }
}
