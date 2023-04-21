package Mapas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Mapeando {

	
	
	
	/**
	 * Recibe una colección de personas y las agrupa por género
	 * @param personas
	 * @return Mapa con la colección de personas clasificadas por género
	 */
	public Map<Genero, Set<Persona>> mapearPersonasPorGenero(Collection<Persona> personas) {
	    Map<Genero, Set<Persona>> mapaGenero = new HashMap<>();
	    
	    for(Persona p : personas) {
	        mapaGenero.computeIfAbsent(p.getGenero(), k -> new HashSet<>()).add(p);
	    }
	    
	    return mapaGenero;
	}
	
	
	
	/**
	 * Recibe una colección de números y cuenta cuantas ocurrencias hay de cada uno de ellos
	 * creando un mapa en el que aparece cada número junto a su frecuencia de aparición
	 * @param numeros
	 * @return Tabla de frecuencias de los números facilitados
	 */
	public Map<Integer, Integer> contarNumeros(Collection<Integer> numeros) {
	    Map<Integer, Integer> contadorNumeros = new HashMap<>();
	    
	    for(Integer i : numeros) {
	        contadorNumeros.putIfAbsent(i, 0);
	        contadorNumeros.put(i, contadorNumeros.get(i) + 1);
	    }
	    
	    return contadorNumeros;
	}

	/**
	 * Genera una lista de números aleatorios entre 0 y 20 del tamaño indicado
	 * @param size tamaño de la lista
	 * @return lista de size números aleatorios
	 */
	public static Collection<Integer> generarNumerosAleatorios(int size) {
	    List<Integer> numeros = new ArrayList<>(List.of(new Random().nextInt(20)));
	    return numeros;
	}

}
