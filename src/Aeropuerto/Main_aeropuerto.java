package Aeropuerto;

import Futbol.Doctor;
import Futbol.Entrenador;
import Futbol.Futbolista;
import Futbol.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_aeropuerto {

    public static void main(String[] args) {

        boolean encontrado=false;
        Scanner scanner=new Scanner(System.in);
        int opcion;
        List<Aeropuerto> aeropuertos=new ArrayList<>();
        String aeropuerto_usuario;
        String compania_usuario;
        List<Compañia> companias_a1=new ArrayList<>();
        List<Compañia> companias_a2=new ArrayList<>();
        List<Vuelos> vuelos_a1=new ArrayList<>();
        List<Vuelos> vuelos_a2=new ArrayList<>();

        String[]empresas_a1={"Danone","Nike","Coca-Cola"};
        Vuelos vuelo1= new Vuelos(23, "Barcelona","Lima",250.90,220,100);
        Vuelos vuelo2= new Vuelos(24, "Buenos Aires","New York",369.90,280,90);
        Vuelos vuelo3= new Vuelos(25, "LA","El Cairo",690,220,100);
        Vuelos vuelo4= new Vuelos(26, "Nigeria","Madrid",460.65,280,90);
        vuelos_a1.add(vuelo1);
        vuelos_a1.add(vuelo2);
        vuelos_a2.add(vuelo3);
        vuelos_a2.add(vuelo4);
        Compañia ca1= new Compañia("Iberia",vuelos_a1);
        Compañia ca1_1= new Compañia("Vueling",vuelos_a1);
        companias_a1.add(ca1);
        companias_a1.add(ca1_1);
        Compañia ca2= new Compañia("Ryanair",vuelos_a2);
        companias_a2.add(ca2);
        Aeropuerto a1= new Aeropuerto_privado("Airport Manila","Manila","Filipinas",companias_a1,empresas_a1);
        Aeropuerto a2= new Aeropuerto_publico("Airport Juárez","Juárez","México",companias_a2,5100000.80);
        aeropuertos.add(a1);
        aeropuertos.add(a2);

        do{
            System.out.println("Menú:");
            System.out.println("1- CONSULTAR AEROPUERTOS GESTIONADOS");
            System.out.println("2- VER EMPRESAS QUE PATROCINAN UN DETERMINADO AEROPUERTO ");
            System.out.println("3- DETERMINADO AEROPUERTO VER LAS COMPAÑIAS QUE OPERAN");
            System.out.println("4- PARA UNA DETERMINADA COMPAÑÍA QUE OPERA EN UN AEROPUERTO, LISTAR POSIBLES VUELOS");
            System.out.println("5- MOSTRAR LOS POSIBLES VUELOS(ID) QUE PARTEN DE UNA CIUDAD ORIGEN A OTRA CIUDAD DE DESTINO (INDICADAS POR EL USUARIO) Y MOSTRAR PRECIO.");
            System.out.println("6- SALIR");

            do {
                System.out.println("Mi opción es: ");
                opcion = scanner.nextInt();
            }while(opcion<1 || opcion>6);


            switch(opcion){

                case 1:

                    for (Aeropuerto a: aeropuertos
                    ) {
                        if (a instanceof Aeropuerto_privado) {
                            System.out.println("El aeropuerto " + a.nombre + " es privado y se encuentra en " + a.pais + " en la ciudad de " + a.ciudad);
                        } else if (a instanceof Aeropuerto_publico) {
                            System.out.println("El aeropuerto " + a.nombre + " es público y se encuentra en " + a.pais + " en la ciudad de " + a.ciudad);

                        }
                    }
                    break;
                case 2:

                    System.out.println("Introduce el nombre del aeropuerto: ");
                    scanner.nextLine();
                    aeropuerto_usuario=scanner.nextLine();

                        for (Aeropuerto aero: aeropuertos
                             ) {
                                if(aeropuerto_usuario.equals(aero.nombre)){
                                    encontrado=true;
                                    if (aero instanceof Aeropuerto_privado) {
                                        System.out.println("Las empresas son: ");
                                        for (String empresa : ((Aeropuerto_privado) aero).empresas
                                             ) {
                                            System.out.println(empresa);
                                        }
                                    }else if (aero instanceof Aeropuerto_publico) {
                                        System.out.println("El aeropuerto " + aero.nombre + " es público y ha recibido una subvencion de " + ((Aeropuerto_publico) aero).subvencion + "€");

                                    }
                                }

                        }
                    if(!encontrado){
                        System.out.println("El aeropuerto introducido no existe");
                    }

                    break;

                case 3:
                    System.out.println("Introduce el nombre de la compañia: ");
                    scanner.nextLine();
                    compania_usuario=scanner.nextLine();
                    encontrado=false;

                    for (Aeropuerto aero: aeropuertos
                    ) {
                        //System.out.println(aero.nombre);
                        for (Compañia c: aero.companias
                             ) {
                            //System.out.println(c.nombre);
                            if(c.nombre.equals(compania_usuario)){
                                int iterador=1;
                                encontrado=true;
                                System.out.println("La compañía " + compania_usuario + " opera en el aeropuerto " + aero.nombre + " y este es su listado de vuelos: ");
                                System.out.println();
                                for (Vuelos v: c.vuelos
                                     ) {
                                    System.out.println("Vuelo " + iterador + " ID: " + v.id + " Ciudad de origen: " + v.ciudad_origen + " Ciudad de destino: " + v.ciudad_destino + " Precio " + v.precio_viaje + "€");
                                    iterador++;
                                }
                            }
                        }
                        }

                    if(!encontrado){
                        System.out.println("La compañía introducida no existe");
                    }

                    break;

                case 6:
                    System.out.println("VAS A SALIR DEL PROGRAMA....");
                    break;
                default:
                    System.out.println("La opción elegida no es válida");
                    break;
            }

        }while(opcion!=6);

    }
}
