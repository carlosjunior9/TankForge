package game;
import java.awt.Color;
import javax.swing.*;

public class GamePanelP {
    
    public static void main(String[] args) {
        JFrame principal = new JFrame("Pantalla principal");
        principal.setSize(400, 300);
        principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        principal.setLayout(null);
        principal.getContentPane().setBackground(Color.BLUE);

        JButton boton = new JButton("Inicio");
        boton.setBounds(350,400,300,60);
        boton.setBackground(Color.yellow);

        boton.addActionListener(e -> {
            new OpcionesP();
            principal.dispose();
        });

        JButton boton2 = new JButton("Opciones");
        boton2.setBounds(350, 300, 300, 60 );

        principal.add(boton);
        principal.add(boton2);


        principal.setVisible(true);
    }
}
