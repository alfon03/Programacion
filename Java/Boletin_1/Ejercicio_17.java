package proyecto_java;
import java.util.Scanner;
public class Ejercicio_17 {
	
	/*Escribe un programa que muestre los N primeros términos de la serie de Fibonacci.
	El primer término de la serie de Fibonacci es 1, el segundo es 1 y el resto se calcula
	sumando los dos anteriores, por lo que tendríamos que los términos son 1, 1, 2, 3, 5,
	8, 13, 21, 34, 55, 89, 144.*/
	
	public static void main(String[] args) 	
	{

	
	
		System.out.println("Este programa mostrará los n primeros números de Fibonacci");
		Scanner sc=new Scanner(System.in);
		int n= 0, fibo1 = 0, fibo2 = 1,  aux = 0;
	    
	    System.out.print("Indique cuántos números desea que se muestren: ");
	    n = sc.nextInt();
	    
	    for (int i = 1; i <= n; i++) {
	      if (i == 1) {
	        System.out.print(fibo1 + ", ");
	      } else if (i == 2) {
	        System.out.print(fibo2 + ", ");
	      } else {
	        System.out.print((fibo1 + fibo2) + ", ");
	        aux = fibo2;
	        fibo2 += fibo1;
	        fibo1 = aux;
      }
    }
  }
}
