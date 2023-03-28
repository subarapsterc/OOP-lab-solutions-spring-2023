package Lab08;

public abstract class Amphibian implements WaterBreather, EggLayer{
    String name;

    @Override
    public void breatheWater() {
        System.out.printf("%s breathes water\n", name);
    }

    @Override
    public void layEggs() {
        System.out.printf("%s lays eggs\n", name);
    }
}
