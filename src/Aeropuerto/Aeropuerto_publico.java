package Aeropuerto;

import java.util.List;

public class Aeropuerto_publico extends Aeropuerto{

        double subvencion;

    public Aeropuerto_publico(String nombre, String ciudad, String pais, List<Compañia> companias, double subvencion) {
        super(nombre, ciudad, pais,companias);
        this.subvencion=subvencion;
    }

    public void getSubvencion() {
        System.out.println("La subvención del gobierno al aeropuerto "+this.nombre + " es de " + this.subvencion);
    }

    @Override
    public void datos() {
        System.out.println("Nombre "+this.nombre + " Ciudad "+this.ciudad + " País: "+this.pais);
    }
}
