import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DataBaseAdmin;

import static org.junit.Assert.assertEquals;

public class DataBaseAdminTest {

    DataBaseAdmin dataBaseAdmin;

    @Before
    public void before(){
        dataBaseAdmin = new DataBaseAdmin("Timmy", "JR456712", 100.00);
    }

    @Test
    public void hasName(){
        assertEquals("Timmy", dataBaseAdmin.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("JR456712", dataBaseAdmin.getNINumber());

    }

    @Test
    public void hasSalary(){
        assertEquals(100.00, dataBaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        dataBaseAdmin.raiseSalary(10.00);
        assertEquals(110.00, dataBaseAdmin.getSalary(),0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1, dataBaseAdmin.payBonus(), 0.01);
    }

}
