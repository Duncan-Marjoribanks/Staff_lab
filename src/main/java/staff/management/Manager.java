package staff.management;

import staff.DepartmentType;
import staff.Employee;

public class Manager extends Employee {
    private DepartmentType departmentType;

    public Manager(String name, String nINumber, double salary, DepartmentType departmentType){
        super(name, nINumber, salary);
        this.departmentType = departmentType;
    }

    public Enum getDepartmentType(){
        return this.departmentType;
    }
}
