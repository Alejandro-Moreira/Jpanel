import javax.swing.*;//Clases padre ya implemantadas, permite crear graficos
import java.awt.*;

public class PanelDibujo extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int anchura = getWidth();
        int altura = getHeight();
        g.drawLine(50,10,25,50); //define las lineas del panel que se creara posteriormente
        g.drawLine(50,50,50,10); //define las lineas del panel que se creara posteriormente
        g.drawLine(35, 30, 50, 30); //define las lineas del panel que se creara posteriormente

    }
}
