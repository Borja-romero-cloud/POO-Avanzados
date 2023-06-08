package Poligonos;

public class Rectangulo extends Poligono {

    private int lado_mayor;
    private int lado_menor;

    public Rectangulo(int lado_mayor, int lado_menor){
        this.lado_mayor=lado_mayor;
        this.lado_menor=lado_menor;
    }

    @Override
    public void calcularArea() {
        System.out.println("El área del rectángulo es de "+this.lado_mayor*this.lado_menor);
    }

    @Override
    public void datosLados() {
        System.out.println("El lado mayor del rectángulo es de "+this.lado_mayor+" El lado menor del triángulo es de "+this.lado_menor);
    }
}
