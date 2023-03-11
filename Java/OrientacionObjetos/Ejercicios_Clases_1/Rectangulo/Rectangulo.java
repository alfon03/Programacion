package Rectangulo;

public class Rectangulo {
    private double longitud;
    private double ancho;
    
    public Rectangulo() {
        this.longitud = 1.0;
        this.ancho = 1.0;
    }
    
    public Rectangulo(double longitud, double ancho) {
        setLongitud(longitud);
        setAncho(ancho);
    }
    
    public double getLongitud() {
        return this.longitud;
    }
    
    public void setLongitud(double longitud) {
        if (longitud > 0 && longitud < 20) {
            this.longitud = longitud;
        } else {
            System.out.println("Error: longitud debe ser un número real mayor que cero y menor que 20");
        }
    }
    
    public double getAncho() {
        return this.ancho;
    }
    
    public void setAncho(double ancho) {
        if (ancho > 0 && ancho < 20) {
            this.ancho = ancho;
        } else {
            System.out.println("Error: ancho debe ser un número real mayor que cero y menor que 20");
        }
    }
    
    public double calcularPerimetro() {
        return 2 * (this.longitud + this.ancho);
    }
    
    public double calcularArea() {
        return this.longitud * this.ancho;
    }
}