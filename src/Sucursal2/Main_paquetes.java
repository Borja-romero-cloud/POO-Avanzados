package Sucursal2;

import Banco.Cuenta;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_paquetes {

    public static void main(String[] args) {

        int numero_paquetes;
        int numero_referencia;
        int peso;
        String prioridad;
        String dni;
        List<Paquete> paquetes=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduzca el número de paquetes que tiene la sucursal:  ");
        numero_paquetes=scanner.nextInt();
        for (int i = 1; i <= numero_paquetes; i++) {
            System.out.println("INTRODUCE EL NÚMERO DE REFERENCIA DEL PAQUETE: "+i);
            numero_referencia=scanner.nextInt();
            scanner.nextLine();
            System.out.println("INTRODUCE EL PESO DEL PAQUETE "+numero_referencia);
            peso=scanner.nextInt();
            scanner.nextLine();
            System.out.println("INTRODUCE LA PRIORIDAD DEL PAQUETE "+numero_referencia);
            prioridad=scanner.nextLine();
            System.out.println("INTRODUCE EL DNI DE LA PERSONA QUE ENVIA EL PAQUETE "+numero_referencia);
            dni=scanner.nextLine();
            Paquete paquete=new Paquete(numero_referencia,peso,prioridad,dni);
            paquetes.add(paquete);
        }
        Sucursal sucursal1= new Sucursal(1,"Avinguda Diagonal","Barcelona",paquetes);


            System.out.println("Introduce el número de referencia de paquete que quieres enviar para saber su coste: ");
            numero_referencia = scanner.nextInt();
            sucursal1.calcularprecio(numero_referencia);


    }
}
