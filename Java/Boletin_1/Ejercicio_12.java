package boletin;
import java.util.Scanner;
public class Ejercicio_12 {
	public static void main(String[] args) 
	{
	    int numero;
	    int contador = 0;
	    Scanner entrada=new Scanner(System.in);
	    System.out.println("Introduce un numero: ");
	    numero=entrada.nextInt();
	    while (numero>=0) 
	    {
	    	contador = contador +1;
	    	System.out.println("Introduce otro numero: ");
		    numero=entrada.nextInt();
	    }
	    System.out.print("Has introducido: " +contador);
    	System.out.println(" numeros");
	    
	}
}
