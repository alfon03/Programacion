package Linea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese las coordenadas del punto A:");
        System.out.print("x = ");
        double xA = sc.nextDouble();
        System.out.print("y = ");
        double yA = sc.nextDouble();
        Punto puntoA = new Punto(xA, yA);
        
        System.out.println("Ingrese las coordenadas del punto B:");
        System.out.print("x = ");
        double xB = sc.nextDouble();
        System.out.print("y = ");
        double yB = sc.nextDouble();
        Punto puntoB = new Punto(xB, yB);
        
        Linea linea = new Linea(puntoA, puntoB);
        
        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Mover línea");
            System.out.println("2. Mostrar línea");
            System.out.println("3. Salir");
            opcion = sc.nextInt();
            switch(opcion) 
            {
                case 1:
                    System.out.println("Hacia donde quiere mover la linea");
                    System.out.println("1. Abajo");
                    System.out.println("2. Izquierda");
                    System.out.println("3. Derecha");
                    System.out.println("4. Arriba");
                    int movimiento;
                    double distancia;
                    movimiento=sc.nextInt();  
                    switch (movimiento) 
                    {
	                    case 4: 
	                    	System.out.println("Que distancia quieres desplazar la linea hacia arriba");
	                    	 
	                    	distancia=sc.nextDouble();
	                    	puntoA.setY(puntoA.getY() + distancia);
	                        puntoB.setY(puntoB.getY() + distancia);
	                        break;
	                    
	                	case 1:
	                    
	                    	System.out.println("Que distancia quieres desplazar la linea hacia abajo");
	                    	
	                    	distancia=sc.nextDouble();
	                    	puntoA.setY(puntoA.getY() - distancia);
	                        puntoB.setY(puntoB.getY() - distancia);
	                    
	                    
	                        break;
	                	case 2:
	                		
	                		System.out.println("Que distancia quieres desplazar la linea hacia abajo");
	                    	
	                    	distancia=sc.nextDouble();
	                		puntoA.setX(puntoA.getX() - distancia);
	                        puntoB.setX(puntoB.getX() - distancia);
	                        
	                	case 3: 
	                		System.out.println("Que distancia quieres desplazar la linea hacia abajo");
	                    	
	                    	distancia=sc.nextDouble();
	                    	 puntoA.setX(puntoA.getX() + distancia);
	                         puntoB.setX(puntoB.getX() + distancia);
	                    	
	                    	
                    }
                case 2:
                    System.out.print("Mostrar linea");
                    
                    	puntoA.toString();
                    	puntoB.toString();
                    System.out.println("[" + puntoA.toString() + ", " + puntoB.toString() + "]");
            }
            
            
            
        }while(opcion !=3);
    }
}