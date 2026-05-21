package game;
import javax.swing.*;
import java.awt.*;

public class PanelDelJuego extends JPanel {
    
    Image fondo;
    Image Boton;

    public PanelDelJuego(){
        fondo = new ImageIcon("TankForge/assets/fondos/fondo.png").getImage();

        setLayout(null);

        JButton Iniciar = new JButton("INICIAR");
        Iniciar.setBounds(510, 350, 200, 50);
        Iniciar.setForeground(Color.white);
        Iniciar.setBackground(new Color(90, 100, 110));
        Iniciar.addActionListener(e -> {
            JFrame Juego = (JFrame) SwingUtilities.getWindowAncestor(this);
            Juego.setContentPane(new PantallaJuego());
            Juego.repaint();
        });

        add(Iniciar);

        JButton Opciones = new JButton("OPCIONES");
        Opciones.setBounds(510, 450, 200, 50);
        Opciones.setForeground(Color.white);
        Opciones.setBackground(new Color(90, 100, 110));
        add(Opciones);

        JButton Salir = new JButton("SALIR");
        Salir.setBounds(510, 550, 200, 50);
        Salir.setForeground(Color.white);
        Salir.setBackground(new Color(90, 100, 110));

        Salir.addActionListener(e -> {
            System.exit(0);
        });
        add(Salir);
    }

    @Override
    protected void paintComponent(Graphics g){

        super.paintComponent(g);
        g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
    }
}
