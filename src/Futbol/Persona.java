package Futbol;

public abstract class Persona {
    String nombre;
    String apellido;
    int edad;

    public  Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }


    public abstract void datos();
    public abstract void viajar();
    public abstract void entrenar();
    public abstract void asistirPartido();


}
