package boletin;
import java.util.Scanner;
public class Ejercicio_9 {
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner( System.in );
		 int num;
		 boolean multiplo_3;
		 multiplo_3=false;
		 for (int i=0;i<5;i++)
		 {
			 System.out.print("Introduzca numero: ");
			 num=entrada.nextInt();
			 if(num %3 == 0)
			 multiplo_3=true; // Si se ejecuta el boolean nos indica que al menos hay un multiplo de 3
		 }
		 
		 if(multiplo_3 == false)
		 System.out.println("No existen multiplos de 3");
		 else
		 System.out.println("Hay multiplos de 3");
	}
}
