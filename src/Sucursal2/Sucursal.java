package Sucursal2;

import java.util.List;

public class Sucursal {

    private int numero_sucursal;
    private String direccion;
    private String ciudad;
    private List<Paquete> paquetes;

    public Sucursal(int numero_sucursal, String direccion, String ciudad,List<Paquete> paquetes) {
        this.numero_sucursal = numero_sucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.paquetes=paquetes;

    }

    public int getnumeroSucursal() {
        return numero_sucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public List getPaquetes() {
        return paquetes;
    }

    public String mostrarDatosSucursal(){
        return "Número de sucursal: "+numero_sucursal+" Dirección: "+direccion+" Ciudad: "+ciudad;
    }

    public void calcularprecio(int ref) {
        boolean encontrado=false;
        for (Paquete n : paquetes
        ) {
            if (ref == n.getNumero_referencia()) {
                System.out.println("El paquete "+ ref+" se encuentra en la sucursal " + numero_sucursal);
                n.precio(n.getPeso(),n.getPrioridad());
                encontrado = true;
                break;

            }
        }
        if(encontrado==false){
            System.out.println("El paquete "+ref+ " no existe en la sucursal "+numero_sucursal);
        }

    }



}
