package Sucursal2;

public class Paquete {

    private int numero_referencia;
    private int peso;
    private String prioridad;
    private String dni;

    public Paquete( int numero_referencia,int peso, String prioridad, String dni){
        this.peso = peso;
        this.prioridad = prioridad;
        this.numero_referencia = numero_referencia;
        this.dni=dni;

    }

    public String mostrarDatosPaquetes(){
        return "Número de referencia: "+numero_referencia+" Peso: "+peso+" Prioridad: "+prioridad+" DNI: "+dni;
    }

    public int getPeso() {
        return peso;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public int getNumero_referencia() {
        return numero_referencia;
    }

    public String getDni() {
        return dni;
    }

    public void  precio(int peso, String prioridad){

        int precio_paquete=0;
        if(prioridad.equals("Express")){
            precio_paquete=20+peso;

        }else if (prioridad.equals("Alta")) {
            precio_paquete=10+peso;
        }else if (prioridad.equals("Baja")){
            precio_paquete=peso;
        }

        System.out.println("El precio del paquete es de: "+precio_paquete);
    }
}
