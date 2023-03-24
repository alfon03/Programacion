package SistemaParking;

import java.util.Comparator;

public class OrdenarPorFechaEntrada implements Comparator<Vehiculo> {
    public int compare(Vehiculo v1, Vehiculo v2) {
        return v1.getFechaEntrada().compareTo(v2.getFechaEntrada());
    }

}