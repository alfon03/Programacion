package GEO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import GEO.Model.*;

public class Main {

	public static void main(String[] args) throws IOException {
		List<Pais> paises = cargarFicheroPais();
		System.out.println(paises);

		List<City> ciudades = cargarFicheroCiudad();
		System.out.println(ciudades);

		List<Direccion> direcciones = cargarFicheroDirecciones();
		System.out.println(direcciones);
	}

	private static List<Pais> cargarFicheroPais() throws IOException {
		List<Pais> listaPaises = new ArrayList<>();
		try {
			File file = new File("./Fichero/country.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			br.readLine(); 

			String linea;
			while ((linea = br.readLine()) != null) {
				String[] info = linea.split(",");
				Pais pais = new Pais(Integer.valueOf(info[0]), info[1], null);
				listaPaises.add(pais);
			}

			br.close();
		} catch (FileNotFoundException ex) {
			System.out.println("No existe el archivo");
		}

		return listaPaises;
	}

	private static List<City> cargarFicheroCiudad() throws IOException {
		List<City> listaCiudades = new ArrayList<>();
		try {
			File file = new File("./Fichero/city.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			br.readLine(); 

			String linea;
			while ((linea = br.readLine()) != null) {
				String[] info = linea.split(",");
				City ciudad = new City(Integer.valueOf(info[0]), info[1], Integer.valueOf(info[2]), null);
				listaCiudades.add(ciudad);
			}

			br.close();
		} catch (FileNotFoundException ex) {
			System.out.println("No existe el archivo");
		}

		return listaCiudades;
	}

	private static List<Direccion> cargarFicheroDirecciones() throws IOException {
		List<Direccion> listaDirecciones = new ArrayList<>();
		try {
			File file = new File("./Fichero/address.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			br.readLine();

			String linea;
			while ((linea = br.readLine()) != null) {
				String[] info = linea.split(",");
				Direccion direccion = new Direccion(Integer.valueOf(info[0]), info[1], null, null, null);
				listaDirecciones.add(direccion);
			}

			br.close();
		} catch (FileNotFoundException ex) {
			System.out.println("No existe el archivo");
		}

		return listaDirecciones;
	}
}
