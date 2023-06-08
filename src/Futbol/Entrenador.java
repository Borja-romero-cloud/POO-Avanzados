package Futbol;

public class Entrenador extends Persona{

    String estrategia;

    public Entrenador(String estrategia,String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
        this.estrategia=estrategia;
    }

    @Override
    public void datos() {
        System.out.println("Nombre: "+this.nombre+ " Apellido: "+this.apellido+ " Edad: "+this.edad + " Estrategia: "+this.estrategia);
    }

    @Override
    public void viajar() {
        System.out.println("Soy el entrenador y estoy viajando con el equipo");
    }

    @Override
    public void entrenar() {
        System.out.println("Soy entrenador y estoy enseñando a mis jugadores para jugar mejor el partido");
    }

    @Override
    public void asistirPartido() {
        System.out.println("Soy entrenador y estoy dirigiendo al equipo");
    }
    public void planificarEntreno(){
        System.out.println("Soy entrenador y planifico los partidos para tratar de ganar los máximos posibles");
    }
}
