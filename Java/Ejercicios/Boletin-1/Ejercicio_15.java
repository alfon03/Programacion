package proyecto_java;
import java.util.Scanner;
public class Ejercicio_15 {
	
	/*Crea un programa que permita sumar N números. El usuario decide cuándo termina
	de introducir números al indicar la palabra ‘fin’.*/
	
	public static void main(String[] args) {
		String n="0";
		int suma = 0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		n=sc.nextLine();
		do {
			suma +=Integer.valueOf(n);
			System.out.println("Introduce un numero: ");
			n=sc.nextLine();	
		}while (!n.toUpperCase().equals("FIN"));
		System.out.println("La suma de los numeros introducidos es: " + suma);
	}
}
