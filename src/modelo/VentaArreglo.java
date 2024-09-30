package modelo;

public class VentaArreglo {

    private Venta[] ventas;
    private int capacidad;

    public VentaArreglo(Zona zona) {
        this.ventas = new Venta[zona.getCapacidad()];
        capacidad = zona.getCapacidad();
    }

    public boolean addVenta(Venta venta) {
        int i = 0;
        while (i != capacidad) {
            if (ventas[i] == null) {
                break;
            }
            i++;
        }

        if (i == capacidad) {
            return false;
        } else {
            ventas[i] = venta;
            return true;
        }
    }

    public Venta[] mostrarVentas() {
        Venta[] aux = new Venta[capacidad];

        int i = 0;
        for (Venta venta : ventas) {
            if (venta != null) {
                aux[i] = ventas[i];
            }
            i++;
        }

        return aux;
    }

    public Venta obtenerVentasPorPersona(String nombreCliente) {
        for (int i = 0; i < capacidad; i++) {
            try {
                if (ventas[i].getPersona().getNombre().equals(nombreCliente)) {
                    return ventas[i];
                }
            } catch (Exception e) {
            }
        }
        return null;
    }

    public boolean eliminarVenta(String nombreCliente) {
        for (int i = 0; i < capacidad; i++) {
            try {
                if (ventas[i].getPersona().getNombre().equals(nombreCliente)) {
                    ventas[i] = null;
                    return true;
                }
            } catch (Exception e) {
            }

        }
        return false;
    }

}
