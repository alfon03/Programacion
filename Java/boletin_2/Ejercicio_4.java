package boletin_2;

public class Ejercicio_4 
{
	
/*Elabora un programa que codifique una cadena, de tal modo que en el resultado se
inviertan cada 2 caracteres. Los caracteres intercambiados no pueden volver a
intercambiarse.Ejemplo:
						Entrada -> Hola mundo
						Salida -> oHalm nuod
*/				

	public static void main(String[] args) 
	{
		String cadena = "Hola mundo";
		
		String invertida = "";
		
		for (int indice = cadena.length() - 1; indice >= 0; indice--) {
		
			invertida += cadena.charAt(indice);
		}
		System.out.println("Cadena original: " + cadena);
		System.out.println("Cadena invertida: " + invertida);

	}

}
