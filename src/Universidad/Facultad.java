
package Universidad;

import Persona.Estudiante;
import Persona.Profesor;
import java.util.ArrayList;
import java.util.List;

public class Facultad {
    private String nombreFacultad;
    private List<Carrera> ListaCarrerasXFac;
    private List<Estudiante> ListaEstudiantexFac;
    private List<Profesor> ListaProfesorxFac;

    public Facultad(String nombreFacultad, List<Carrera> ListaCarrerasXFac, List<Estudiante> ListaEstudiantexFac, List<Profesor> ListaProfesorxFac) {
        this.nombreFacultad = nombreFacultad;
        this.ListaCarrerasXFac = ListaCarrerasXFac;
        this.ListaEstudiantexFac = ListaEstudiantexFac;
        this.ListaProfesorxFac = ListaProfesorxFac;
    }

    public String getNombreFacultad() {
        return nombreFacultad;
    }
    
    public void mostrarCarrerasXFac() {
        System.out.println("Las carreras de la Facultad de " + nombreFacultad + " son : ");
        
        for (Carrera carreras : ListaCarrerasXFac) {
            System.out.println(carreras.getNombredeCarrera());
        }
        
        System.out.println("");
    }
    
    
    public void mostrarEstudiantesXFac() {
        System.out.println("Los estudiantes de la " + nombreFacultad + " son : ");
        
        for (Estudiante estudiantes : ListaEstudiantexFac) {
            System.out.println(estudiantes.mostrarNombre() + " " + estudiantes.mostrarApellido() + " , Su carrera es " + estudiantes.mostrarCarrera());
        }
        
        System.out.println("");
    }
    
    public void mostrarProfesores() {
        System.out.println("Los profesores de la " + nombreFacultad + " son : ");
        
        for (Profesor profesores : ListaProfesorxFac) {
            System.out.println(profesores.mostrarNombre() + " " + profesores.mostrarApellido() + " , Su Especialidad es " + profesores.getTitulo());
        }
        
        System.out.println("");
    }
    
    
    // Mostrar Cant
    
    public void mostrarPersonasTotalesFacultad() {
        int PersonasTenFac = ListaEstudiantexFac.size() + ListaProfesorxFac.size();
        
        System.out.println("La cantidad de personas en la Facultad de " + nombreFacultad + "son : " + PersonasTenFac);
    }
    
    public void mostrarCantEstudiantesXFac() {
        System.out.println(ListaEstudiantexFac.size());
    }
    
    public void mostrarCantProfesoresXFac() {
        System.out.println(ListaProfesorxFac.size());
    }
    
    public void mostrarCantCarrerasXFac() {
        System.out.println(ListaCarrerasXFac.size());
    }
}
