package Cuenta;

import java.util.Scanner;

public class Cuenta {
    private double saldo;
    private int numReintegros;
    private int numIngresos;

    public Cuenta(double saldo) {
        this.saldo = saldo;
        this.numReintegros = 0;
        this.numIngresos = 0;
    }

    public void hacerReintegro(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            numReintegros++;
            System.out.println("Reintegro realizado correctamente");
        } else {
            System.out.println("Error: la cantidad a retirar debe ser mayor que cero y menor o igual que el saldo disponible");
        }
    }

    public void hacerIngreso(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            numIngresos++;
            System.out.println("Ingreso realizado correctamente");
        } else {
            System.out.println("Error: la cantidad a ingresar debe ser mayor que cero");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo actual: " + saldo);
        System.out.println("Número de reintegros realizados: " + numReintegros);
        System.out.println("Número de ingresos realizados: " + numIngresos);
    }

	public double getSaldo() {
		
		return saldo;
	}
}
