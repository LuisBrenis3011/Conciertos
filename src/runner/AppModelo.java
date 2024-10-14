/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package runner;

import java.util.Scanner;
import modelo.Concierto;
import modelo.ConciertoArreglo;
import modelo.Entrada;
import modelo.Persona;
import modelo.PersonaArreglo;
import modelo.Tarjeta;
import modelo.Venta;
import modelo.VentaArreglo;
import modelo.Zona;
import java.util.Date;

/**
 *
 * @author Nick Emanuel Salcedo Alfaro
 */
public class AppModelo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);
        PersonaArreglo personas = new PersonaArreglo(60);
        ConciertoArreglo conciertos = new ConciertoArreglo(3);

        Concierto concierto = new Concierto("Viva por el Rock", new Date());
        concierto.agregarZona("VIP", 10, 150);
        concierto.agregarZona("Preferencial", 20, 100);
        concierto.agregarZona("General", 30, 50);
        conciertos.AgregarConcierto(concierto);
        VentaArreglo ventas = new VentaArreglo(concierto.getZonas()[0]);
        while (true) {
            System.out.println("----- Menu -----");
            System.out.println("1. Registrar Persona");
            System.out.println("2. Registrar Tarjeta");
            System.out.println("3. Comprar Entrada");
            System.out.println("4. Ver historial de ventas");
            System.out.println("5. Eliminar Tarjeta");
            System.out.println("6. Salir");
            int opcion = Integer.parseInt(leer.nextLine());
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombres: ");
                    String nombres = leer.nextLine();
                    System.out.print("Ingrese apellidos: ");
                    String apellidos = leer.nextLine();
                    System.out.print("Ingrese DNI: ");
                    String dni = leer.nextLine();
                    System.out.print("Ingrese contraseña: ");
                    String contraseña = leer.nextLine();
                    personas.AgregarPersona(new Persona(nombres, apellidos, dni, contraseña));
                    System.out.println("Persona registrada.");
                    break;
                case 2:
                    System.out.print("Ingrese DNI para registrar tarjeta: ");
                    String dniTarjeta = leer.nextLine();
                    Persona personaTarjeta = personas.buscarPersona(dniTarjeta);
                    if (personaTarjeta != null) {
                        System.out.print("Ingrese numero de tarjeta: ");
                        int numeroTarjeta = Integer.parseInt(leer.nextLine());
                        System.out.print("Ingrese CVV: ");
                        int CVV = Integer.parseInt(leer.nextLine());
                        System.out.print("Ingrese nombre en la tarjeta: ");
                        String nombreTarjeta = leer.nextLine();
                        System.out.print("Ingrese fecha de expiracion (MM/YY): ");
                        String fechaTarjeta = leer.nextLine();

                        if (personaTarjeta.registrarTarjeta(numeroTarjeta, CVV, nombreTarjeta, fechaTarjeta)) {
                            System.out.println("Tarjeta registrada.");
                        } else {
                            System.out.println("Error: ya tiene una tarjeta registrada.");
                        }
                    } else {
                        System.out.println("Persona no encontrada.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese DNI para compra: ");
                    String dniCompra = leer.nextLine();
                    Persona personaCompra = personas.buscarPersona(dniCompra);
                    if (personaCompra != null && personaCompra.getTarjeta() != null) {
                        System.out.println("Seleccione una zona: ");
                        for (int i = 0; i < concierto.getZonas().length; i++) {
                            System.out.println((i + 1) + ". " + concierto.getZonas()[i].getNombre()
                                    + " (Capacidad disponible: " + concierto.getZonas()[i].getCapacidad() + ")");
                        }
                        int zonaOpcion = leer.nextInt() - 1;
                        leer.nextLine();
                        Zona zonaSeleccionada = concierto.getZonas()[zonaOpcion];

                        System.out.print("Ingrese cantidad de entradas: ");
                        int cantidadEntradas = Integer.parseInt(leer.nextLine());

                        if (zonaSeleccionada.venderEntrada(cantidadEntradas)) {
                            double montoTotal = zonaSeleccionada.getPrecio() * cantidadEntradas;
                            personaCompra.comprar(montoTotal);
                            ventas.addVenta(new Venta(new Date(), montoTotal, personaCompra, new Entrada(cantidadEntradas)));
                            System.out.println("Compra realizada con éxito.");
                        } else {
                            System.out.println("No hay suficientes entradas disponibles.");
                        }
                    } else {
                        System.out.println("Persona no encontrada o no tiene tarjeta registrada.");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese DNI para ver historial de ventas: ");
                    String dniHistorial = leer.nextLine();
                    Persona personaHistorial = personas.buscarPersona(dniHistorial);

                    if (personaHistorial != null) {
                        Venta ventaHistorial = ventas.obtenerVentasPorPersona(personaHistorial.getNombre());

                        if (ventaHistorial != null) {
                            System.out.println("Historial de ventas para " + personaHistorial.getNombre() + ":");
                            System.out.println("Fecha: " + ventaHistorial.getFecha() + ", Monto: " + ventaHistorial.getMonto()
                                    + ", Cantidad: " + ventaHistorial.getEntrada().getNumero());
                        } else {
                            System.out.println("No tiene compras registradas.");
                        }
                    } else {
                        System.out.println("Persona no encontrada.");
                    }
                    break;
                case 5:
                    System.out.print("Ingrese DNI para eliminar tarjeta: ");
                    String dniEliminarTarjeta = leer.nextLine();
                    Persona personaEliminarTarjeta = personas.buscarPersona(dniEliminarTarjeta);
                    if (personaEliminarTarjeta != null) {
                        if (personaEliminarTarjeta.eliminarTarjeta()) {
                            System.out.println("Tarjeta eliminada.");
                        } else {
                            System.out.println("No tiene tarjeta registrada.");
                        }
                    } else {
                        System.out.println("Persona no encontrada.");
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del sistema...");
                    return;
                default:
                    System.out.println("Opcion invalida");
            }
        }
    }
}
