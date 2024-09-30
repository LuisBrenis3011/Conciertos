package modelo;

import java.util.Date;
import modelo.Zona;

/**
 * @author Leonidas Garcia Lescano
 */
public class Concierto {

    private String nombre;
    Date fecha;
    Zona[] zonas;

    public Concierto(String nombre, Date fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.zonas = new Zona[3];
    }

    public boolean agregarZona(String nombre, int capacidad, int precio) {
        int i = 0;
        while (i != 3) {
            if (zonas[i] == null) {
                break;
            }
            i++;
        }

        if (i == 3) {
            return false;
        } else {
            zonas[i] = new Zona(nombre, capacidad, precio);
            return true;
        }
    }

    public boolean eliminarZona(String nombre) {
        int i = 0;
        while (i != 3) {
            try {
                if (zonas[i].getNombre().equals(nombre) && zonas[i] != null) {
                    break;
                }
            } catch (Exception e) {

            }

            i++;
        }

        if (i == 3) {
            return false;
        } else {
            zonas[i] = null;
            return true;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public Zona[] getZonas() {
        return zonas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setZonas(Zona[] zonas) {
        this.zonas = zonas;
    }

}
