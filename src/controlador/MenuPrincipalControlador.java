package controlador;

import java.awt.event.ActionEvent;
import vista.PnlConciertos;

/**
 * @author Leonidas Garcia Lescano
 */
public class MenuPrincipalControlador {

    private PnlConciertos menuVista;

    private AppControlador appControlador;
    private InicioSesionControlador inicioControlador;

    public MenuPrincipalControlador(AppControlador appControlador) {
        menuVista = new PnlConciertos();

        this.appControlador = appControlador;
        this.inicioControlador = appControlador.getInicioControlador();

        setEvents();
    }

    public void mostrar() {
        appControlador.getVentanaMain().PnlContenido.removeAll();
        appControlador.getVentanaMain().PnlContenido.add(menuVista);
        appControlador.getVentanaMain().PnlContenido.revalidate();
        appControlador.getVentanaMain().PnlContenido.repaint();
    }

    public void setEvents() {
        menuVista.BtnCerrarSesion.addActionListener((ActionEvent e) -> {
            appControlador.getInicioControlador().mostrar();
        });

        menuVista.BtnComprarEntradas.addActionListener((ActionEvent e) -> {
            appControlador.getSeleccionConciertoControlador().mostrar();
        });

        menuVista.BtnVerEntradas.addActionListener((ActionEvent e) -> {
            appControlador.getMisEntradasControlador().mostrar();
        });

    }

    public PnlConciertos getMenuVista() {
        return menuVista;
    }

}
