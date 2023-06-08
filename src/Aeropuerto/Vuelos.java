package Aeropuerto;

import java.util.List;

public class Vuelos {

    int id;
    String ciudad_origen;
    String ciudad_destino;
    double precio_viaje;
    List<Pasajeros> pasajeros;
    int numero_maximo_pasajeros;

    int numero_real_pasajeros;

    public Vuelos(int id, String ciudad_origen, String ciudad_destino, double precio_viaje, int numero_maximo_pasajeros, int numero_real_pasajeros){
        this.id=id;
        this.ciudad_origen=ciudad_origen;
        this.ciudad_destino=ciudad_destino;
        this.precio_viaje=precio_viaje;
        this.numero_maximo_pasajeros=numero_maximo_pasajeros;
        this.numero_real_pasajeros=numero_real_pasajeros;
    }

    public void datos(){

        System.out.println("ID: "+ this.id + "Ciudad de origen: " + this.ciudad_origen + "Ciudad de destino: " + this.ciudad_destino +
        " Precio del viaje: " + this.precio_viaje + " Número máximo de pasajeros: " + this.numero_maximo_pasajeros + " Número real de pasajeros: " + this.numero_real_pasajeros);
    }

}
