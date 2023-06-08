package Aeropuerto;

import java.util.List;

public abstract class Aeropuerto {

    String nombre;
    String ciudad;
    String pais;

    List<Compañia> companias;

    public Aeropuerto(String nombre, String ciudad, String pais, List<Compañia> companias){
        this.nombre=nombre;
        this.ciudad=ciudad;
        this.pais=pais;
        this.companias=companias;
    }

    public abstract void datos();
}
