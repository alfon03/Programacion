package AmpliacionEquiposDeportivos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Equipo<Jugador> equipo = new Equipo<>();
		int opcion;

		do {
			System.out.println("\n---- MENU PRINCIPAL ----");
			System.out.println("1. Añadir jugador al equipo");
			System.out.println("2. Listado de jugadores masculinos mayores de edad");
			System.out.println("3. Comprobar si el equipo es exclusivamente femenino");
			System.out.println("4. Número de jugadoras mayores de edad");
			System.out.println("5. Edad mayor de entre todas las jugadoras mayores de edad");
			System.out.println("6. Set de DNI de jugadores masculinos menores de edad");
			System.out.println("7. Lista de nombres de jugadoras ordenados ascendentemente");
			System.out.println("8. Comprobar si existe alguna jugadora mayor de edad");
			System.out.println("9. Contar ciudades diferentes entre los jugadores del equipo");
			System.out.println("0. Salir");
			System.out.print("\nIntroduce una opción: ");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				System.out.print("Introduce el nombre del jugador: ");
				sc.nextLine(); // Limpia el buffer
				String nombre = sc.nextLine();
				System.out.print("Introduce el DNI del jugador: ");
				String dni = sc.nextLine();
				System.out.print("Introduce la edad del jugador: ");
				int edad = sc.nextInt();
				System.out.print("Introduce el sexo del jugador (H/M): ");
				char sexo = sc.next().charAt(0);
				System.out.print("Introduce la ciudad del jugador: ");
				sc.nextLine(); // Limpia el buffer
				String ciudad = sc.nextLine();
				Jugador jugador = new Jugador(nombre, dni, edad, sexo, ciudad);
				equipo.agregarJugador(jugador);
				break;
			case 2:
				System.out.println("Listado de jugadores masculinos mayores de edad ordenado por edad:");
				equipo.jugadoresMasculinosMayoresEdadOrdenadosPorEdad().forEach(System.out::println);
				break;
			case 3:
				if (equipo.esExclusivamenteFemenino()) {
					System.out.println("El equipo es exclusivamente femenino.");
				} else {
					System.out.println("El equipo no es exclusivamente femenino.");
				}
				break;
			case 4:
				System.out.println("Número de jugadoras mayores de edad: " + equipo.numeroJugadorasMayoresEdad());
				break;
			case 5:
				System.out.println("Edad mayor de entre todas las jugadoras mayores de edad: "
						+ equipo.edadMayorJugadorasMayoresEdad());
				break;
			case 6:
				System.out.println("Set de DNI de jugadores masculinos menores de edad: "
						+ equipo.dniJugadoresMasculinosMenoresEdad());
				break;
			case 7:
				System.out.println("Lista de nombres de jugadoras ordenados ascendentemente: ");
				equipo.nombresJugadorasOrdenadosAsc().forEach(System.out::println);
				break;
			case 8:
				if (equipo.existeJugadoraMayorEdad()) {
					System.out.println("Existe alguna jugadora mayor de edad");
				} else {
					System.out.println("No existe ninguna jugadora mayor de edad");
				}
				break;
			case 9:
				System.out.println(equipo.numeroCiudadesDiferentes());
				break;
			case 0:
				System.out.println("Saliendo del programa...");
			default:
				System.out.println("Opción no válida. Introduce una opción del 0 al 9.");

			}
		} while (opcion != 0);
	}
}