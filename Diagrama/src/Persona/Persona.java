
package Persona;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;
    private int id;

    public Persona(String nombre, String apellido, int edad, String direccion, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public int getId() {
        return id;
    }

}
