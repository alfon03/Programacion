package boletin_2;
import java.util.Scanner;
public class Ejercicio_9 {
	
/*Realiza un método llamado toDecimal que reciba un String con un valor numérico
en binario como argumento y devuelva un número con el número decimal
correspondiente*/	
	
	public static void main(String[] args) {
	    long numero, aux, digito, decimal;
	     int exponente;
	     boolean binario;
	     Scanner sc = new Scanner(System.in);

	    
	     do {
	          System.out.print("Introduce un numero binario: ");
	          numero = sc.nextLong();
	          /*Comprobacion de que es binario
	           formado solo por ceros y unos*/
	          binario = true;
	          aux = numero;
	          while (aux != 0) {
	                     digito = aux % 10; 
	                     if (digito != 0 && digito != 1) { //si no es 0 o 1
	                    	 binario = false; //no es un número binario
	                     }
	                     aux = aux / 10;                        
	           }
	      } while (!binario); //si el numero no es binario, lo volvemos a pedir

	      //proceso para pasar de binario a decimal
	      exponente = 0;
	      decimal = 0; 
	      while (numero != 0) {
	                
	                digito = numero % 10;
	                                        
	                decimal = decimal + digito * (int) Math.pow(2, exponente);
	            
	                exponente++;
	                numero = numero / 10;
	      }
	      System.out.println("Decimal: " + decimal);
	   }
}
