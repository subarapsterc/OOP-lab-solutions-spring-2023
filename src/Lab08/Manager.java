package Lab08;

public class Manager extends Employee implements Promotable{

    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        return salary * 1.2;
    }

    @Override
    public void promote(double newSalary) {
        salary = newSalary;
    }
}
