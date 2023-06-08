package Futbol;

public class Doctor extends Persona{

    int experiencia;
    String titulacion;

    public Doctor(int experiencia, String titulacion, String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
        this.experiencia=experiencia;
        this.titulacion=titulacion;
    }

    public void datos() {
        System.out.println("Nombre: "+this.nombre+ " Apellido: "+this.apellido+ " Edad: "+this.edad + " Años de experiencia: "+this.experiencia + " Titulación: "+this.titulacion);
    }


    @Override
    public void viajar() {
        System.out.println("Soy doctor y estoy viajando con el equipo");
    }

    @Override
    public void entrenar() {
        System.out.println("Soy doctor y estoy en el entreno vigilando que nadie se lesione");
    }

    @Override
    public void asistirPartido() {
        System.out.println("Soy doctor y estoy vigilando para socorrrer a los futbolistas que caigan lesionados");

    }
    public void curarLesion(){
        System.out.println("Soy el doctor y mi trabajo consiste en curar a los futbolistas lesionados");
    }
}
