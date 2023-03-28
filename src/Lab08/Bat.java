package Lab08;

public class Bat extends Mammal implements Flier {
    String name = "bat";

    @Override
    public void giveMilk() {
        System.out.printf("%s gives milk\n", name);
    }

    @Override
    public void fly() {
        System.out.printf("%s flies\n", name);
    }
}
