package controlador;

import java.awt.event.ActionEvent;
import vista.PnlCompraEntradas;

/**
 * @author Leonidas Garcia Lescano
 */
public class CompraControlador {

    private PnlCompraEntradas compraEntradasVista;

    private AppControlador appControlador;

    public CompraControlador(AppControlador appControlador) {
        this.compraEntradasVista = new PnlCompraEntradas();
        this.appControlador = appControlador;
        
        setEvents();
    }

    public void mostrar() {
        appControlador.getVentanaMain().PnlContenido.removeAll();
        appControlador.getVentanaMain().PnlContenido.add(compraEntradasVista);
        appControlador.getVentanaMain().PnlContenido.revalidate();
        appControlador.getVentanaMain().PnlContenido.repaint();
    }

    public void setEvents() {
        compraEntradasVista.BtnPagar.addActionListener((ActionEvent e) -> {
            appControlador.getEntradasControlador().mostrar();
        });
    }

}
