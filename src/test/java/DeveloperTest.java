import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void before() {
        developer = new Developer("Markus", "QQ123427D", 40000.00);
    }

    @Test
    public void developerHasName(){
        assertEquals("Markus", developer.getName());
    }

    @Test
    public void developerHasNiNumber(){
        assertEquals("QQ123427D", developer.getNiNumber());
    }

    @Test
    public void developerHasSalary(){
        assertEquals(40000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(10000.00);
        assertEquals(50000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        developer.raiseSalary(10000.00);
        assertEquals(500.00, developer.payBonus(), 0.01);
    }
}
