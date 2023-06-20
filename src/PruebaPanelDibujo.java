import javax.swing.*;

public class PruebaPanelDibujo{
    public static void main(String[] args) {
        //crea una instancia de la clase PanelDibujo
        PanelDibujo panel = new PanelDibujo();
        //crea un marco en la ventana
        JFrame aplicacion = new JFrame();
        //pongo un boto para cerrar la ventana
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        aplicacion.add(panel); //agrega un panel a la ventana
        aplicacion.setSize(250, 250); //setteo el tamaño de la ventana
        aplicacion.setVisible(true); //permito que se vea la ventana
    }
}
