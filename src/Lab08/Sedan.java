package Lab08;

public class Sedan extends Car implements Convertible{
    boolean roofOpen = false;

    @Override
    public void accelerate(int speed) {
        if (speed > this.speed) {
            this.speed = speed;
        }
    }

    @Override
    public void decelerate(int speed) {
        if (speed < this.speed) {
            this.speed = speed;
        }
    }

    @Override
    public void openRoof() {
        roofOpen = true;
    }
}
