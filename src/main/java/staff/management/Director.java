package staff.management;

import staff.DepartmentType;

public class Director extends Manager{

    private double budget;

    public Director(String name, String nINumber, double salary, DepartmentType departmentType, double budget){
        super(name, nINumber, salary, departmentType);
        this.budget = budget;
    }

    public double getBudget(){
        return this.budget;
    }
}
