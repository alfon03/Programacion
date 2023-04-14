package Gran_Almacen;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Caja> cajas = new ArrayList<Caja>();
		for (int i = 1; i <= 20; i++) {
			cajas.add(new Caja(i));
		}
		int opcion = 0;
		do {
			System.out.println("MENU DE ACCIONES");
			System.out.println("1. Abrir caja");
			System.out.println("2. Cerrar caja");
			System.out.println("3. Nuevo cliente");
			System.out.println("4. Atender cliente");
			System.out.println("5. Salir");
			System.out.print("Seleccione una opción: ");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.print("Ingrese número de caja: ");
				int numCaja = sc.nextInt();
				boolean abierta = cajas.get(numCaja - 1).abrir();
				if (abierta) {
					System.out.println("La caja " + numCaja + " ha sido abierta.");
				} else {
					System.out.println("La caja " + numCaja + " ya está abierta.");
				}
				break;
			case 2:
				System.out.print("Ingrese número de caja: ");
				numCaja = sc.nextInt();
				boolean cerrada = cajas.get(numCaja - 1).cerrar();
				if (cerrada) {
					System.out.println("La caja " + numCaja + " ha sido cerrada.");
				} else {
					System.out.println("No se pudo cerrar la caja " + numCaja + ".");
				}
				break;
			case 3:
				int numCliente = Cliente.generarNumero();
				Caja cajaMenosClientes = cajas.get(0);
				for (int i = 1; i < cajas.size(); i++) {
					if (cajas.get(i).getNumClientesEnEspera() < cajaMenosClientes.getNumClientesEnEspera()) {
						cajaMenosClientes = cajas.get(i);
					} else if (cajas.get(i).getNumClientesEnEspera() == cajaMenosClientes.getNumClientesEnEspera()
							&& cajas.get(i).getNumero() < cajaMenosClientes.getNumero()) {
						cajaMenosClientes = cajas.get(i);
					}
				}
				cajaMenosClientes.agregarCliente(new Cliente(numCliente));
				System.out.println("Es usted el cliente número " + numCliente + " y debe ir a la caja número "
						+ cajaMenosClientes.getNumero() + ".");
				break;
			case 4:
				System.out.print("Ingrese número de caja: ");
				numCaja = sc.nextInt();
				Caja caja = cajas.get(numCaja - 1);
				if (caja.estaAbierta() && caja.getNumClientesEnEspera() > 0) {
					Cliente cliente = caja.atenderCliente();
					System.out.println("Se ha atendido al cliente con número " + cliente.getNumero() + ".");
				} else if (!caja.estaAbierta()) {
					System.out.println("La caja " + numCaja + " está cerrada.");
				} else {
					System.out.println("No hay clientes en espera en la caja " + numCaja + ".");
				}
				break;
			case 5:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción inválida.");
				break;
			}
			System.out.println();
		} while (opcion != 5);
	}
}