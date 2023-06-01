import java.util.List;

public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;
    private List<Cuenta> cuentas;

    public Cliente(String nombre, String dni, List<Cuenta> cuentas) {
        this.nombre = nombre;
        this.cuentas = cuentas;
        this.dni = dni;

    }

    public String getnombre() {
        return nombre;
    }

    public String getapellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public void consultarSaldo(int n) {
        boolean encontrado = false;
        for (Cuenta c : cuentas
        ) {
            if (n == c.getNumero_cuenta()) {
                System.out.println("El usuario tiene en la cuenta " + n + " " + c.getsaldo() + "€");
                encontrado = true;
                break;

            }
        }
        if (encontrado == false) {
            System.out.println("La cuenta introducida no existe!!");
        }


    }


    public void ingresarSaldo(int n, double cantidad) {
        boolean encontrado = false;
        for (Cuenta c : cuentas
        ) {
            if (n == c.getNumero_cuenta()) {
                c.ingresarDinero(cantidad);
                encontrado = true;
                break;
            }
        }
        if (encontrado == false) {
            System.out.println("La cuenta introducida no existe!!");
        }


    }

    public void retirarSaldo(int n, double cantidad) {
        boolean encontrado = false;
        for (Cuenta c : cuentas
        ) {
            if (n == c.getNumero_cuenta()) {
                if (c.getsaldo() < cantidad) {
                    System.out.println("No dispones de saldo suficiente, tienes " + c.getsaldo() + " y pretendes sacar " + cantidad);
                    encontrado=true;
                    break;
                } else {
                    c.retirarDinero(cantidad);
                    encontrado = true;
                    break;
                }
            }
        }
        if (encontrado == false) {
            System.out.println("La cuenta introducida no existe!!");
        }




    }
}
