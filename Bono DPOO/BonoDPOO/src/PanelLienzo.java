import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class PanelLienzo extends JPanel {


	public void paint(Graphics g) 
	{
	    super.paint(g);
	    Graphics2D g2d = (Graphics2D) g;
	    
	    // Rectángulo
	    Rectangle2D.Double rectangulo = new Rectangle2D.Double(0,0,400,400);
	    g2d.setColor(Color.GRAY);
	    g2d.fill(rectangulo);
	    
	    // Figura nueva 
	    
	    Rectangle2D.Double telon = new Rectangle2D.Double(0,0,75,400);
	    g2d.setColor(Color.RED);
	    g2d.fill(telon);
	    Rectangle2D.Double telon2 = new Rectangle2D.Double(400,0,75,400);
	    g2d.setColor(Color.RED);
	    g2d.fill(telon2);
	    Arc2D.Double semiCiruclo1 = new Arc2D.Double(-90, -125, 330, 250, 270, 90, Arc2D.PIE);
        g2d.fill(semiCiruclo1);
        Arc2D.Double semiCirculo2 = new Arc2D.Double(240, -125, 330, 250, 180, 90, Arc2D.PIE);
        g2d.fill(semiCirculo2);
        
        // Figura rellena sin usar las clases tradicionales
        int[] xPoints = { 0, 150, 300 };
        int[] yPoints = { 600, 450, 600 };

        g2d.drawLine(xPoints[0], yPoints[0], xPoints[1], yPoints[1]);
        g2d.drawLine(xPoints[1], yPoints[1], xPoints[2], yPoints[2]);
        g2d.drawLine(xPoints[2], yPoints[2], xPoints[0], yPoints[0]);

        g2d.fillPolygon(xPoints, yPoints, 3);
	    
	    // Elipse
	    Ellipse2D.Double elipse = new Ellipse2D.Double(350,30,100,100);
	    g2d.setColor(Color.BLACK);
	    g2d.fill(elipse);
	    
	    // Rectángulo 2
	    Rectangle2D.Double rectangulo2 = new Rectangle2D.Double(390,130,20,40);
	    g2d.setColor(Color.BLACK);
	    g2d.fill(rectangulo2);
	    
	    // Rectángulo redondeado 1
	    Rectangle2D.Double rectanguloRedondeado1 = new Rectangle2D.Double(320,170,25,180);
	    g2d.setColor(Color.BLACK);
	    g2d.fillRoundRect(320, 170, 25, 180, 20, 20);
	    
	    // Rectángulo redondeado 2
	    Rectangle2D.Double rectanguloRedondeado2 = new Rectangle2D.Double(455,170,25,180);
	    g2d.setColor(Color.BLACK);
	    g2d.fillRoundRect(455, 170, 25, 180, 20, 20);
	    
	    // Rectángulo 3
	    Rectangle2D.Double rectangulo3 = new Rectangle2D.Double(335,170,130,40);
	    g2d.setColor(Color.BLACK);
	    g2d.fill(rectangulo3);
	    
	    // Rectángulo redondeado 3
	    Rectangle2D.Double rectanguloRedondeado3 = new Rectangle2D.Double(345,200,15,40);
	    g2d.setColor(Color.GRAY);
	    g2d.fillRoundRect(345, 200, 15, 40, 20, 20);
	    
	    // Rectángulo redondeado 4
	    Rectangle2D.Double rectanguloRedondeado4 = new Rectangle2D.Double(440,200,15,40);
	    g2d.setColor(Color.GRAY);
	    g2d.fillRoundRect(440, 200, 15, 40, 20, 20);
	    
	    // Rectángulo 4
	    Rectangle2D.Double rectangulo4 = new Rectangle2D.Double(360,170,80,180);
	    g2d.setColor(Color.BLACK);
	    g2d.fill(rectangulo4);
	    
	    // Rectángulo redondeado 5
	    Rectangle2D.Double rectanguloRedondeado5 = new Rectangle2D.Double(360,330,35,180);
	    g2d.setColor(Color.BLACK);
	    g2d.fillRoundRect(360, 330, 35, 180, 20, 20);
	    
	    // Rectángulo 6
	    Rectangle2D.Double rectanguloRedondeado6 = new Rectangle2D.Double(405,330,35,180);
	    g2d.setColor(Color.BLACK);
	    g2d.fillRoundRect(405,330,35,180,20,20);
	    
	    // Polígono
	    int[] xs = {230, 250, 550, 570};
	    int[] ys = {550, 500, 500, 550};
	    Polygon poligono = new Polygon(xs, ys, 4);
	    g2d.setColor(Color.YELLOW);
	    g2d.fill(poligono);
	
}
}