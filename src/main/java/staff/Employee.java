package staff;

public abstract class Employee {
    private String name, nINumber;
    private double salary;

    public Employee(String name, String nINumber, double salary){
        this.name = name;
        this.nINumber = nINumber;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }
    public String getNINumber(){
        return this.nINumber;
    }
    public double getSalary(){
        return this.salary;
    }
    public void raiseSalary(double raise){
        this.salary += raise;
    }
    public double payBonus(){
        return this.salary / 100;
    }

}
