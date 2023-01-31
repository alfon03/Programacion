package proyecto_java;
import java.util.Scanner;
public class Ejercicio_8 {
	public static void main(String[] args) 
	{
		Scanner entrada= new Scanner(System.in );
		int num,suma_total;
		suma_total=0;

		for (int i=1;i<=15;i++)
		{
		 System.out.print("Introduzca numero: ");
		 num=entrada.nextInt();
		 suma_total=suma_total+num;
		}
		 System.out.println("La suma total es de: "+suma_total);
	}
}

