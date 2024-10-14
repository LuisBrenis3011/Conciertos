package modelo;

import java.util.Date;

/**
 * @author Alberto Luis Gil Sixi
 */
public class PersonaArreglo {

    private final Persona Personas[];

    public PersonaArreglo(int tamano) {
        this.Personas = new Persona[tamano];
    }

    public boolean AgregarPersona(Persona Persona) {
        boolean insertado = false;
        for (int i = 0; i < Personas.length; i++) {
            if (Personas[i] == null) {
                Personas[i] = Persona;
                insertado = true;
                break;
            }
        }

        return insertado;

    }
    
    public Persona buscarPersona(String dni){
        for (Persona Persona : Personas) {
            if (Persona.getDni().equals(dni)) {
                return Persona;
            }
        }
        return null;
    }
    
    public void EliminarPersona(String Persona) {//recibe el nombre del Persona
        boolean eliminado = false;
        for (int i = 0; i < Personas.length; i++) {
            if (Personas[i].getNombre().equals(Persona)) {
                Personas[i] = null;
                eliminado = true;
                break;
            }
        }
        if (!eliminado) {
            System.out.println("Persona no encontrado");
        }
    }

    public void MostrarPersonas() {
        int contadorLocal = 1;
        for (Persona Persona : Personas) {
            if (Persona != null) {
                System.out.println("El Persona #" + contadorLocal + "es " + Persona.getNombre());
                contadorLocal++;
            }
        }
    }
}
