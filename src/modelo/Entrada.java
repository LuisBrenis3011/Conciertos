package modelo;

/**
 * @author Leonidas Garcia Lescano
 */
public class Entrada {

    private int numero;
    private String estado = "Disponible";

    //Constructor
    public Entrada(int numero) {
        this.numero = numero;
    }

    //Metodos propios
    public boolean vender() {
        boolean result = false;
        if ("Disponible".equals(estado)) {
            estado = "Vendido";
            result = !result;
        }
        return result;
    }

    public boolean liberar() {
        boolean result = false;
        if (!"Disponible".equals(estado)) {
            estado = "Disponible";
            result = !result;
        }
        return result;
    }

    //Getters y Setters
    public int getNumero() {
        return numero;
    }

    public boolean disponible() {
        return "Disponible".equals(estado);
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
