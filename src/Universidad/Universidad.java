
package Universidad;

import Cursos.Programa;
import Persona.Estudiante;
import Persona.Profesor;

public class Universidad {
    private String nombreUniversidad;
    private Programa[] programa;
    private Estudiante[] estudiante;
    private Profesor[] profesor;

    public Universidad(String nombreUniversidad, Programa[] programa, Estudiante[] estudiante, Profesor[] profesor) {
        this.nombreUniversidad = nombreUniversidad;
        this.programa = programa;
        this.estudiante = estudiante;
        this.profesor = profesor;
    }

    public String getNombreUniversidad() {
        return nombreUniversidad;
    }

    public Programa[] getPrograma() {
        return programa;
    }

    public Estudiante[] getEstudiante() {
        return estudiante;
    }

    public Profesor[] getProfesor() {
        return profesor;
    }
    
    public void mostrarProgramas() {
        for(Programa programas : programa) {
            System.out.println(programas.getNombredeCarrera());
        }
        
        System.out.println("");
    }
    
    public void mostrarEstudiantes() {
        System.out.println("Los estudiantes son : ");
        
        for (Estudiante estudiantes : estudiante) {
            System.out.println(estudiantes.mostrarNombre() + " " + estudiantes.mostrarApellido() + " , Su carrera es " + estudiantes.mostrarCarrera());
        }
        
        System.out.println("");
    }
    
    public void mostrarProfesores() {
        System.out.println("Los profesores son : ");
        
        for (Profesor profesores : profesor) {
            System.out.println(profesores.mostrarNombre() + " " + profesores.mostrarApellido() + " , Su Especialidad es " + profesores.getTitulo());
        }
        
        System.out.println("");
    }
    
}
