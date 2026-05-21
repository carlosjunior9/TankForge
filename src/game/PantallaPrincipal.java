package game;
import javax.swing.*;

public class PantallaPrincipal {

    public PantallaPrincipal(){

        JFrame pantalla = new JFrame("TankForge");
        pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pantalla.setExtendedState(JFrame.MAXIMIZED_BOTH);

        PanelDelJuego panel = new PanelDelJuego();
        pantalla.add(panel);

        //BotonesInicio botones = new BotonesInicio();
        //pantalla.add(botones);

        pantalla.setVisible(true);
 }
}
