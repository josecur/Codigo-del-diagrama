
package Cursos;

import Persona.Profesor;

public class Curso {
    private String nombre;
    private int creditos;
    private Profesor profesor;

    public Curso(String nombre, int creditos, Profesor profesor) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public Profesor getProfesor() {
        return profesor;
    }

}
