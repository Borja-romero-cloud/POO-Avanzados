package Aeropuerto;

import java.util.List;

public class Compañia {

    List<Vuelos> vuelos;
    String nombre;

    public Compañia(String nombre, List<Vuelos> vuelos){
        this.nombre=nombre;
        this.vuelos=vuelos;
    }

    public void getDatos(){
        System.out.println("El nombre de la compañía es " + this.nombre);
    }
}
