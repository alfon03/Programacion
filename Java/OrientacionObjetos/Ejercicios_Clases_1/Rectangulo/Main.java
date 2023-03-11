package Rectangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la longitud del rectángulo: ");
        double longitud = scanner.nextDouble();
        
        System.out.print("Ingrese el ancho del rectángulo: ");
        double ancho = scanner.nextDouble();
        
        Rectangulo rectangulo = new Rectangulo(longitud, ancho);
        
        double perimetro = rectangulo.calcularPerimetro();
        double area = rectangulo.calcularArea();
        
        System.out.println("El perímetro del rectángulo es: " + perimetro);
        System.out.println("El área del rectángulo es: " + area);
    }
}