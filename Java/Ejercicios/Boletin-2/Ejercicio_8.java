package boletin_2;
import java.util.Scanner;
public class Ejercicio_8 {

/*Realiza un método llamado toBinary que reciba un número decimal como
argumento y devuelva un String con el número binario correspondiente*/
	
	public static void main(String[] args) 
	{
		double binario;
        int n, exp, x;
        
        Scanner comienzo = new Scanner(System.in);

        do
        { 
            System.out.print("Introduce un numero entero mayor a 0: ");                                                
            n = comienzo.nextInt();
        }while(n < 0);
        
        binario=0;
        exp=0;
       
        while(n!=0)
        {
                x = n % 2;           
                binario = binario + x * Math.pow(10, exp);                                                   
                exp++;
                n = n/2;
        }
        
        System.out.printf("El Binario es: %.0f ", binario);
	}
}
