package SistemaParking;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Parking parking = new Parking();

        Vehiculo vehiculo1 = new Vehiculo("Seat", "Ibiza", "1234ABC", "Gasolina", new Date(), TipoVehiculo.AUTOMOVIL);
        Vehiculo vehiculo2 = new Vehiculo("Renault", "Clio", "5678DEF", "Gasolina", new Date(), TipoVehiculo.AUTOMOVIL);
        Vehiculo vehiculo3 = new Vehiculo("Yamaha", "Jog", "9012GHI", "Gasolina", new Date(), TipoVehiculo.CICLOMOTOR);
        Vehiculo vehiculo4 = new Vehiculo("Mercedes-Benz", "Sprinter", "3456JKL", "Gasoil", new Date(), TipoVehiculo.TRANSPORTE_MERCANCIAS);
        
        parking.añadirVehiculo(vehiculo1);
        parking.añadirVehiculo(vehiculo2);
        parking.añadirVehiculo(vehiculo3);
        parking.añadirVehiculo(vehiculo4);
        
        System.out.println();
        System.out.println("Vehículos ordenados por fecha de entrada:");
        System.out.println();
        parking.mostrarVehiculosOrdenados(new OrdenarPorFechaEntrada());
        System.out.println();
        System.out.println();

        System.out.println("Vehículos ordenados por marca y modelo:");
        System.out.println();
        parking.mostrarVehiculosOrdenados(new OrdenarPorMarcaYModelo());
        System.out.println();
        System.out.println();

        System.out.println("Vehículos ordenados por tipo y combustible:");
        System.out.println();
        parking.mostrarVehiculosOrdenados(new OrdenarPorTipoYCombustible());
        System.out.println();
        System.out.println();

        System.out.println("Vehículos ordenados por matrícula:");
        System.out.println();
        parking.mostrarVehiculosOrdenados(new OrdenarPorMatricula());
        System.out.println();
        System.out.println();
    }
}