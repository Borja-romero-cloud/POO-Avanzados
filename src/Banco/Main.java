package Banco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcion;
        int numero_cuentas;
        int numero_cuenta;
        double saldo;
        int cuenta_usuario;
        double cantidad;
        List<Cuenta> cuentas=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduzca el número de cuentas que tiene el cliente:  ");
        numero_cuentas=scanner.nextInt();
        for (int i = 1; i <= numero_cuentas; i++) {
            System.out.println("INTRODUCE EL NÚMERO DE CUENTA: ");
            numero_cuenta=scanner.nextInt();
            System.out.println("INTRODUCE EL SALDO QUE TENDRA LA CUENTA "+numero_cuenta);
            saldo=scanner.nextDouble();
            Cuenta cuenta=new Cuenta(numero_cuenta,saldo);
            cuentas.add(cuenta);
        }

        //Imprimo para comprobar que se han creado y agregado correctamente las cuentas

        for (Cuenta c: cuentas
             ) {
            System.out.println(c.getNumero_cuenta());

        }


        Cliente c1 = new Cliente("Borja", "3450G", cuentas);



        do {
            System.out.println("ELIGE UNA OPCIÓN: ");
            System.out.println("1- CONSULTAR SALDO");
            System.out.println("2- INGRESAR DINERO");
            System.out.println("3- RETIRAR DINERO");
            System.out.println("4- SALIR");
            opcion=scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Introduzca la cuenta que consultar: ");
                    cuenta_usuario=scanner.nextInt();
                    c1.consultarSaldo(cuenta_usuario);
                    break;
                case 2:
                    System.out.println("Introduzca la cuenta que consultar: ");
                    cuenta_usuario=scanner.nextInt();
                    System.out.println("Ingrese la cantidad a introducir: ");
                    cantidad=scanner.nextDouble();
                    c1.ingresarSaldo(cuenta_usuario,cantidad);
                    break;
                case 3:
                    System.out.println("Introduzca la cuenta que consultar: ");
                    cuenta_usuario=scanner.nextInt();
                    System.out.println("Ingrese la cantidad a retirar: ");
                    cantidad=scanner.nextDouble();
                    c1.retirarSaldo(cuenta_usuario,cantidad);
                    break;
                case 4:
                    System.out.println("SALIENDO DEL PROGRAMA....");
                    break;


            }


        }while(opcion!=4);
        System.out.println("HAS SALIDO DEL PROGRAMA");
    }
}