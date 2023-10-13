
import Cursos.Curso;
import Cursos.Programa;
import Persona.Estudiante;
import Persona.Persona;
import Persona.Profesor;
import Universidad.Universidad;


public class Main {
    public static void main(String[] args){
    Estudiante[] listaEst = new Estudiante[2];
    Profesor[] listaProf  = new Profesor[1];
    Programa[] listaPrograma = new Programa[1];
    
    
    Curso[] listCMusica = new Curso[2];
    
    //Persona  Profesores
    Persona AlfonsoUgarte = new Persona("Alfoso", "Ugarte", 46, "San Isidro");
    
    //Persona Estudiantes
    Persona MiguelVidal = new Persona("Miguel","Vidal", 19, "San Miguel");
    Persona GabrielAscona = new Persona("Gabriel", "Ascona", 20, "Ate");
    
    //Profesores
    Profesor AlfonsoUgarte1 = new Profesor(00001, "Musico", AlfonsoUgarte);
    listaProf[0] = AlfonsoUgarte1;
    
    //Cursos
    Curso ViolinI = new Curso("Violin I", 5, AlfonsoUgarte1);
    listCMusica[0] = ViolinI;
    Curso PianoI = new Curso("Piano I", 4, AlfonsoUgarte1);
    listCMusica[1] = PianoI;
    
    //Carreras
    Programa Musica = new Programa("Musica", listCMusica);
    listaPrograma[0] = Musica;
    
    //Estudiantes
    Estudiante miguelVidal1 = new Estudiante(00001, MiguelVidal, Musica);
    listaEst[0] = miguelVidal1;
    
    Estudiante GabrielAscona1 = new Estudiante(00002, GabrielAscona, Musica);
    listaEst[1] = GabrielAscona1;
    
    //Universidad
    Universidad Usil = new Universidad("Usil", listaPrograma, listaEst, listaProf);
    
    //Codigo
    System.out.println("En la Universidad " + Usil.getNombreUniversidad());
    Musica.imprimirCursos();
    
    Usil.mostrarEstudiantes();
    Usil.mostrarProfesores();
    
    
    }
}
