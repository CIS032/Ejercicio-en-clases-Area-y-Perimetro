
package Intraclase1;

public class Triangulo extends Figura{
    
    private double ladoA;
    private double ladoB;
    private double base;
    private double altura;

    public double area (){
        double areaT = (base*altura)/2;
        return areaT;
    }
    
    public double perimetro (){
        double perimetro = ladoA+ladoB+base;
        return perimetro;
    }

    public Triangulo(double ladoA, double ladoB, double base, double altura) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.base = base;
        this.altura = altura;
    }

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    
    
}
