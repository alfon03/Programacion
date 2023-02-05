package boletin_2;
import java.util.Scanner;
public class Ejercicio_1 {

/*Realizar un método llamado numeroSolucionesEcuacionSegundoGrado que reciba
los coeficientes de una ecuación de segundo grado y devuelva el número de
soluciones que tiene. Si los argumentos no son válidos (el primer coeficiente tiene
que ser distinto de cero) debe devolver un -1.*/

	public static void main(String[]args) 
	{
		
		int x2, x1, x, ecuacion;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introuce un valor para la primera variable de grado 2: ");
		x2=sc.nextInt();
		System.out.println("Introduce un valor para le segunda variable de grado 1: ");
		x1=sc.nextInt();
		System.out.println("Introduce un valor para el termino idependiente:  ");
		x=sc.nextInt();
		
		//Ejemplo con todas las variables positivas
		System.out.println("");
		while (x2 == 0) {
			ecuacion=-1;
			System.out.println("El primer coeficiente es 0, se devuelve: "+ecuacion);
			break;
		}
		if (x2<0 || x2>0) 
		{
				System.out.println("La ecuacion de segundo grado es: "+ x2 +"X²"+ " " + x1 + "X" + " " + x);
				double ecuacion1;
				double ecuacion2;
				int raiz1, raiz2;
				raiz1 = x1 * x1 - 4 * x2 * (-x);
				ecuacion1= ((- x1 + Math.sqrt(raiz1))/x2);
				
				raiz2 = x1 * x1 - 4 * x2 * (-x);
				ecuacion2= ((- x1 - Math.sqrt(raiz2))/x2);
				
				System.out.println("");
				
				System.out.println("Las possibles soluciones serian: " + ecuacion1 + " " + "y" + " " + ecuacion2);
		}
	}
}