package Ejercicio_5_carta_array;


import java.util.Random;

public class Carta {
    private String palo;
    private int numero;

    public Carta(String palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public int getNumero() {
        return numero;
    }

    public static Carta generarCartaAleatoria() {
        Random rand = new Random();
        String[] palos = {"oros", "copas", "espadas", "bastos"};
        String palo = palos[rand.nextInt(palos.length)];
        int numero = rand.nextInt(12) + 1;
        return new Carta(palo, numero);
    }

    public boolean esIgual(Carta otraCarta) {
        return this.palo.equals(otraCarta.getPalo()) && this.numero == otraCarta.getNumero();
    }

    public String toString() {
        return numero + " de " + palo;
    }
}