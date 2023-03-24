package SistemaParking;

import java.util.Comparator;

public class OrdenarPorTipoYCombustible implements Comparator<Vehiculo> {
    public int compare(Vehiculo v1, Vehiculo v2) {
        int tipoComp = v1.getTipoVehiculo().compareTo(v2.getTipoVehiculo());
        if (tipoComp != 0) {
            return tipoComp;
        }
        return v1.getCombustible().compareTo(v2.getCombustible());
    }
}