
package Intraclase1;

public class Rectangulo {
    
    double lado;
    double ancho;

    public double area (){
        double area = lado*ancho;
        return area;
    }
    
    public double perimetro (){
        double perimetro = (lado*2)+(ancho*2);
        return perimetro;
    }

    public Rectangulo(double lado, double ancho) {
        this.lado = lado;
        this.ancho = ancho;
    }
    
    
    
}
