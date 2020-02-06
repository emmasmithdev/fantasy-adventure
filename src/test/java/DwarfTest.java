import org.junit.Before;
import org.junit.Test;
import players.Dwarf;
import weapons.Axe;
import weapons.Club;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    Club club;
    Axe axe;

    @Before
    public void before(){
        club = new Club(3, 10);
        axe = new Axe(3, 5);
        dwarf = new Dwarf("Lisa", club);
    }

    @Test
    public void hasName(){
        assertEquals("Lisa", dwarf.getName());
    }

    @Test
    public void healthStarts10(){
        assertEquals(10, dwarf.getHealth());
    }

    @Test
    public void hasWeapon(){
        assertEquals(club, dwarf.getWeapon());
    }

    @Test
    public void canFightWithClub(){
        assertEquals("Smash with a 10 pound club!", dwarf.fight());
    }

    @Test
    public void canFightWithAxe(){
        dwarf.setWeapon(axe);
        assertEquals("Chop with a force 5 axe!", dwarf.fight());
    }

    @Test
    public void canLoseHealth(){
        dwarf.loseHealth(5);
        assertEquals(5, dwarf.getHealth());
    }

    @Test
    public void canAddHealth(){
        dwarf.addHealth(5);
        assertEquals(15, dwarf.getHealth());
    }
}
