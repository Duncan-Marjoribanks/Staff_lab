import org.junit.Before;
import org.junit.Test;
import staff.DepartmentType;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest{

    Director director;

    @Before
    public void before(){
        director = new Director("Timmy", "JR456712", 100.00, DepartmentType.DATABASE, 100000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Timmy", director.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("JR456712", director.getNINumber());

    }

    @Test
    public void hasSalary(){
        assertEquals(100.00, director.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(10.00);
        assertEquals(110.00, director.getSalary(),0.01);
    }



    @Test
    public void hasDepartmentType(){
        assertEquals(DepartmentType.DATABASE, director.getDepartmentType());
    }

    @Test
    public void hasBudget(){
        assertEquals(100000.00, director.getBudget(), 0.01);
    }

    @Test
    public void receivesCorrectBonus(){
        assertEquals(2.00, director.payBonus(), 0.01);
    }
}
