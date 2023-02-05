package boletin_2;
import java.util.Scanner;
public class Ejercicio_11 
{
/*Realizar un método llamado minimoComunMultiplo que reciba dos números y
calcule el mínimo común múltiplo de dos números. Con el máximo común divisor de
una pareja de números podemos obtener fácilmente el mínimo común múltiplo de
dicha pareja. El mínimo común múltiplo de dos números es igual al producto de los
números dividido entre su máximo común divisor. Por ejemplo, el máximo común
divisor de 24 y 36 es 12, por tanto el mínimo común múltiplo de 24 y 36 es
(24×36)/12=72.*/
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		minimoComunMultiplo(0, 0);
	}
	
	public static int gcd(int a, int b) 
	{
	    if (b == 0) {
	        return a;
	        
	    }
	    return gcd(b, a % b);
	}
	public static int minimoComunMultiplo(int a, int b) 
	{
		System.out.println("Introduce el primer numero: ");
		b=sc.nextInt();
		System.out.println("Introduce otro numero: ");
		a=sc.nextInt();
		System.out.printf("El minimo comun multiplo de %d y %d es: " + (a * b) / gcd(a, b),b,a);
	    return (a * b) / gcd(a, b);
	}

	
		

}

