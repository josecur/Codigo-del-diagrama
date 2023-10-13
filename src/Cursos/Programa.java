
package Cursos;


public class Programa {
    private String nombredeCarrera;
    private Curso[] cursos;

    public Programa(String nombredeCarrera, Curso[] cursos) {
        this.nombredeCarrera = nombredeCarrera;
        this.cursos = cursos;
    }


    public String getNombredeCarrera() {
        return nombredeCarrera;
    }

    public Curso[] getCursos() {
        return cursos;
    }
    
    public void imprimirCursos() {
        for (Curso curso: cursos){
            System.out.println("Nombre de los cursos : " + curso.getNombre());
        }
        
        System.out.println("");
    }
}
