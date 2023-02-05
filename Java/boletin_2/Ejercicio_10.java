package boletin_2;
import java.util.Scanner;
public class Ejercicio_10 
{
	/*Realiza un método llamado gcd (greaterCommonDivisor) 
	 * que recibirá dos números y devuelva el máximo común 
	 * divisor según el algoritmo de Euclides.*/
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		gcd(0, 0);
		
	}
	
	
	public static int gcd(int a, int b) 
	{
		System.out.println("Introduce el primer numero: ");
		b=sc.nextInt();
		System.out.println("Introduce otro numero: ");
		a=sc.nextInt();
	    if (b == 0) {
	    	System.out.println("El maximo como un divisor es: "+a);
	        return a;
	        
	    }
	    System.out.printf("El maximo como un divisor de %d y %d es: " +a%b+"\n", b,a);
	    return gcd(b, a % b);
		

	}
}
