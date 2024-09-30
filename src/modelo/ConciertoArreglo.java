package modelo;

import java.util.Date;

/**
 * @author Alberto Luis Gil Sixi
 */
public class ConciertoArreglo {

    private final Concierto Conciertos[];

    public ConciertoArreglo(int tamano) {
        this.Conciertos = new Concierto[tamano];
    }

    public boolean AgregarConcierto(Concierto concierto) {
        boolean insertado = false;
        for (int i = 0; i < Conciertos.length; i++) {
            if (Conciertos[i] == null) {
                Conciertos[i] = concierto;
                insertado = true;
                break;
            }
        }

        return insertado;

    }

    public void EliminarConcierto(String concierto) {//recibe el nombre del concierto
        boolean eliminado = false;
        for (int i = 0; i < Conciertos.length; i++) {
            if (Conciertos[i].getNombre().equals(concierto)) {
                Conciertos[i] = null;
                eliminado = true;
                break;
            }
        }
        if (!eliminado) {
            System.out.println("Concierto no encontrado");
        }
    }

    public void MostrarConciertos() {
        int contadorLocal = 1;
        for (Concierto Concierto : Conciertos) {
            if (Concierto != null) {
                System.out.println("El concierto #" + contadorLocal + "es " + Concierto.getNombre());
                contadorLocal++;
            }
        }
    }
}
