package proyecto_java;
import java.util.Scanner;
public class Ejercicio_14 {
	public static void main(String[] args) 
	{                     
	/*Realiza un programa que vaya pidiendo números hasta que se introduzca un
	número negativo y nos diga cuántos números se han introducido, la media de los
	impares y el mayor de los pares. El número negativo sólo se utiliza para indicar el
	final de la introducción de datos pero no se incluye en el cómputo.*/
		
		
		
		Scanner sc = new Scanner(System.in);
		

	    int n1;
	    int n2 = 0;
	    int nImpares = 0;
	    int maxPar = 0;
	    int sumImpares = 0;
	
	    
	    do {
	    	System.out.println("Introduce un numero (si desea terminar introduzca un numero negativo): ");
	      n1 = sc.nextInt();
	      
	      if (n1 >= 0) {
	        n2++;
	        if ((n1 % 2) == 1) { // número impar
	          sumImpares += n1;
	          nImpares++;
	        } else { // número par
	          if (n1 > maxPar)
	        	  maxPar = n1;
	        }
	      }
	    } while (n1 >= 0);

	    System.out.println("Ha introducido " + n2 + " números positivos.");
	    System.out.print("La media de los impares es ");
	    System.out.println(sumImpares / nImpares + ".");
	    System.out.println("El máximo de los pares es " + maxPar + ".");
	 }
}

