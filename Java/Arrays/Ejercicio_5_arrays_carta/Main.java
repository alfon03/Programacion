package Ejercicio_5_carta_array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántas cartas reparto?: ");
        int numCartas = scanner.nextInt();

        Carta[] jugador1 = new Carta[numCartas];
        Carta[] jugador2 = new Carta[numCartas];
        int cartasRepartidas = 0;

        while (cartasRepartidas < numCartas) {
            Carta nuevaCarta = Carta.generarCartaAleatoria();
            boolean repetida = false;

            for (int i = 0; i < cartasRepartidas; i++) {
                if (nuevaCarta.esIgual(jugador1[i]) || nuevaCarta.esIgual(jugador2[i])) {
                    repetida = true;
                    break;
                }
            }

            if (!repetida) {
                jugador1[cartasRepartidas] = nuevaCarta;
                nuevaCarta = Carta.generarCartaAleatoria();
                jugador2[cartasRepartidas] = nuevaCarta;
                cartasRepartidas++;
            }
        }

        System.out.println("Cartas del jugador 1:");
        for (int i = 0; i < numCartas; i++) {
            System.out.println(jugador1[i].toString());
        }

        System.out.println("Cartas del jugador 2:");
        for (int i = 0; i < numCartas; i++) {
            System.out.println(jugador2[i].toString());
        }
    }
}