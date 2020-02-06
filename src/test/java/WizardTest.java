import cleaningImplements.Broomstick;
import mythicalCreatures.Dragon;
import mythicalCreatures.Unicorn;
import org.junit.Before;
import org.junit.Test;
import players.Wizard;
import spells.HealingSpell;
import spells.InformationSpell;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    HealingSpell healingSpell;
    InformationSpell infoSpell;
    Dragon dragon;
    Unicorn unicorn;
    Broomstick broomstick;

    @Before
    public void before() {
        broomstick = new Broomstick("Nimbus 3000", 20);
        unicorn = new Unicorn("Beauty", 10, 10);
        dragon = new Dragon("Fiery", 9, 9);
        infoSpell = new InformationSpell("Tell All", "Get vital information from your opponent.");
        healingSpell = new HealingSpell("Rosewood Potion", "Heals the skin when applied to burns.", 4);
        wizard = new Wizard("Matt", healingSpell, dragon, broomstick);
    }

    @Test
    public void hasName(){
        assertEquals("Matt", wizard.getName());
    }

    @Test
    public void healthStartsAt10(){
        assertEquals(10, wizard.getHealth());
    }

    @Test
    public void canCastHealingSpell(){
        assertEquals("Rosewood Potion spell cast. Heals the skin when applied to burns. Receive 4 health.", wizard.castSpell());
    }

    @Test
    public void canCastInformationSpell(){
        wizard.setSpell(infoSpell);
        assertEquals("Tell All spell cast. Get vital information from your opponent.", wizard.castSpell());
    }

    @Test
    public void canBeProtectedByDragon(){
        assertEquals("Protected by Fiery. Remove 9 from damage.", wizard.protection());
    }

    @Test
    public void canBeProtectedByUnicorn(){
        wizard.setProtector(unicorn);
        assertEquals("Protected by Beauty. Remove 10 from damage.", wizard.protection());
    }

    @Test
    public void canFlyBroomstick(){
        assertEquals("Hovering...lifting up...flying!", wizard.fly());
    }

    @Test
    public void canFlyDragon(){
        wizard.setFlyable(dragon);
        assertEquals("Running...flapping wings...flying!", wizard.fly());
    }
}
