package Aeropuerto;

import java.lang.reflect.Array;
import java.util.List;

public class Aeropuerto_privado extends Aeropuerto {

    String[] empresas;

    public Aeropuerto_privado(String nombre, String ciudad, String pais,List<Compañia> companias ,String[] empresas) {
        super(nombre, ciudad, pais,companias);
        this.empresas=empresas;
    }

    public void mostrarEmpresas(){

        for (String e : this.empresas
             ) {
            System.out.println(e);
        }
    }

    @Override
    public void datos() {
        System.out.println("Nombre "+this.nombre + " Ciudad "+this.ciudad + " País: "+this.pais);
    }
}
