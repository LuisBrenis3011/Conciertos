package modelo;

import java.util.Date;

/**
 * @author Leonidas Garcia Lescano
 */
public class Tarjeta {

    private int numero, CV;
    private String nombre;
    private Date fecha;

    //Constructor
    public Tarjeta(int numero, int CV, String nombre, Date fecha) {
        this.numero = numero;
        this.CV = CV;
        this.nombre = nombre;
        this.fecha = fecha;
    }

    //Getters y Setters
    public int getNumero() {
        return numero;
    }

    public int getCV() {
        return CV;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCV(int CV) {
        this.CV = CV;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
