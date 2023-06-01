public class Cuenta {

    private int numero_cuenta;
    private double saldo=0;

    public Cuenta(int numero_cuenta, double saldo){
        this.numero_cuenta=numero_cuenta;
        this.saldo=saldo;
    }

    public int getNumero_cuenta(){
        return numero_cuenta;
    }
    public double getsaldo(){
        return saldo;
    }

    public void ingresarDinero(double cantidad){
        saldo+=cantidad;

    }
    public void retirarDinero(double cantidad){
        saldo-=cantidad;

    }
}
