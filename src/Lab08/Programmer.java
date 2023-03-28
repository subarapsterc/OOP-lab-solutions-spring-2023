package Lab08;

public class Programmer extends Employee implements Promotable{

    public Programmer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void promote(double newSalary) {
        salary = newSalary;
    }
}
