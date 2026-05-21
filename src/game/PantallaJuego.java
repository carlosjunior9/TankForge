package game;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

public class PantallaJuego extends JPanel {

    public PantallaJuego(){

        setBackground(Color.black);

    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.white);
        g.drawString("Juego", 100, 100);
    }
}
