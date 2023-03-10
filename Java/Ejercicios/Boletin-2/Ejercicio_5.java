package boletin_2;
import java.util.Scanner;
public class Ejercicio_5 {
	 
/*Realizar un método llamado esMultiplo que recibirá dos números y devuelva True si
el primer número es múltiplo del segundo.*/
	
	    public static void main( String[] args )
	    {
	      
	        int numero1;
	        int numero2;
	        
	     
	        Scanner entrada = new Scanner( System.in );
	        
	        
	        System.out.print( "Digite el primer entero: " );
	        numero1 = entrada.nextInt();
	        
	        System.out.print( "Digite el segundo entero: " );
	        numero2 = entrada.nextInt();
	        
	        // Comprobar si el primer entero es múltiplo del segundo entero
	        if( numero1 % numero2 == 0 )
	        {
	            System.out.printf( " True. %d es múltiplo de %d.", numero1, numero2 );
	        }
	        else {
	            System.out.printf( " False. %d No es múltiplo de %d.", numero1, numero2 );

	        }
	      	        
	    } 
}


