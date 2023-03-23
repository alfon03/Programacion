package Juego7ymedia;

import java.util.Scanner;

public class Juego7ymedia {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Baraja baraja = new Baraja();
        baraja.barajar();

        double totalJugador = 0;
        double totalBanca = 0;
        boolean seguirJugando = true;
        System.out.println("\n---- 7 y Media ----");
    	System.out.println(" ");
    	System.out.println("Bienvenido a la app para jugar al juego 7 y media");

        while (seguirJugando) {
     
            System.out.println("¿Desea pedir carta? (si/no)");
            String respuesta = scanner.nextLine();

            if (respuesta.equals("si")) {
                Carta carta = baraja.getSiguiente();
                System.out.println("Carta obtenida: " + carta);
                totalJugador += carta.getValor();
                System.out.println("Total jugador: " + totalJugador);
            } else {
                seguirJugando = false;
            }

            if (totalJugador > 7.5) {
                System.out.println("Has perdido.");
                return;
            }
        }

        while (totalBanca < 7 && totalBanca < totalJugador) {
            Carta carta = baraja.getSiguiente();
            System.out.println("Carta obtenida por la banca: " + carta);
            totalBanca += carta.getValor();
        }

        System.out.println("Total jugador: " + totalJugador);
        System.out.println("Total banca: " + totalBanca);

        if (totalBanca > 7.5 || totalJugador > totalBanca) {
            System.out.println("Has ganado.");
        } else if (totalJugador == totalBanca) {
            System.out.println("Empate.");
        } else {
            System.out.println("Has perdido.");
        }
    }
}
