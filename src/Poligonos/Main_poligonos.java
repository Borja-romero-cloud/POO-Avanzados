package Poligonos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_poligonos {

    public static void main(String[] args) {

        List<Poligono> poligonos=new ArrayList<>();
        int opcion;
        int base;
        int lado2;
        int lado3;
        int altura;
        int lado_mayor;
        int lado_menor;
        Scanner scanner= new Scanner(System.in);

        //Creo los polígonos y los alado a la lista.
        do {
            System.out.println("Qué operación deseas realizar? 1- Crear Triángulo, 2-Crear Rectángulo o 3-Salir");
            opcion=scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Cuánto mide la base del triángulo?: ");
                    base=scanner.nextInt();
                    System.out.println("Cuánto mide el lado 2 del triángulo?: ");
                    lado2=scanner.nextInt();
                    System.out.println("Cuánto mide el lado 3 del triángulo?: ");
                    lado3=scanner.nextInt();
                    System.out.println("Cuánto mide la altura del triángulo?: ");
                    altura=scanner.nextInt();

                    Triangulo miTriangulo= new Triangulo(base,lado2,lado3,altura);
                    poligonos.add(miTriangulo);
                    break;

                case 2:
                    System.out.println("Cuánto mide el lado mayor del rectángulo?: ");
                    lado_mayor=scanner.nextInt();
                    System.out.println("Cuánto mide el lado menor del rectángulo?: ");
                    lado_menor=scanner.nextInt();

                    Rectangulo miRectangulo= new Rectangulo(lado_mayor,lado_menor);
                    poligonos.add(miRectangulo);
            }

        }while(opcion!=3);

        //Recorro todos los polígonos creados y obtengo su área y valores de los lados.

        for (Poligono p: poligonos
             ) {
            p.datosLados();
            p.calcularArea();

        }
    }
}
