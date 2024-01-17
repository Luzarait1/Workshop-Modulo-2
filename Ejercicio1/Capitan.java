package Ejercicio1;

public class Capitan {

    //Atributos
    private String nombre;
    private String apellido;
    private int matriculaNavegacion;

    //Constructor
    public Capitan(String nombre, String apellido, int matriculaNavegacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matriculaNavegacion = matriculaNavegacion;
    }

    //Metodo propio
    public void mostrarInfo() {
        System.out.println("El Capitan con matricula de navegacion: " + getMatriculaNavegacion() + " se llama " + getNombre() + " " + getApellido());
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getMatriculaNavegacion() {
        return matriculaNavegacion;
    }
}
