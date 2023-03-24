package SistemaParking;

import java.util.Comparator;

public class OrdenarPorMarcaYModelo implements Comparator<Vehiculo> {
    public int compare(Vehiculo v1, Vehiculo v2) {
        int marcaComp = v1.getMarca().compareTo(v2.getMarca());
        if (marcaComp != 0) {
            return marcaComp;
        }
        return v1.getModelo().compareTo(v2.getModelo());
    }
}
