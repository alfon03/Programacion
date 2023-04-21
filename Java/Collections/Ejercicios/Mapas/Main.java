package Mapas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

	public static void main(String[] args) {		
		Mapeando mapeo = new Mapeando();
		
		List<Integer> numeros = new ArrayList<>();
		
		numeros.add(10);
		numeros.add(6);
		numeros.add(7);
		numeros.add(10);
		numeros.add(10);
		numeros.add(54);

		System.out.println(mapeo.contarNumeros(numeros));
		
		int size = 10; // Tamaño de la colección de números aleatorios
        Collection<Integer> numerosAleatorios = Mapeando.generarNumerosAleatorios(size);
        System.out.println("Números aleatorios generados:");
        for (Integer numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }
	
	}
}