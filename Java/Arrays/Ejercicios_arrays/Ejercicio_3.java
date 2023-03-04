package Arrays;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] contadores = new int[10];
        int cantidadNumeros = 0;
        int sumaNumeros = 0;
        
        while (true) {
            System.out.print("Introduce un número entre 1 y 1000 (o escribe 'fin' para terminar): ");
            String entrada = scanner.nextLine();
            
            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }
            
            int numero = Integer.parseInt(entrada);
            if (numero < 1 || numero > 1000) {
                System.out.println("El número debe estar entre 1 y 1000.");
                continue;
            }
            
            cantidadNumeros++;
            sumaNumeros += numero;
            contadores[numero % 10]++;
        }
        
        double mediaNumeros = (double) sumaNumeros / cantidadNumeros;
        System.out.println("La media de los números es: " + mediaNumeros);
        
        int maximoContador = 0;
        int digitoMaximoContador = -1;
        boolean[] digitosConContador = new boolean[10];
        for (int i = 0; i < contadores.length; i++) {
            if (contadores[i] > 0) {
                digitosConContador[i] = true;
                if (contadores[i] > maximoContador) {
                    maximoContador = contadores[i];
                    digitoMaximoContador = i;
                }
            }
        }
        
        System.out.println("Cuántos números terminan en cada uno de los dígitos:");
        for (int i = 0; i < contadores.length; i++) {
            System.out.println(i + ": " + contadores[i]);
        }
        
        if (digitoMaximoContador != -1) {
            System.out.println("El dígito en el que más números terminan es: " + digitoMaximoContador);
        } else {
            System.out.println("No hay dígitos en los que terminen números.");
        }
        
        System.out.print("En qué dígitos no ha terminado ningún número: ");
        boolean primero = true;
        for (int i = 0; i < digitosConContador.length; i++) {
            if (!digitosConContador[i]) {
                if (!primero) {
                    System.out.print(", ");
                }
                System.out.print(i);
                primero = false;
            }
        }
        System.out.println(".");
    }
}