package Aeropuerto;

public class Pasajeros {

    String nombre;
    int numero_pasaporte;
    String nacionalidad;

    public Pasajeros(String nombre, int numero_pasaporte, String nacionalidad){
        this.nombre=nombre;
        this.numero_pasaporte=numero_pasaporte;
        this.nacionalidad=nacionalidad;

    }

    public void datos(){
        System.out.println("Nombre: " + this.nombre + "Número de pasaporte: " + this.numero_pasaporte + "Nacionalidad: " + this.nacionalidad);
    }
}
