
package Persona;

import Universidad.Carrera;


public class Estudiante {
    
    private Persona persona;
    private Carrera carrera;

    public Estudiante(Persona persona, Carrera carrera) {
        this.persona = persona;
        this.carrera = carrera;
    }


    public Persona getPersona() {
        return persona;
    }
    
    public String mostrarNombre() {
        return persona.getNombre();
    }
    
    public String mostrarApellido() {
        return persona.getApellido();
    }
    
    public int mostrarEdad() {
        return persona.getEdad();
    }
    
    public int mostrarId() {
        return persona.getId();
    }
    
    public String mostrarCarreraUni() {
        return carrera.getNombredeCarrera();
    }
    
    public String mostrarCarrera() {
        return "El estudiante "+ persona.getNombre() + "esta en la carrera de : " +carrera.getNombredeCarrera();
    }
}
