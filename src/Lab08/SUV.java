package Lab08;

public class SUV extends Car{

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
}
