package Mapas;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;


class testMapeando {

	Mapeando mapeo = new Mapeando();
	Set<Persona> conjuntoPersonas = new HashSet<>();
	List<Persona> listaPersonas = new ArrayList<>();
	List<Persona> listaPersonas2 = new ArrayList<>();	
	@Test
	void testMapearPersonasPorGeneroOK() {
		listaPersonas.add(new Persona("Jose Manuel","Sevillano",Genero.MASCULINO));
		listaPersonas.add(new Persona("Marta","Lopez",Genero.FEMENINO));
		listaPersonas.add(new Persona("Tomás","Moreno",Genero.MASCULINO));
		listaPersonas.add(new Persona("Raquel","Molina",Genero.FEMENINO));
		listaPersonas.add(new Persona("Lorena","Macho Alcazar",Genero.FEMENINO));
		listaPersonas.add(new Persona("Olga","Garcia",Genero.FEMENINO));
		
		conjuntoPersonas.add(new Persona("Jose Manuel","Sevillano",Genero.MASCULINO));
		conjuntoPersonas.add(new Persona("Marta","Lopez",Genero.FEMENINO));
		conjuntoPersonas.add(new Persona("Tomás","Moreno",Genero.MASCULINO));
		conjuntoPersonas.add(new Persona("Raquel","Molina",Genero.FEMENINO));
		conjuntoPersonas.add(new Persona("Lorena","Macho Alcazar",Genero.FEMENINO));
		conjuntoPersonas.add(new Persona("Olga","Garcia",Genero.FEMENINO));
		
		
		assertTrue(mapeo.mapearPersonasPorGenero(listaPersonas).containsKey(Genero.MASCULINO));
		assertTrue(mapeo.mapearPersonasPorGenero(listaPersonas2).isEmpty());
		assertTrue(mapeo.mapearPersonasPorGenero(conjuntoPersonas).containsKey(Genero.FEMENINO));
		assertFalse(mapeo.mapearPersonasPorGenero(conjuntoPersonas).isEmpty());

	}
	
	@Test
	void testMapearPersonasPorGeneroKO() {
		assertFalse(mapeo.mapearPersonasPorGenero(listaPersonas).containsKey(Genero.DESCONOCIDO));
		assertTrue(mapeo.mapearPersonasPorGenero(listaPersonas2).isEmpty());
		assertFalse(mapeo.mapearPersonasPorGenero(conjuntoPersonas).containsKey(Genero.DESCONOCIDO));
		assertTrue(mapeo.mapearPersonasPorGenero(conjuntoPersonas).isEmpty());
	}
	
	@Test
	void testContarNumerosKO() {
		List<Integer> numeros = new ArrayList<>();

		
		assertTrue(mapeo.contarNumeros(numeros).isEmpty());
		assertFalse(mapeo.contarNumeros(numeros).containsKey(9));
	}

	@Test
	void testContarNumerosOK() {
		List<Integer> numeros = new ArrayList<>();
		
		numeros.add(10);
		numeros.add(6);
		numeros.add(7);
		numeros.add(10);
		numeros.add(10);
		numeros.add(54);
		
		assertTrue(mapeo.contarNumeros(numeros).containsKey(10));
		assertFalse(mapeo.contarNumeros(numeros).isEmpty());
	}


}