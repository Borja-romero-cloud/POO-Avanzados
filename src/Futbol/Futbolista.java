package Futbol;

public class Futbolista extends Persona{
    int dorsal;
    String posicion;

    public Futbolista(int dorsal, String posicion,String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
        this.dorsal=dorsal;
        this.posicion=posicion;
    }

    public void datos(){
        System.out.println("Nombre: "+this.nombre+ " Apellido: "+this.apellido+ " Edad: "+this.edad + " Dorsal: "+this.dorsal+ " Posición: "+this.posicion);
    }

    @Override
    public void viajar() {
        System.out.println("Soy futbolista y estoy viajando con el equipo");

    }

    @Override
    public void entrenar() {
        System.out.println("Soy futbolista y estoy entrenando para jugar mejor el partido");

    }

    @Override
    public void asistirPartido() {
        System.out.println("Soy futbolista y jugando el partido de fútbol");

    }
    public void entrevistar(){
        System.out.println("Soy futbolista y soy el único que puede conceder entrevistas");
    }
}
