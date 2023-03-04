package Jarra;

public class Jarra {
    private int capacidad;
    private int cantidad;
    private static int totalAguaConsumida = 0;

    public Jarra(int capacidad) {
        this.capacidad = capacidad;
        this.cantidad = 0;
    }

    public void llenar() {
        totalAguaConsumida += (capacidad - cantidad);
        cantidad = capacidad;
    }

    public void vaciar() {
        cantidad = 0;
    }

    public void volcarEn(Jarra otraJarra) {
        int espacioLibre = otraJarra.capacidad - otraJarra.cantidad;
        if (cantidad <= espacioLibre) {
            otraJarra.cantidad += cantidad;
            cantidad = 0;
        } else {
            otraJarra.cantidad = otraJarra.capacidad;
            cantidad -= espacioLibre;
        }
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public static int getTotalAguaConsumida() {
        return totalAguaConsumida;
    }
}
