import org.junit.Before;
import org.junit.Test;
import staff.DepartmentType;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Timmy", "JR456712", 100.00, DepartmentType.DATABASE);
    }

    @Test
    public void hasName(){
        assertEquals("Timmy", manager.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("JR456712", manager.getNINumber());

    }

    @Test
    public void hasSalary(){
        assertEquals(100.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(10.00);
        assertEquals(110.00, manager.getSalary(),0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1, manager.payBonus(), 0.01);
    }

    @Test
    public void hasDepartmentType(){
        assertEquals(DepartmentType.DATABASE, manager.getDepartmentType());
    }
}
