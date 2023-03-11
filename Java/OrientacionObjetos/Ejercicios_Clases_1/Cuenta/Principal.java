package Cuenta;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        Cuenta cuenta = new Cuenta(saldoInicial);

        int opcion;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Hacer un reintegro");
            System.out.println("2. Hacer un ingreso");
            System.out.println("3. Consultar el saldo y el número de reintegros e ingresos realizados");
            System.out.println("4. Finalizar las operaciones");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double cantidadReintegro = scanner.nextDouble();
                    cuenta.hacerReintegro(cantidadReintegro);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a ingresar: ");
                    double cantidadIngreso = scanner.nextDouble();
                    cuenta.hacerIngreso(cantidadIngreso);
                    break;
                case 3:
                    cuenta.consultarSaldo();
                    break;
                case 4:
                    System.out.print("¿Está seguro de que desea salir? (S/N): ");
                    String respuesta = scanner.next();
                    if (respuesta.equalsIgnoreCase("S")) {
                        System.out.println("Saldo final: " + cuenta.getSaldo());
                    } else {
                        opcion = 0;
                    }
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 4);
    }
}