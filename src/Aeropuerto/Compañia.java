package Aeropuerto;

import java.util.ArrayList;
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



    public List<Vuelos> buscarVuelos(String ciudad_origen, String ciudad_destino){
        List<Vuelos> vuelos_encontrados=new ArrayList<>();
        for (Vuelos v: vuelos
             ) {
            if(v.ciudad_destino.equals(ciudad_destino) && v.ciudad_origen.equals(ciudad_origen)){
                vuelos_encontrados.add(v);
            }
        }
        return vuelos_encontrados;
        }
    }

