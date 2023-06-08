package Futbol;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main_futbol {

    static ArrayList<Persona> persona=new ArrayList<>();
    static Scanner scanner=new Scanner(System.in);

    static Persona futbolista1=new Futbolista(9,"Delantero","Gonzalo","Higuain",30);
    static Persona futbolista2=new Futbolista(10,"Delantero","Lionel","Messi",28);
    static Persona entrenador=new Entrenador("defensiva","Jose","Mourinho",55);
    static Persona doctor= new Doctor(20,"Medico deportivo","Josep","Tarradellas",58);
    public static void main(String[] args) {

        int opcion;
        persona.add(futbolista1);
        persona.add(futbolista2);
        persona.add(entrenador);
        persona.add(doctor);

        do{
            System.out.println("MENU");
            System.out.println("1- Viaje de equipo");
            System.out.println("2- Entrenamiento");
            System.out.println("3- Partido de fútbol");
            System.out.println("4- Planificar entrenamiento");
            System.out.println("5- Entrevista");
            System.out.println("6- Curar lesion");
            System.out.println("7- Salir");
            do {
                System.out.println("Elige una opción: ");
                opcion = scanner.nextInt();
            }while(opcion<1 || opcion>7);

            switch(opcion){

                case 1:
                    for (Persona p: persona
                         ) {
                        p.datos();
                        p.viajar();
                    }
                    break;
                case 2:
                    for (Persona p: persona
                    ) {
                        p.datos();
                        p.entrenar();
                    }
                    break;
                case 3:
                    for (Persona p: persona
                    ) {
                        p.datos();
                        p.asistirPartido();
                    }
                    break;
                case 4:
                    for (Persona p: persona
                    ) {
                        if( p instanceof Entrenador) {
                            p.datos();
                            ((Entrenador) p).planificarEntreno();
                        }
                    }
                    break;
                case 5:
                    for (Persona p: persona
                    ) {
                        if( p instanceof Futbolista) {
                            p.datos();
                            ((Futbolista) p).entrevistar();
                        }
                    }
                    break;
                case 6:
                    for (Persona p: persona
                    ) {
                        if( p instanceof Doctor) {
                            p.datos();
                            ((Doctor) p).curarLesion();
                        }
                    }
                    break;
                case 7:
                    System.out.println("VAS A SALIR DEL PROGRAMA....");
                    break;
                default:
                    System.out.println("La opción elegida no es válida");
                    break;
            }

        }while(opcion!=7);

        System.out.println("HAS SALIDO DEL PROGRAMA!!!!");

    }
}
