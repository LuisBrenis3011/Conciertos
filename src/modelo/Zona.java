package modelo;

/**
 * @author Leonidas Garcia Lescano
 */
public class Zona {

    private String nombre;
    private int capacidad, precio;
    private Entrada[] entradas;

    //Constructor
    public Zona(String nombre, int capacidad, int precio) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.precio = precio;
        this.entradas = new Entrada[capacidad];
        generarEntradas();
    }

    private boolean generarEntradas() {
        boolean result = true;
        for (int i = 0; i < capacidad; i++) {
            entradas[i] = new Entrada(i + 1);
        }
        return result;
    }

    public Entrada[] mostrarEntrada() {
        return entradas;
    }

    public boolean venderEntrada(int numero) {
        if (entradas[numero - 1].disponible()) {
            return entradas[numero - 1].vender();
        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getPrecio() {
        return precio;
    }

    public Entrada[] getEntradas() {
        return entradas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setEntradas(Entrada[] entradas) {
        this.entradas = entradas;
    }

}
