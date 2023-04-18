package Lab10;

import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.MouseEvent;

public class Map extends JPanel implements MouseInputListener {

    private final int B_WIDTH = 800;
    private final int B_HEIGHT = 800;
    Font font = new Font("SansSerif", Font.PLAIN, 15);

    City city1;
    City city2;

    int xMouse;
    int yMouse;

    private City[] cities;

    public Map(City[] cities) {
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
        addMouseListener(this);

        initMap(cities);
    }

    private void initMap(City[] cities) {
        this.cities = cities;

        city1 = city2 = null;
//        int DELAY = 15;
//        Timer timer = new Timer(DELAY, this);
//        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("SansSerif", Font.PLAIN, 15));

        for (int i = 0; i < cities.length; i++) {
            cities[i].drawCity(g);
        }

        drawSelectedCityInfo(g);
        repaint();
    }

    private void drawSelectedCityInfo(Graphics g) {
        g.setColor(Color.black);

        if (city1 == null) {}
        else {
            Point p1 = new Point(city1.x, city1.y);
            Point p2;
            if (city2 == null) {
//                p2 = new Point(xMouse, yMouse);
            }
            else {
                p2 = new Point(city2.x, city2.y);
                //       code for drawing distance info goes here
                g.drawLine(p1.x, p1.y, p2.x, p2.y);
            }
        }
    }

    private double square(float n) { return n * n; }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (city1 == null || city2 != null) {
            city1 = findCityAt(xMouse, yMouse);
            city2 = null;
        }
        else {
            city2 = findCityAt(xMouse, yMouse);
        }
    }

    private City findCityAt(int x, int y) {
        for (int i = 0; i < cities.length; i++) {
            if (Math.abs(cities[i].x - x) < 5 && Math.abs(cities[i].y - y) < 5) {
                return cities[i];
            }
        }
        return null;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        xMouse = e.getX();
        yMouse = e.getY();
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        xMouse = e.getX();
        yMouse = e.getY();
    }
    @Override
    public void mouseEntered(MouseEvent e) {

    }
    @Override
    public void mouseExited(MouseEvent e) {

    }
    @Override
    public void mouseDragged(MouseEvent e) {
        xMouse = e.getX();
        yMouse = e.getY();
    }
    @Override
    public void mouseMoved(MouseEvent e) {
        xMouse = e.getX();
        yMouse = e.getY();
    }
}
