
package Persona;

public class Profesor {
    private int id;
    private String titulo;
    private Persona persona;

    public Profesor(int id, String titulo, Persona persona) {
        this.id = id;
        this.titulo = titulo;
        this.persona = persona;
    }

    public int getId() {
        return id;
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
