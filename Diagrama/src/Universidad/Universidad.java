
package Universidad;

import Persona.Estudiante;
import Persona.Profesor;
import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombreUniversidad;
    private List<Facultad> listaFacultades = new ArrayList<>();
    private List<Carrera> listaCarrerasTotal = new ArrayList<>();
    private List<Estudiante> listestudianteTotal = new ArrayList<>();
    private List<Profesor> listprofesorTotal = new ArrayList<>();

    public Universidad(String nombreUniversidad) {
        this.nombreUniversidad = nombreUniversidad;
    }
    
    //Metodos
    
    public String getNombreUniversidad() {
        return nombreUniversidad;
    }
    
    public void agregarEstudiante(Estudiante estudiante) {
        listestudianteTotal.add(estudiante);
    }
    
    public void agregarProfesor(Profesor profesor) {
        listprofesorTotal.add(profesor);
    }
    
    public void agregarFacultad(Facultad facultad) {
        listaFacultades.add(facultad);
    }
    
    public void agregarCarrera(Carrera carrera) {
        listaCarrerasTotal.add(carrera);
    }

    public void mostrarFacultades() {
        System.out.println("Las Facultades de la Universidad " + nombreUniversidad + " son: ");
        for(Facultad facultad : listaFacultades) {
            System.out.println(facultad.getNombreFacultad());
        }
        
        System.out.println("");
    }
    
    public void mostrarEstudiantes() {
        System.out.println("Los estudiantes de la " + nombreUniversidad + " son : ");
        
        for (Estudiante estudiantes : listestudianteTotal) {
            System.out.println(estudiantes.mostrarNombre() + " " + estudiantes.mostrarApellido() + " , Su carrera es " + estudiantes.mostrarCarreraUni());
        }
        
        System.out.println("");
    }
    
    public void mostrarProfesores() {
        System.out.println("Los profesores de la " + nombreUniversidad + " son : ");
        
        for (Profesor profesores : listprofesorTotal) {
            System.out.println(profesores.mostrarNombre() + " " + profesores.mostrarApellido() + " , Su Especialidad es " + profesores.getTitulo());
        }
        
        System.out.println("");
    }
    
    public void mostrarCarreras() {
        System.out.println("Las carreras de la " + nombreUniversidad + " son : ");
        
        for (Carrera carreras : listaCarrerasTotal) {
            System.out.println(carreras.getNombredeCarrera());
        }
        
        System.out.println("");
    }
    
    
    //      Mostrar Cantidades      
    
    public void mostrarPersonasTotales() {
        int PersonasT = listestudianteTotal.size() + listprofesorTotal.size();
        
        System.out.println("La cantidad de personas en la " + nombreUniversidad + " son : " + PersonasT);
    }
    
    public void mostrarCantEst() {
        System.out.println(listestudianteTotal.size());
    }
    
    public void mostrarCantProf() {
        System.out.println(listprofesorTotal.size());
    }
    
    public void mostrarCantCarrera() {
        System.out.println(listaCarrerasTotal.size());
    }
    
    
}
