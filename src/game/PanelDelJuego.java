package game;
import javax.swing.*;
import java.awt.*;

public class PanelDelJuego extends JPanel {
    
    Image fondo;
    Image Boton;

    public PanelDelJuego(){
        fondo = new ImageIcon("TankForge/assets/fondos/fondo.png").getImage();

        setLayout(null);

        ImageIcon iniciar = new ImageIcon("TankForge/assets/fondos/Inicio.png");
        
        Image iniciarEscalada = iniciar.getImage().getScaledInstance(200, 50, Image.SCALE_SMOOTH);

        ImageIcon iniciarImg = new ImageIcon(iniciarEscalada);



        ImageIcon opciones = new ImageIcon("TankForge/assets/fondos/Opciones.png");

        Image opcionesEscalada = opciones.getImage().getScaledInstance(200, 50, Image.SCALE_SMOOTH);
        
        ImageIcon opcionesImg = new ImageIcon(opcionesEscalada);



    ImageIcon salirOriginal =
                new ImageIcon("TankForge/assets/fondos/Salir.png");

        Image salirEscalada =
                salirOriginal.getImage().getScaledInstance(
                        250,
                        70,
                        Image.SCALE_SMOOTH
                );

        ImageIcon salirImg =
                new ImageIcon(salirEscalada);
        


        JButton Iniciar = new JButton(iniciarImg);
        Iniciar.setBounds(510, 350, 200, 50);
        Iniciar.setBorderPainted(false);
        Iniciar.setContentAreaFilled(false);
        Iniciar.setFocusPainted(false);
        Iniciar.addActionListener(e -> {
            JFrame Juego = (JFrame) SwingUtilities.getWindowAncestor(this);
            Juego.setContentPane(new PantallaJuego());
            Juego.repaint();
        });

        add(Iniciar);

        JButton Opciones = new JButton(opcionesImg);
        Opciones.setBounds(510, 450, 200, 50);
        Iniciar.setBorderPainted(false);
        Iniciar.setContentAreaFilled(false);
        Iniciar.setFocusPainted(false);
        add(Opciones);

        JButton Salir = new JButton(salirImg);
        Salir.setBounds(510, 550, 200, 50);
        Iniciar.setBorderPainted(false);
        Iniciar.setContentAreaFilled(false);
        Iniciar.setFocusPainted(false);

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
