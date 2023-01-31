package boletin;
import java.util.Scanner;
public class Ejercicio_11 {
	public static void main(String[] args) 
	{
		 Scanner entrada = new Scanner( System.in );
		 int num,cuadrado;
		 System.out.print("Introduzca numero: ");
		 num=entrada.nextInt();
		 while(num>=0) 
		 {
			 cuadrado=num*num;
			 System.out.println(num+ " es igual a "+ cuadrado);
			 System.out.print("Introduzca otro numero: ");
			 num=entrada.nextInt();
		 } 
		 System.out.print("Power off ");
	}
}
