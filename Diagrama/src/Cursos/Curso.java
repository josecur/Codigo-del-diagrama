
package Cursos;

import Persona.Estudiante;
import Persona.Profesor;
import java.util.List;

public class Curso {
    private String nombre;
    private int creditos;
    private Profesor profesor;
    private List<Estudiante> estudiantesXcurso;
    
    public Curso(String nombre, int creditos, Profesor profesor, List<Estudiante> estudiantesXcurso) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.profesor = profesor;
        this.estudiantesXcurso = estudiantesXcurso;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void MostrarInfoCurso() {
        System.out.println("El curso "+ nombre + ", pesa " + creditos + " creditos y lo dicta el profesor" + profesor);
        System.out.println("La lista de los" + estudiantesXcurso.size() + "estudiantes es :");
        for(Estudiante estudiante : estudiantesXcurso) {
            System.out.println(estudiante.mostrarNombre());
        }
        
        System.out.println("");
    }

}
