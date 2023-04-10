package Lab09Subata.components;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Ant {
    int x;
    int y;
    int width;
    int height;
    Image[] images = new Image[24];
    Image currentImage;
    private int imgNo;
    private boolean numUp;
    public boolean alive;
    protected int speed;

    public Ant(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        initImages();
        imgNo = 0;
        numUp = true;
        alive = true;
        speed = (int) (Math.random() * 2 + 2);
        imgNo = (int) (Math.random() * 15);
    }

    private void initImages() {
        for (int i = 0; i <= 23; i++) {
            try {
                if (i < 10) {
                    images[i] = ImageIO.read(new File("src/Lab09Subata/images/tile00" + i + ".png")).getScaledInstance(width, height, Image.SCALE_FAST);
                } else {
                    images[i] = ImageIO.read(new File("src/Lab09Subata/images/tile0" + i + ".png")).getScaledInstance(width, height, Image.SCALE_FAST);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        currentImage = images[imgNo];
    }

    public Image getImage() {
        if (alive) {
            updateLocation();
            if (numUp)
                imgNo++;
            else
                imgNo--;

            if (imgNo == 0 || imgNo == 16) {
                numUp = !numUp;
            }
            currentImage = images[imgNo];
        }
        return currentImage;
    }

    public void updateLocation() {
        y = y - speed;      // updates location
    }

    public void avoid(int xMouse, int yMouse) {
        float rad = (float) 0.5;
        if (alive) {
            if (xMouse <= x && xMouse > x - rad * width && Math.abs(yMouse - y) < height)
                x++;
            else if (xMouse > x && xMouse < x + rad * width && Math.abs(yMouse - y) < height)
                x--;

            if (yMouse <= y && yMouse > y - rad * height && Math.abs(xMouse - x) < width)
                y++;
            else if (yMouse > y && yMouse < y + rad * height && Math.abs(xMouse - x) < width)
                y--;
        }
    }

    public boolean isClicked(int xMouse, int yMouse) {
        if (xMouse > x - width / 2 && xMouse < x + width / 2 && yMouse > y - height / 2 && yMouse < y + height / 2) {
            alive = false;
            currentImage = images[23];
            return true;
        }
        return false;
    }
}
