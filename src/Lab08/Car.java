package Lab08;

public abstract class Car implements Vehicle{
    boolean engineOn;
    int speed;

    public Car(){
        engineOn = false;
        speed = 0;
    }

    protected void startEngine() {
        engineOn = true;
    }

}
