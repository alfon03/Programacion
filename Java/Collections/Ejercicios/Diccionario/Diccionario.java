package Diccionario;

import java.util.*;

public class Diccionario {
	private Map<String, List<String>> diccionario;

	public Diccionario() {
		diccionario = new TreeMap<>();
	}

	public void añadirPalabra(String palabra, String significado) {
		if (!diccionario.containsKey(palabra)) {
			diccionario.put(palabra, new ArrayList<>());
		}
		diccionario.get(palabra).add(significado);
	}

	public void buscarPalabra(String palabra) {
		if (diccionario.containsKey(palabra)) {
			List<String> significados = diccionario.get(palabra);
			System.out.println("La palabra '" + palabra + "' tiene los siguientes significados:");
			for (int i = 0; i < significados.size(); i++) {
				System.out.println((i + 1) + ". " + significados.get(i));
			}
		} else {
			System.out.println("La palabra '" + palabra + "' no está en el diccionario.");
		}
	}

	public void borrarPalabra(String palabra) {
		if (diccionario.containsKey(palabra)) {
			diccionario.remove(palabra);
			System.out.println("La palabra '" + palabra + "' ha sido eliminada del diccionario.");
		} else {
			System.out.println("La palabra '" + palabra + "' no está en el diccionario.");
		}
	}

	public void listarPalabras(String prefijo) {
		System.out.println("Las palabras que comienzan con '" + prefijo + "' son:");
		for (String palabra : diccionario.keySet()) {
			if (palabra.startsWith(prefijo)) {
				System.out.println("- " + palabra);
			}
		}
	}
}