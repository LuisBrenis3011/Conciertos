package controlador;

import java.awt.event.ActionEvent;
import vista.PnlSeleccionZona;

/**
 * @author Leonidas Garcia Lescano
 */

public class SeleccionZonaControlador {

    private PnlSeleccionZona zonaVista;
    
    private AppControlador appControlador;
    
    public SeleccionZonaControlador(AppControlador appControlador) {
        zonaVista = new PnlSeleccionZona();
        this.appControlador = appControlador;
        
        setEvents();
    }

    public void mostrar() {
        appControlador.getVentanaMain().PnlContenido.removeAll();
        appControlador.getVentanaMain().PnlContenido.add(zonaVista);
        appControlador.getVentanaMain().PnlContenido.revalidate();
        appControlador.getVentanaMain().PnlContenido.repaint();
    }
    
    public void setEvents() {
        zonaVista.BtnZonaGeneral.addActionListener((ActionEvent e) -> {
            appControlador.getCompraControlador().mostrar();
        });
        
        zonaVista.BtnZonaPreferencial.addActionListener((ActionEvent e) -> {
            appControlador.getCompraControlador().mostrar();
        });
        
        zonaVista.BtnZonaVip.addActionListener((ActionEvent e) -> {
            appControlador.getCompraControlador().mostrar();
        });
    }
    
}
