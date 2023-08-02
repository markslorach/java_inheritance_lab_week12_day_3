import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Zuhayr", "QP136423D", 24000.00);
    }

    @Test
    public void databaseAdminHasName(){
        assertEquals("Zuhayr", databaseAdmin.getName());
    }

    @Test
    public void databaseAdminHasNiNumber(){
        assertEquals("QP136423D", databaseAdmin.getNiNumber());
    }

    @Test
    public void databaseAdminHasSalary(){
        assertEquals(24000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(10000.00);
        assertEquals(34000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        databaseAdmin.raiseSalary(10000.00);
        assertEquals(340.00, databaseAdmin.payBonus(), 0.01);
    }
}
