package Lab08;

public class Platypus extends Mammal implements EggLayer{
    String name = "platypus";

    @Override
    public void giveMilk() {
        System.out.printf("%s gives milk\n", name);
    }

    @Override
    public void layEggs() {
        System.out.printf("%s lays eggs\n", name);
    }
}
