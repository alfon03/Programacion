package Euromillon;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import Euromillon.Model.*;

public class Main {

	public static void main(String[] args) throws IOException {

		System.out.println(cargarHistorico());

		System.out.println(numerosRepetidos(cargarHistorico()));
		System.out.println(numeroMaximoDelMapa());
		System.out.println(numeroMinimoDelMapa());
	}

	private static List<Combinacion> cargarHistorico() throws IOException {
		String linea;

		List<Combinacion> historial = new ArrayList<>();
		try {
			File file = new File("./Fichero/Euromillones 2004 a 2023.csv");
			FileReader flujolectura = new FileReader(file);

			BufferedReader br = new BufferedReader(flujolectura);
			br.readLine();
			linea = br.readLine();

			while (linea != null) {

				String[] info = linea.split(",");
				Set<Integer> numeros = new HashSet<>();
				numeros.add(Integer.valueOf(info[1]));
				numeros.add(Integer.valueOf(info[2]));
				numeros.add(Integer.valueOf(info[3]));
				numeros.add(Integer.valueOf(info[4]));
				numeros.add(Integer.valueOf(info[5]));

				Set<Integer> estrellas = new HashSet<>();
				estrellas.add(Integer.valueOf(info[7]));
				estrellas.add(Integer.valueOf(info[8]));

				Combinacion combinacion = new Combinacion(numeros, estrellas, null);

				historial.add(combinacion);


				linea = br.readLine();

			}
			br.close();
			flujolectura.close();
		} catch (FileNotFoundException e) {
			System.out.println("No existe fichero");
		}
		return historial;
	}

	private static int numeroMaximoDelMapa() throws IOException {
		Map<Integer, Integer> mapaNumeroMaximo = numerosRepetidos(cargarHistorico());
		int resultado = 0;
		int maximo = 0;

		for (Integer i : mapaNumeroMaximo.keySet()) {
			if (mapaNumeroMaximo.get(i) > maximo) {
				resultado = i;
				maximo = mapaNumeroMaximo.get(i);
			}
		}
		return resultado;
	}

	private static int numeroMinimoDelMapa() throws IOException {
		Map<Integer, Integer> mapaNumeroMinimo = numerosRepetidos(cargarHistorico());
		int resultado = 0;
		Integer minimo = null;

		for (Integer i : mapaNumeroMinimo.keySet()) {
			if (minimo == null) {
				minimo = mapaNumeroMinimo.get(i);
			} else if (mapaNumeroMinimo.get(i) < minimo) {
				resultado = i;
				minimo = mapaNumeroMinimo.get(i);
			}
		}
		return resultado;
	}

	private static Map<Integer, Integer> numerosRepetidos(List<Combinacion> combinaciones) throws IOException {
		Map<Integer, Integer> mapaNumeros = new HashMap<>();

		for (Combinacion c : combinaciones) {
			for (Integer i : c.getNumeros()) {
				if (!mapaNumeros.containsKey(i)) {

					mapaNumeros.put(i, 0);
				}
				mapaNumeros.put(i, mapaNumeros.get(i) + 1);
			}
		}
		return mapaNumeros;
	}
}
