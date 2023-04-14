package Diccionario;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Diccionario diccionario = new Diccionario();

		int opcion = 0;
		do {
			System.out.println("---- Diccionario ----");
			System.out.println("1. Añadir palabra");
			System.out.println("2. Buscar palabra");
			System.out.println("3. Borrar palabra");
			System.out.println("4. Listar palabras que empiecen por...");
			System.out.println("5. Salir");
			System.out.print("Introduce la opción deseada: ");
			opcion = sc.nextInt();
			sc.nextLine(); // Consumir el salto de línea
			switch (opcion) {
			case 1:
				System.out.print("Introduce la palabra: ");
				String palabra = sc.nextLine();
				System.out.print("Introduce el significado: ");
				String significado = sc.nextLine();
				diccionario.añadirPalabra(palabra, significado);
				break;
			case 2:
				System.out.print("Introduce la palabra: ");
				String palabraBuscada = sc.nextLine();
				diccionario.buscarPalabra(palabraBuscada);
				break;
			case 3:
				System.out.print("Introduce la palabra: ");
				String palabraBorrada = sc.nextLine();
				diccionario.borrarPalabra(palabraBorrada);
				break;
			case 4:
				System.out.print("Introduce el prefijo: ");
				String prefijo = sc.nextLine();
				diccionario.listarPalabras(prefijo);
				break;
			case 5:
				System.out.println("¡Hasta pronto!");
				break;
			default:
				System.out.println("Opción no válida. Introduce una opción del 1 al 5.");
			}
		} while (opcion != 5);
	}

}