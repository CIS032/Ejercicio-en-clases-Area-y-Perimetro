
package Intraclase1;


public class ProgramaFigura {
    
    public static void main(String[] args) {
        
        double base = 13.27;
        double altura = 4.32;
        double ladoA = 5;
        double ladoB = 3.35;
        
        Triangulo T = new Triangulo(base,altura, ladoA, ladoB);
        
        double a = T.area();
        System.out.println("El area es: "+a);
        
        double p = T.perimetro();
        System.out.println("El perimetro es: "+p);
//------------------------------------------------------------------------------        
        
        double radio = 5.25;
        
        Circulo C1 = new Circulo(radio);
        double b = C1.area();
        System.out.println("El area del circulo es: "+b);        
        double c = C1.perimetro();
        System.out.println("El perimetro del circulo es: "+c);
        
        double radio2 = 7.38;
        Circulo C2 = new Circulo(radio2);
        double c2 = C2.area();
//------------------------------------------------------------------------------

        double largo = 13.27;
        double ancho = 4.32;
        Rectangulo R = new Rectangulo (largo, ancho);
        
        double d = R.area();
        System.out.println("El area del rectangulo es: "+d);
        
        double e = R.perimetro();
        System.out.println("El perimetro del rectangulo es: "+e);
 
//------------------------------------------------------------------------------

        System.out.println("\n\nSolucion del ejecicio planteado en clase\n");
        System.out.println("El area del circulo 1 es: "+b); 
        System.out.println("El area del circulo 2 es: "+c2); 
        System.out.println("El area del rectangulo es: "+d);
        double resultado = d+b+c2;
        System.out.println("El total es: "+resultado);
    }
    
}
