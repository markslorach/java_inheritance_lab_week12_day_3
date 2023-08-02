import org.junit.Before;
import org.junit.Test;
import management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("Mark", "QQ123456C", 80000.00, "Software");
    }

    @Test
    public void managerHasName(){
        assertEquals("Mark", manager.getName());
    }

    @Test
    public void managerHasNiNumber(){
        assertEquals("QQ123456C", manager.getNiNumber());
    }

    @Test
    public void managerHasSalary(){
        assertEquals(80000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void managerHasDeptName(){
        assertEquals("Software", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(20000.00);
        assertEquals(100000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        manager.raiseSalary(20000.00);
        assertEquals(1000.00, manager.payBonus(), 0.01);
    }





}
