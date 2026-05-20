package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class juego extends JPanel implements KeyListener {

    int x = 100;
    int y = 100;

    public juego() {

        JFrame ventana = new JFrame("TankForge");

        ventana.setSize(800, 600);
        ventana.add(this);
        ventana.addKeyListener(this);

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        g.fillRect(x, y, 50, 50);
    }

    @Override
    public void keyPressed(KeyEvent e) {

        int tecla = e.getKeyCode();

        if (tecla == KeyEvent.VK_W) {
            y -= 10;
        }

        if (tecla == KeyEvent.VK_S) {
            y += 10;
        }

        if (tecla == KeyEvent.VK_A) {
            x -= 10;
        }

        if (tecla == KeyEvent.VK_D) {
            x += 10;
        }

        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    public static void main(String[] args) {
        new juego();
    }
}