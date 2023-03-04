package Jarra;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la capacidad de la jarra A: ");
        int capacidadA = scanner.nextInt();
        Jarra jarraA = new Jarra(capacidadA);
        System.out.print("Introduce la capacidad de la jarra B: ");
        int capacidadB = scanner.nextInt();
        Jarra jarraB = new Jarra(capacidadB);

        int opcion = 0;
        do {
            System.out.println("\n-- MENÚ --");
            System.out.println("1. Llenar jarra");
            System.out.println("2. Vaciar jarra");
            System.out.println("3. Volcar jarra A en B");
            System.out.println("4. Volcar jarra B en A");
            System.out.println("5. Ver estado de las jarras");
            System.out.println("6. Salir");
            System.out.print("\nElige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("¿Qué jarra desea llenar (A/B)? ");
                    String opcionLlenar = scanner.next();
                    if (opcionLlenar.equalsIgnoreCase("A")) {
                        jarraA.llenar();
                        System.out.println("La jarra A ha sido llenada.");
                    } else if (opcionLlenar.equalsIgnoreCase("B")) {
                        jarraB.llenar();
                        System.out.println("La jarra B ha sido llenada.");
                    } else {
                        System.out.println("Opción no válida.");
                    }
                    break;
                case 2:
                    System.out.print("¿Qué jarra desea vaciar (A/B)? ");
                    String opcionVaciar = scanner.next();
                    if (opcionVaciar.equalsIgnoreCase("A")) {
                        jarraA.vaciar();
                        System.out.println("La jarra A ha sido vaciada.");
                    } else if (opcionVaciar.equalsIgnoreCase("B")) {
                        jarraB.vaciar();
                        System.out.println("La jarra B ha sido vaciada.");
                    } else {
                        System.out.println("Opción no válida.");
                    }
                    break;
                case 3:
                    jarraA.volcarEn(jarraB);
                    System.out.println("Se ha volcado la jarra A en la B");
                    break;
                    
                case 4:
                	
                	 jarraB.volcarEn(jarraA);
                     System.out.println("Se ha volcado la jarra B en la A");
                     break;
                case 5:
                	System.out.println("El estado de la jarra A es: "+jarraA.getCantidad() );
                	System.out.println("Y el estado de la jarra B es: "+jarraB.getCantidad() );
                	break;
            }
            
        }while (opcion != 6);
    }
}
