package proyecto_java;
import java.util.Scanner;
public class Ejercicio_13 {
	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        int i;
        int[] numero = new int[10];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        
        System.out.println("Programa que pide 10 numeros y calcula el maximo y minimo.");
        for (i=0;i<10;i++) 
        {
            System.out.print("Introduce el numero "+(i+1)+": ");
            numero[i] = scanner.nextInt();
            if (numero[i]<minimo) 
            {
                minimo  = numero[i];
            }
            if (numero[i]>maximo) 
            {
                maximo = numero[i];
            }
        }
        for (i=0; i<10;i++) 
        {
            if (numero[i]==maximo) 
            	{
                	System.out.println("Numero "+ (i+1)+": "+numero[i] + " maximo.");
                }
            if (numero[i]== minimo) 
            	{
                	System.out.println("Numero "+ (i+1)+": "+numero[i] + " minimo.");
            	}
            if (numero[i] == maximo || numero[i] == minimo) 
            	{} 
            else 
            	{
                	System.out.println("Numero "+ (i+1)+": "+numero[i]);
            	}
        }
    }
}

