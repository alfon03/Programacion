package SistemaParking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Parking {
    private static final int CAPACIDAD_MAXIMA = 50;
    private List<Vehiculo> vehiculos;

    public Parking() {
        vehiculos = new ArrayList<>();
    }

    public boolean añadirVehiculo(Vehiculo vehiculo) {
        if (vehiculos.size() < CAPACIDAD_MAXIMA) {
            vehiculos.add(vehiculo);
            return true;
        }
        return false;
    }

    public boolean eliminarVehiculo(Vehiculo vehiculo) {
        return vehiculos.remove(vehiculo);
    }

    public void mostrarVehiculosOrdenados(Comparator<Vehiculo> comparador) {
        List<Vehiculo> vehiculosOrdenados = getVehiculosOrdenados(comparador);
        for (Vehiculo v : vehiculosOrdenados) {
            System.out.println(v);
        }
    }

    private List<Vehiculo> getVehiculosOrdenados(Comparator<Vehiculo> comparador) {
        List<Vehiculo> vehiculosOrdenados = new ArrayList<>(vehiculos);
        Collections.sort(vehiculosOrdenados, comparador);
        return vehiculosOrdenados;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
}