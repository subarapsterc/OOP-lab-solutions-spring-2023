package Lab08;

public abstract class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

     double calculateBonus(){
        return salary * 1.1;
     }
}
