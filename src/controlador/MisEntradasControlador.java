package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import vista.PnlMisEntradas;

/**
 * @author Leonidas Garcia Lescano
 */
public class MisEntradasControlador {

    private PnlMisEntradas entradasVista;

    private AppControlador appControlador;

    public MisEntradasControlador(AppControlador appControlador) {

        entradasVista = new PnlMisEntradas();
        this.appControlador = appControlador;

        setEvents();

    }

    public void mostrar() {
        appControlador.getVentanaMain().PnlContenido.removeAll();
        appControlador.getVentanaMain().PnlContenido.add(entradasVista);
        appControlador.getVentanaMain().PnlContenido.revalidate();
        appControlador.getVentanaMain().PnlContenido.repaint();
    }

    public void setEvents() {
        entradasVista.LblRegresar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                appControlador.getMenuControlador().mostrar();
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

    }

}
