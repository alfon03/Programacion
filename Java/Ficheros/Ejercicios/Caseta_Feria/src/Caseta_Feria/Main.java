package Caseta_Feria;

import java.io.IOException;

import Caseta_Feria.Reader.*;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		XMLReader xml = new XMLReader("./Fichero/casetasferia.xml");
		String menu = "--------------------------------------\n"
				+ "1. Mostrar todas las casetas existentes en una calle.\n"
				+ "2. Mostrar todas las casetas de tipo familiar.\n"
				+ "3. Mostrar todas las casetas de tipo Distrito.\n"
				+ "4. Mostrar todas las casetas que no sean ni familiares ni distritos.\n"
				+ "5. Mostrar para cada una de las calles del recinto ferial el número de casetas de tipo familiar que existen.\n"
				+ "6. Mostrar para cada una de las calles del recinto ferial el número de casetas de tipo Distrito que existen.\n"
				+ "7. Eliminar caseta.\n" 
				+ "8. Salir.\n"
				+ "--------------------------------------\n";

		int opcion = 0;
		Scanner sc = new Scanner(System.in);
		try {
			xml.exportarJson();
		} catch (IOException e) {
			e.printStackTrace();
		}

		while (opcion != 8) {
			System.out.println(menu);
			System.out.println("\nIntroduce una opción: ");
			opcion = Integer.parseInt(sc.nextLine());

			switch (opcion) {
			case 1:
				System.out.println("Introduce la calle: ");
				String calle = sc.nextLine();
				System.out.println("Casetas en la calle " + calle + ":\n");
				System.out.println(xml.obtenerCasetasEnCalle(calle));
				System.out.println();
				break;
			case 2:
				System.out.println("Casetas de tipo familiar:\n");
				System.out.println(xml.obtenerCasetasFamiliares());
				System.out.println();
				break;
			case 3:
				System.out.println("Casetas de tipo distrito:\n");
				System.out.println(xml.obtenerCasetasDistrito());
				System.out.println();
				break;
			case 4:
				System.out.println("Casetas diferentes de distrito y familiar:\n");
				System.out.println(xml.obtenerCasetasNoFamiliaresNoDistrito());
				System.out.println();
				break;
			case 5:
				System.out.println("Calles con casetas de tipo familiar:\n");
				System.out.println(xml.callesConCasetasFamiliares());
				System.out.println();
				break;
			case 6:
				System.out.println("Calles con casetas de tipo distrito:\n");
				System.out.println(xml.callesConCasetasDistrito());
				System.out.println();
				break;
			case 7:
				System.out.println("Introduce la calle: ");
				String calleEliminar = sc.nextLine();
				System.out.println("Introduce el número de caseta: ");
				String numeroCaseta = sc.nextLine();
				System.out.println();
				try {
					xml.eliminarCaseta(calleEliminar, numeroCaseta);
					System.out.println("La caseta fue eliminada correctamente.\n");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 8:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opción inválida. Introduce un número válido.\n");
			}
		}

		sc.close();
	}
}
