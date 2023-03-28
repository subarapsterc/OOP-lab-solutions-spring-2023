package Lab08;

public abstract class Bird implements EggLayer, Flier{
    String name;

    @Override
    public void layEggs() {
        System.out.printf("%s lays eggs\n", name);
    }

    @Override
    public void fly() {
        System.out.printf("%s flies\n", name);
    }
}
