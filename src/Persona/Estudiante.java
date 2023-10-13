
package Persona;

import Cursos.Programa;


public class Estudiante {
    private int id;
    private Persona persona;
    private Programa programa;

    public Estudiante(int id, Persona persona, Programa programa) {
        this.id = id;
        this.persona = persona;
        this.programa = programa;
    }

    public int getId() {
        return id;
    }

    public Persona getPersona() {
        return persona;
    }

    public Programa getPrograma() {
        return programa;
    }
    
    public String mostrarNombre() {
        return persona.getNombre();
    }
    
    public String mostrarApellido() {
        return persona.getApellido();
    }
    
    public String mostrarCarrera() {
        return programa.getNombredeCarrera();
    }
}
