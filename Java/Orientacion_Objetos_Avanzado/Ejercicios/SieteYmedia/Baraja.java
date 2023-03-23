package Juego7ymedia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {

    private List<Carta> cartas;
    private int siguiente;

    public Baraja() {
        this.cartas = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 10; j++) {
                String palo = generaPalo(i);
                int valor = generaValor(j);
                Carta carta = new Carta(valor, palo);
                cartas.add(carta);
            }
        }
        siguiente = 0;
    }

    private String generaPalo(int i) {
        String[] palos = {"Oros", "Copas", "Espadas", "Bastos"};
        return palos[i];
    }

    private int generaValor(int j) {
        if (j <= 7) {
            return j;
        } else {
            return (int) 0.5;
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
        siguiente = 0;
    }

    public Carta getSiguiente() {
        Carta carta = cartas.get(siguiente);
        siguiente++;
        return carta;
    }

    public String toString() {
        String resultado = "";
        for (Carta carta : cartas) {
            resultado += carta.toString() + "\n";
        }
        return resultado;
    }
}

