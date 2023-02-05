package boletin_2;
import java.util.Scanner;
public class Ejercicio_2 {
	
/*Realiza un programa que pida un número por teclado y que después muestre ese
número al revés.*/
	
	
	
	public static void main(String[] args) 
	{
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.print("Introduce un número para invertir: ");
        num = sc.nextInt();
        System.out.printf("El número %d invertido es el %d", num, invertirNumero(num) );
    }
     
   
	public static int invertirNumero(int numero)
	{
        int n, invertitido = 0;
        while(numero!=0)
        {
            n = numero%10;
            invertitido = (invertitido * 10) + n;
            numero/=10;
        }
        return invertitido;
    }
}
