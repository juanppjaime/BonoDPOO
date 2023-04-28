import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class InterfazPrincipal extends JFrame {

    private PanelLienzo lienzo = new PanelLienzo();

    public InterfazPrincipal() {
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(lienzo);
        setVisible(true);
    }

    public static void main(String[] args) {
        InterfazPrincipal interfaz = new InterfazPrincipal();
    }
}