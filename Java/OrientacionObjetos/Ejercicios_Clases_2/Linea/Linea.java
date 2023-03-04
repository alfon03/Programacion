package Linea;

import java.util.Scanner;

class Punto {
    private double x;
    private double y;
    
    public Punto() {
        this.x = 0;
        this.y = 0;
    }
    
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public void setX(double x) {
        this.x = x;
    }
    
    public void setY(double y) {
        this.y = y;
    }
    
 
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

class Linea {
    private Punto puntoA;
    private Punto puntoB;
    
    public Linea() {
        this.puntoA = new Punto();
        this.puntoB = new Punto();
    }
    
    public Linea(Punto puntoA, Punto puntoB) {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
    }
    
    public Punto getPuntoA() {
        return puntoA;
    }
    
    public Punto getPuntoB() {
        return puntoB;
    }
    
    public void setPuntoA(Punto puntoA) {
        this.puntoA = puntoA;
    }
    
    public void setPuntoB(Punto puntoB) {
        this.puntoB = puntoB;
    }
    
    public void moverDerecha(double distancia) {
        puntoA.setX(puntoA.getX() + distancia);
        puntoB.setX(puntoB.getX() + distancia);
    }
    
    public void moverIzquierda(double distancia) {
        puntoA.setX(puntoA.getX() - distancia);
        puntoB.setX(puntoB.getX() - distancia);
    }
    
    public void moverArriba(double distancia) {
        puntoA.setY(puntoA.getY() + distancia);
        puntoB.setY(puntoB.getY() + distancia);
    }
    
    public void moverAbajo(double distancia) {
        puntoA.setY(puntoA.getY() - distancia);
        puntoB.setY(puntoB.getY() - distancia);
    }
    
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        
        if (!(obj instanceof Linea)) {
            return false;
        }
        
        Linea linea = (Linea) obj;
        return puntoA.equals(linea.puntoA) && puntoB.equals(linea.puntoB);
    }
    
 
    public String toString() {
        return "[" + puntoA.toString() + "," + puntoB.toString() + "]";
    }
}
