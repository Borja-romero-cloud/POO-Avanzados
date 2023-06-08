package Poligonos;

public class Triangulo extends Poligono{
    private int base;
    private int lado2;
    private int lado3;
    private int altura;

    public Triangulo(int base, int lado2, int lado3, int altura){
        this.base=base;
        this.lado2=lado2;
        this.lado3=lado3;
        this.altura=altura;
    }


    @Override
    public void calcularArea() {
        System.out.println("El área del triángulo es de "+(this.base*this.altura)/2);
    }

    @Override
    public void datosLados() {
        System.out.println("La base del triángulo es de "+this.base+" El lado 2 del triángulo es de "+this.lado2 +" El lado 3 del triángulo es de "+this.lado3);
    }
}
