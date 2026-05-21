package geometria;

public class Geometria {
    public static void main(String[] args) {
        Circulo miCirculo = new Circulo(5);
        Rectangulo miRectangulo = new Rectangulo(4, 5);
        
        Figura figura1 = miCirculo;
        Figura figura3 = miRectangulo;

        System.out.println("Área del círculo: " + figura1.calcularArea());
        System.out.println("Perímetro del círculo: " + figura1.calcularPerimetro());

        System.out.println("Área rectangulo: " + figura3.calcularArea());
        System.out.println("Perimetro rectangulo: " + figura3.calcularPerimetro());                
    }
}
