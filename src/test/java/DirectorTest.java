import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before(){
        director = new Director("Kirsty", "JP126856C", 200000.00, "Board", 1000000.00);
    }

    @Test
    public void directorHasName(){
        assertEquals("Kirsty", director.getName());
    }

    @Test
    public void directorHasNiNumber(){
        assertEquals("JP126856C", director.getNiNumber());
    }

    @Test
    public void directorHasSalary(){
        assertEquals(200000.00, director.getSalary(), 0.01);
    }

    @Test
    public void directorHasDeptName(){
        assertEquals("Board", director.getDeptName());
    }

    @Test
    public void directorHasBudget(){
        assertEquals(1000000.00, director.getBudget(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(50000.00);
        assertEquals(250000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        director.raiseSalary(50000.00);
        assertEquals(5000.00, director.payBonus(), 0.01);
    }
}
