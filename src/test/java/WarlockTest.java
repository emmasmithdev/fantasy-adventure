import mythicalCreatures.MythicalCreature;
import mythicalCreatures.Ogre;
import mythicalCreatures.Unicorn;
import org.junit.Before;
import org.junit.Test;
import players.Warlock;
import spells.AttackSpell;
import spells.InformationSpell;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;
    AttackSpell spell;
    InformationSpell infoSpell;
    Ogre ogre;
    Unicorn unicorn;

    @Before
    public void before(){
        ogre = new Ogre("Shrek", 7, 3);
        unicorn = new Unicorn("Beauty", 10, 7);
        infoSpell = new InformationSpell("Tell All", "Your opponent tells you vital information.");
        spell = new AttackSpell("Fireball", "Opponent takes a flaming ball to the stomach.", 6);
        warlock = new Warlock("Willy", spell, ogre);
    }

    @Test
    public void hasName(){
        assertEquals("Willy", warlock.getName());
    }

    @Test
    public void hasSpell(){
        assertEquals(spell, warlock.getSpell());
    }

    @Test
    public void hasProtector(){
        assertEquals(ogre, warlock.getProtector());
    }

    @Test
    public void healthStartsAt10(){
        assertEquals(10, warlock.getHealth());
    }

    @Test
    public void canLoseHealth(){
        warlock.loseHealth(5);
        assertEquals(5, warlock.getHealth());
    }

    @Test
    public void canAddHealth(){
        warlock.addHealth(5);
        assertEquals(15, warlock.getHealth());
    }

    @Test
    public void canCastAttackSpell(){
        assertEquals("Fireball spell cast. Opponent takes a flaming ball to the stomach. You receive 6 damage.", warlock.castSpell());
    }

    @Test
    public void canCastInformationSpell(){
        warlock.setSpell(infoSpell);
        assertEquals("Tell All spell cast. Your opponent tells you vital information.", warlock.castSpell());
    }

    @Test
    public void canUseProtectorOgre(){
        assertEquals("Protected by Shrek. Remove 3 from damage.", warlock.protection());
    }

    @Test
    public void canUseProtectorUnicorn(){
        warlock.setProtector(unicorn);
        assertEquals("Protected by Beauty. Remove 7 from damage.", warlock.protection());
    }

}
