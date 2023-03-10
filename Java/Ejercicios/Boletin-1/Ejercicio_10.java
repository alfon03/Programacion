package boletin;
import java.util.Scanner;
public class Ejercicio_10 {
	public static void main(String[] args) {
	    
	    int numero = 0;
	    do {
	    Scanner entrada= new Scanner(System.in );
	    System.out.print("Introduzca un numero: ");
	    numero = entrada.nextInt();
	      
	      if(numero < 0) {
	        System.out.print("Error. El numero introducido no es correcto,");
	        System.out.println(" introduzca otro numero pero esta vez positivo.");
	      }
	    } while (numero < 0);
	    
	    int suma = 0;
	    
	    for(int i = numero; i < numero + 100; i++) {
	      suma += i;
	    }

	    System.out.print("La suma de los 100 numeros siguientes a ");
	    System.out.println(numero + " es " + suma + ".");
	  }
}
