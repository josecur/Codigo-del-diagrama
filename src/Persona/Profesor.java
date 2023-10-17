
package Persona;

public class Profesor {
    private String titulo;
    private Persona persona;

    public Profesor(String titulo, Persona persona) {
        this.titulo = titulo;
        this.persona = persona;
    }

    public String getTitulo() {
        return titulo;
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
    
    

}
