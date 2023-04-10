package Lab09Subata.components;

public class WavyAnt extends Ant{
    int amplitude;
    int wavelength;
    int initX;

    public WavyAnt(int x, int y, int width, int height) {
        super(x, y, width, height);
        this.wavelength = (int) (Math.random() * 20 + 10);
        this.amplitude = (int) (Math.random() * 30 + 20);
        initX = x;
    }

    @Override
    public void updateLocation() {
        super.updateLocation();
        x = (int) (initX + amplitude * Math.sin((double) y/wavelength));
    }

}
