package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Leonidas Garcia Lescano
 */
public class Persona {

    private String nombre, apellidos, dni, contrasena;
    private Tarjeta tarjeta;
    private Venta[] historialVentas;
    private int ventaCount = 0;

    //Constructores
    public Persona(String nombre, String apellidos, String dni, String contrasena, Tarjeta tarjeta) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.contrasena = contrasena;
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
        this.historialVentas = new Venta[4];
        this.ventaCount = 0;
        this.tarjeta = null;
    }

    //Metodos propios
    public boolean registrarTarjeta(int numero, int CV, String nombre_trj, String fechastr) {
        boolean result = true;
        SimpleDateFormat formato = new SimpleDateFormat("MM/yy");
        try{
        Date fecha = formato.parse(fechastr);
        this.tarjeta = new Tarjeta(numero, CV, nombre_trj, fecha);
        return result;
        } catch (ParseException e){
             System.out.println("Error al convertir la fecha: " + e.getMessage());
             return !result;
        }
    }

    public boolean eliminarTarjeta() {
        boolean result = true;
        if (tarjeta != null){
        this.tarjeta = null;
        return result;
        }
        return !result;
    }

    public boolean anularVenta(Venta venta) {
        boolean result = true;
        venta.anular();
        return result;
    }

    public boolean comprar(double monto) {
        if (ventaCount < historialVentas.length) {
            historialVentas[ventaCount] = new Venta(new Date(), monto, this, null);
            ventaCount++;
            return true;
        } else {
            return false;
        }
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
