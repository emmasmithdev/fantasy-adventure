import Animals.Velociraptor;
import defence.Armour;
import defence.Shield;
import org.junit.Before;
import org.junit.Test;
import players.Knight;
import weapons.Axe;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Sword sword;
    Axe axe;
    Shield shield;
    Armour armour;
    Velociraptor raptor;

    @Before
    public void before(){
        armour = new Armour(3, "iron");
        shield = new Shield(2, "large");
        axe = new Axe(3, 5);
        sword = new Sword(5, "long");
        raptor = new Velociraptor("Chris", 30);
        knight = new Knight("Derek", sword, shield);
    }

    @Test
    public void hasName(){
        assertEquals("Derek", knight.getName());
    }

    @Test
    public void healthStarts10(){
        assertEquals(10, knight.getHealth());
    }

    @Test
    public void hasWeapon(){
        assertEquals(sword, knight.getWeapon());
    }

    @Test
    public void hasDefence(){
        assertEquals(shield, knight.getDefence());
    }

    @Test
    public void canLoseHealth(){
        knight.loseHealth(5);
        assertEquals(5, knight.getHealth());
    }

    @Test
    public void canAddHealth(){
        knight.addHealth(5);
        assertEquals(15, knight.getHealth());
    }

    @Test
    public void canFightWithSword(){
        assertEquals("Slice with a longsword! Receive 5 damage.", knight.fight());
    }

    @Test
    public void canFightWithAxe(){
        knight.setWeapon(axe);
        assertEquals("Chop with a force 5 axe! Receive 3 damage.", knight.fight());
    }

    @Test
    public void canDefendWithShield(){
        assertEquals("Protect with a large shield! Reduce damage by 2.", knight.defend());
    }

    @Test
    public void canDefendWithArmour(){
        knight.setDefence(armour);
        assertEquals("Protect with iron armour! Reduce damage by 3.", knight.defend());
    }

    @Test
    public void canBeProtectedByVelociraptor(){
        knight.setDefence(raptor);
        assertEquals("Protected by Chris. Opponent runs away in fear.", knight.defend());
    }

}
