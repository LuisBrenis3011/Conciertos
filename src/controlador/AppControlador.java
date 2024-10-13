package controlador;

import java.awt.BorderLayout;
import vista.FrmApp;
import vista.PnlCompraEntradas;

/**
 * @author Leonidas Garcia Lescano
 */
public class AppControlador {

    private FrmApp ventanaMain;

    private InicioSesionControlador inicioControlador;
    private RegistroControlador registroControlador;
    private MenuPrincipalControlador menuControlador;
    private SeleccionZonaControlador seleccionZonaControlador;
    private SeleccionConciertoControlador seleccionConciertoControlador;
    private CompraControlador compraControlador;
    private MisEntradasControlador entradasControlador;
    private MisEntradasControlador misEntradasControlador;

    public AppControlador() {

        ventanaMain = new FrmApp();
        seleccionZonaControlador = new SeleccionZonaControlador(this);
        seleccionConciertoControlador = new SeleccionConciertoControlador(this);
        compraControlador = new CompraControlador(this);
        registroControlador = new RegistroControlador(this);
        inicioControlador = new InicioSesionControlador(this);
        menuControlador = new MenuPrincipalControlador(this);
        entradasControlador = new MisEntradasControlador(this);
        misEntradasControlador = new MisEntradasControlador(this);

    }

    public void iniciar() {
        ventanaMain.setSize(450, 650);
        ventanaMain.PnlContenido.add(inicioControlador.getInicioVista());
        ventanaMain.setVisible(true);
        ventanaMain.setLocationRelativeTo(null);
    }

    public FrmApp getVentanaMain() {
        return ventanaMain;
    }

    public InicioSesionControlador getInicioControlador() {
        return inicioControlador;
    }

    public RegistroControlador getRegistroControlador() {
        return registroControlador;
    }

    public MenuPrincipalControlador getMenuControlador() {
        return menuControlador;
    }

    public SeleccionZonaControlador getSeleccionZonaControlador() {
        return seleccionZonaControlador;
    }

    public SeleccionConciertoControlador getSeleccionConciertoControlador() {
        return seleccionConciertoControlador;
    }

    public CompraControlador getCompraControlador() {
        return compraControlador;
    }

    public MisEntradasControlador getEntradasControlador() {
        return entradasControlador;
    }

    public MisEntradasControlador getMisEntradasControlador() {
        return misEntradasControlador;
    }

}
