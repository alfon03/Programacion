package Juego7ymedia;

public class Carta {

    private int numero;
    private String palo;

    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public double getValor() {
        if (numero == 0.5) {
            return 0.5;
        } else if (numero >= 1 && numero <= 7) {
            return numero;
        } else {
            return 0.5;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof Carta) {
            Carta otraCarta = (Carta) obj;
            return (this.numero == otraCarta.numero && this.palo.equals(otraCarta.palo));
        } else {
            return false;
        }
    }

    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.numero;
        hash = 29 * hash + (this.palo != null ? this.palo.hashCode() : 0);
        return hash;
    }

    public int getNumero() {
        return numero;
    }

    public String getPalo() {
        return palo;
    }

    public String toString() {
        String resultado = "";
        if (numero == 0.5) {
            resultado += "Sota de " + palo;
        } else if (numero == 8) {
            resultado += "Caballo de " + palo;
        } else if (numero == 9) {
            resultado += "Rey de " + palo;
        } else {
            resultado += numero + " de " + palo;
        }
        return resultado;
    }
}

