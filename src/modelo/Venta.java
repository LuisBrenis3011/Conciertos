package modelo;

/**
 * @author Nick Emanuel Salcedo Alfaro
 */
import java.util.Date;

public class Venta {

    Date fecha;
    double monto;
    Persona persona;
    Tarjeta tarjeta;
    Entrada entrada;

    public Venta(Date fecha, double monto, Persona persona, Entrada entrada) {
        this.fecha = fecha;
        this.monto = monto;
        this.persona = persona;
        this.entrada = entrada;
    }

    public Venta(Date fecha, double monto, String nombre, String apellidos, String dni, Tarjeta tarjeta, int numero) {
        this.fecha = fecha;
        this.monto = monto;
        this.persona = new Persona(nombre, apellidos, dni, tarjeta);
        this.entrada = new Entrada(numero);
    }

    public boolean anular() {
        return this.entrada.liberar();
    }

    public Date getFecha() {
        return fecha;
    }

    public double getMonto() {
        return monto;
    }

    public Persona getPersona() {
        return persona;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public Entrada getEntrada() {
        return entrada;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }

}
