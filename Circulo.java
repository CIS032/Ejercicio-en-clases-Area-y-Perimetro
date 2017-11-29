
package Intraclase1;

public class Circulo extends Figura{

    private double radio;
    
    public double area () {
    
        double area = Math.PI*Math.pow(radio, 2);
        return area;
    }
    
    public double perimetro () {
    
        double perimetro = 2*(Math.PI*radio);
        return perimetro;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    
}
