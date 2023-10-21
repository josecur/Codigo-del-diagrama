
import Cursos.Curso;
import Universidad.Carrera;
import Persona.Estudiante;
import Persona.Persona;
import Persona.Profesor;
import Universidad.Facultad;
import Universidad.Universidad;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Universidad Usil = new Universidad("Usil");
        
        //Facultades
        List<Estudiante> listaEstFacIngenieria = new ArrayList<>();
        List<Profesor> listaProfFacIngenieria = new ArrayList<>();
        List<Carrera> listaCarrerasxFInge = new ArrayList<>();
        
        
        List<Curso> listaCursosIngMecatronica = new ArrayList<>();
        List<Estudiante> listaEstIngMecatronica = new ArrayList<>();
        
        
        List<Estudiante> listaEstMatematicaI = new ArrayList<>();
        List<Estudiante> listaEstLenguajeI = new ArrayList<>();
        
        //Facultades
        Facultad Ingenieria = new Facultad("Ingenieria", listaCarrerasxFInge,listaEstFacIngenieria,listaProfFacIngenieria);
        Usil.agregarFacultad(Ingenieria);
        
        //Carreras
        Carrera IngenieriaMecatronica = new Carrera("Ingenieria Mecatronica",listaCursosIngMecatronica, listaEstIngMecatronica);
        listaCarrerasxFInge.add(IngenieriaMecatronica);
        Usil.agregarCarrera(IngenieriaMecatronica);
        
        //Persona  Profesores
        Persona MiguelAldana = new Persona("Miguel", "Aldana", 40, "San Bartolo", 00001);
        Persona LinsayIvonnet = new Persona("Linsay", "Ivonnet", 32, "Miraflores", 00002);
        Persona LuzRamirez = new Persona("Luz", "Ramirez", 48, "San Isidro", 00003);
        
        //Persona Estudiantes
        Persona AngeloMercedez = new Persona("Angelo", "Mercedez", 18, "Comas", 00001);
        Persona JoaquinJara = new Persona("Joaquin", "Jara", 19, "Comas", 00002);
        
        
        //Profesores
        Profesor MiguelAldana1 = new Profesor("Ingeniero", MiguelAldana);
        Usil.agregarProfesor(MiguelAldana1);
        listaProfFacIngenieria.add(MiguelAldana1);
                
        Profesor LinsayIvonnet1 = new Profesor("Ingeniero", LinsayIvonnet);    
        Usil.agregarProfesor(LinsayIvonnet1);
        listaProfFacIngenieria.add(LinsayIvonnet1);
        
        Profesor LuzRamirez1 = new Profesor("Ingeniero", LuzRamirez); 
        Usil.agregarProfesor(LuzRamirez1);
        listaProfFacIngenieria.add(LuzRamirez1);
                
        //Cursos
        Curso MatematicaI = new Curso("MatematicaI", 4, MiguelAldana1, listaEstMatematicaI);
        IngenieriaMecatronica.agregarCurso(MatematicaI);
        
        Curso LenguajeI = new Curso("LenguajeI", 4, LuzRamirez1, listaEstLenguajeI);
        IngenieriaMecatronica.agregarCurso(LenguajeI);
        
        //Estudiantes
        Estudiante AngeloMercedez1 = new Estudiante(AngeloMercedez, IngenieriaMecatronica);
        Usil.agregarEstudiante(AngeloMercedez1);
        listaEstFacIngenieria.add(AngeloMercedez1);
        listaEstMatematicaI.add(AngeloMercedez1);
        listaEstLenguajeI.add(AngeloMercedez1);
        
        Estudiante JoaquinJara1 = new Estudiante(JoaquinJara, IngenieriaMecatronica);
        Usil.agregarEstudiante(JoaquinJara1);
        listaEstFacIngenieria.add(JoaquinJara1);
        listaEstMatematicaI.add(JoaquinJara1);
        listaEstLenguajeI.add(JoaquinJara1);
        
        //Codigo
        Usil.mostrarPersonasTotales();
        Usil.mostrarFacultades();
        Usil.mostrarCarreras();
        Usil.mostrarEstudiantes();
        
        
    
    
    }
}
