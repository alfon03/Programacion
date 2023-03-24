package SistemaParking;

import java.util.Comparator;

public class OrdenarPorMatricula implements Comparator<Vehiculo> {
    public int compare(Vehiculo v1, Vehiculo v2) {
        return v1.getMatricula().compareTo(v2.getMatricula());
    }
}