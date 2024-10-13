package controlador;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.PnlInicioSesion;

/**
 * @author Leonidas Garcia Lescano
 */
public class InicioSesionControlador {

    private PnlInicioSesion inicioVista;

    private AppControlador appControlador;
    private RegistroControlador registroControlador;
    private MenuPrincipalControlador menuControlador;

    public InicioSesionControlador(AppControlador appControlador) {

        inicioVista = new PnlInicioSesion();

        this.appControlador = appControlador;

        setEvents();

    }

    public void mostrar() {
        appControlador.getVentanaMain().PnlContenido.removeAll();
        appControlador.getVentanaMain().PnlContenido.add(inicioVista);
        appControlador.getVentanaMain().PnlContenido.revalidate();
        appControlador.getVentanaMain().PnlContenido.repaint();
    }

    //LINKS
    public void setEvents() {
        inicioVista.BtnIngresar.addActionListener((ActionEvent e) -> {
            appControlador.getMenuControlador().mostrar();
        });

        inicioVista.BtnRegistrar.addActionListener((ActionEvent e) -> {
            appControlador.getRegistroControlador().mostrar();
        });
    }

    public PnlInicioSesion getInicioVista() {
        return inicioVista;
    }

}
