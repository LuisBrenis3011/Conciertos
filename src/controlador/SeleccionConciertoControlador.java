package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import vista.PnlVerConciertos;

/**
 * @author Leonidas Garcia Lescano
 */

public class SeleccionConciertoControlador {

    private PnlVerConciertos conciertosVista;
    
    private AppControlador appControlador;
    
    public SeleccionConciertoControlador(AppControlador appControlador) {
        
        conciertosVista = new PnlVerConciertos();
        
        this.appControlador = appControlador;
        
        setEvents();
        
    }

    public void setEvents() {
        conciertosVista.BtnConcierto1.addActionListener((ActionEvent e) -> {
            appControlador.getSeleccionZonaControlador().mostrar();
        });
        
        conciertosVista.BtnConcierto2.addActionListener((ActionEvent e) -> {
            appControlador.getSeleccionZonaControlador().mostrar();
        });
        
        conciertosVista.BtnConcierto3.addActionListener((ActionEvent e) -> {
            appControlador.getSeleccionZonaControlador().mostrar();
        });
    }
    
    public void mostrar() {
        appControlador.getVentanaMain().PnlContenido.removeAll();
        appControlador.getVentanaMain().PnlContenido.add(conciertosVista);
        appControlador.getVentanaMain().PnlContenido.revalidate();
        appControlador.getVentanaMain().PnlContenido.repaint();
    }
    
}
