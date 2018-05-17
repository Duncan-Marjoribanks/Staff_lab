import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Timmy", "JR456712", 100.00);
    }

    @Test
    public void hasName(){
        assertEquals("Timmy", developer.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("JR456712", developer.getNINumber());

    }

    @Test
    public void hasSalary(){
        assertEquals(100.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(10.00);
        assertEquals(110.00, developer.getSalary(),0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1, developer.payBonus(), 0.01);
    }

}


