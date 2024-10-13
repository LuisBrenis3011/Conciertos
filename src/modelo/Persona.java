package modelo;

import java.util.Date;

/**
 * @author Leonidas Garcia Lescano
 */
public class Persona {

    private String nombre, apellidos, dni, contrasena;
    Tarjeta tarjeta;

    //Constructores
    public Persona(String nombre, String apellidos, String dni, Tarjeta tarjeta) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.tarjeta = tarjeta;
    }

    public Persona(String nombre, String apellidos, String dni, Tarjeta tarjeta, int numero, int CV, String nombre_trj, Date fecha) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.tarjeta = new Tarjeta(numero, CV, nombre_trj, fecha);
    }

    public Persona(String nombre, String apellidos, String dni, String contrasena) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.contrasena = contrasena;
    }

    //Metodos propios
    public boolean registrarTarjeta(int numero, int CV, String nombre_trj, Date fecha) {
        boolean result = true;
        this.tarjeta = new Tarjeta(numero, CV, nombre_trj, fecha);
        return result;
    }

    public boolean eliminarTarjeta() {
        boolean result = true;
        this.tarjeta = null;
        return result;
    }

    public boolean anularVenta(Venta venta) {
        boolean result = true;
        venta.anular();
        return true;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public String getContrasena() {
        return contrasena;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

}
