package controlador;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import vista.PnlRegistrar;

/**
 * @author Leonidas Garcia Lescano
 */
public class RegistroControlador {

    private PnlRegistrar registroVista;

    private AppControlador appControlador;
    private InicioSesionControlador inicioControlador;

    public RegistroControlador(AppControlador appControlador) {

        registroVista = new PnlRegistrar();
        
        this.appControlador = appControlador;
        this.inicioControlador = appControlador.getInicioControlador();

        setEvents();
    }

    public void mostrar() {
        appControlador.getVentanaMain().PnlContenido.removeAll();
        appControlador.getVentanaMain().PnlContenido.add(registroVista);
        appControlador.getVentanaMain().PnlContenido.revalidate();
        appControlador.getVentanaMain().PnlContenido.repaint();
    }

    public void setEvents() {
        registroVista.BtnCrearCuenta.addActionListener((ActionEvent e) -> {
            appControlador.getInicioControlador().mostrar();
        });
        
        registroVista.LblRegresar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                appControlador.getInicioControlador().mostrar();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        });
    }

    public PnlRegistrar getRegistroVista() {
        return registroVista;
    }

}
