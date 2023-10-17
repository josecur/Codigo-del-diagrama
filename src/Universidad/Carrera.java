
package Universidad;

import Cursos.Curso;
import Persona.Estudiante;
import java.util.List;


public class Carrera {
    private String nombredeCarrera;
    private List<Curso> listacursosXCarrera;
    private List<Estudiante> listaEstXCarrera;

    public Carrera(String nombredeCarrera, List<Curso> listacursos, List<Estudiante> listaEstXCarrera) {
        this.nombredeCarrera = nombredeCarrera;
        this.listacursosXCarrera = listacursos;
        this.listaEstXCarrera = listaEstXCarrera;
    }
    
    public void agregarEstudiante(Estudiante estudiante) {
        listaEstXCarrera.add(estudiante);
    }
    
    public void agregarCurso(Curso curso) {
        listacursosXCarrera.add(curso);
    }
    
    public String getNombredeCarrera() {
        return nombredeCarrera;
    }
    
    public void imprimirCursosenCarrera() {
        for (Curso curso: listacursosXCarrera){
            System.out.println("Nombre de los cursos : " + curso.getNombre());
        }
        
        System.out.println("");
    }
    
    public void imprimirEstenCarrera() {
        System.out.println("Nombre de los Estudiantes en la carrera de " + nombredeCarrera + " son : ");
        for (Estudiante estudiante : listaEstXCarrera){
            System.out.println(estudiante.mostrarNombre());
        }
        
        System.out.println("");
    }
}
