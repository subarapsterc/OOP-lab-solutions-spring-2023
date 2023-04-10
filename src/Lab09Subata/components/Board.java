package Lab09Subata.components;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.event.MouseInputListener;

public class Board extends JPanel
        implements ActionListener, MouseInputListener {

    private final int B_WIDTH = 800;
    private final int B_HEIGHT = 600;

    private boolean gameStarted = false;
    private boolean gameFinished = false;

    final int ANT_WIDTH = 48;
    final int ANT_HEIGHT = 64;

    private final ArrayList<Ant> ants = new ArrayList<>();
    final int MAX_ANTS = 8;
    int deadAnts = 0;

    private class TAdapter extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {
            int key = e.getKeyCode();

            if (key == KeyEvent.VK_SPACE) {
                if (!gameStarted) {
                    gameStarted = true;
                }
            }
        }
    }

    public Board() {
        initBoard();
    }

    private void initBoard() {
        addMouseListener(this);
        addMouseMotionListener(this);
        addKeyListener(new TAdapter());
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
        setFocusable(true);

        InitializeAssets();
        gameStarted = false;

        int DELAY = 15;
        Timer timer = new Timer(DELAY, this);
        timer.start();
    }

    private void InitializeAssets() {
        for (int i = 0; i < MAX_ANTS; i++) {
            if (Math.random() < 0.4)
                ants.add(new WavyAnt((int) (Math.random() * 700 + 50), 600 + ANT_HEIGHT / 2, ANT_WIDTH, ANT_HEIGHT));
            else
                ants.add(new Ant((int) (Math.random() * 700 + 50), 600 + ANT_HEIGHT / 2, ANT_WIDTH, ANT_HEIGHT));

        }

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (gameStarted) try {
            for (int i = 0; i < ants.size(); i++) {
                drawAnt(g, ants.get(i));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        else {
            g.setColor(Color.RED);
            g.setFont(new Font("SansSerif", Font.BOLD, 40));
            String text = "Press SPACE to start";
            int wString = g.getFontMetrics().stringWidth(text);
            g.drawString(text, (B_WIDTH - wString) / 2, B_HEIGHT / 2);
        }

        drawScore(g);
    }

    private void drawScore(Graphics g) {
        String text = "Score: " + deadAnts;

        if (gameFinished) {
            g.setFont(new Font("SansSerif", Font.BOLD, 40));
            int wString = g.getFontMetrics().stringWidth(text);
            g.drawString(text, (B_WIDTH - wString) / 2, B_HEIGHT / 2);
        }
        else if (gameStarted) {
            g.setFont(new Font("SansSerif", Font.BOLD, 25));
            int wString = g.getFontMetrics().stringWidth(text);
            g.drawString(text, B_WIDTH - wString - 10, 30);
        }
    }

    private void drawAnt(Graphics g, Ant inputAnt) throws IOException {
        g.drawImage(inputAnt.getImage(), inputAnt.x - ANT_WIDTH / 2, inputAnt.y - ANT_HEIGHT / 2, this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Toolkit.getDefaultToolkit().sync();
        repaint();

        for (int i = 0; i < ants.size(); i++) {
            if (ants.get(i).y < -1 * (ANT_HEIGHT / 2)) {
                ants.remove(i);
                i--;
            }
        }

        if (ants.size() == deadAnts) {
            gameFinished = true;
        }
    }

    public void IsClicked(int x, int y) {
        for (int i = 0; i < ants.size(); i++) {
            Ant current = ants.get(i);
            if (current.alive && current.isClicked(x, y)) {
                deadAnts++;
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        IsClicked(e.getX(), e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        IsClicked(e.getX(), e.getY());
        //start_drawing = false;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
        if (gameStarted) {
            for (int i = 0; i < ants.size(); i++) {
                ants.get(i).avoid(e.getX(), e.getY());
            }
        }
    }
}