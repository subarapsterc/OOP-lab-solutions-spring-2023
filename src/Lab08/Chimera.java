package Lab08;

public class Chimera implements WaterBreather, EggLayer, MilkProvider, Flier{
    String name = "chimera";

    @Override
    public void breatheWater() {
        System.out.printf("%s breathes water\n", name);
    }

    @Override
    public void layEggs() {
        System.out.printf("%s lays eggs\n", name);
    }

    @Override
    public void giveMilk() {
        System.out.printf("%s gives milk\n", name);
    }

    @Override
    public void fly() {
        System.out.printf("%s flies\n", name);
    }
}
