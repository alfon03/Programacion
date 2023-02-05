package boletin_2;
import java.util.Scanner;

/*Realizar un método llamado horaMayor que recibirá seis valores enteres, los tres
primeros representarán la hora, minuto y segundos de la primera hora y los otros
tres de la segunda hora. Se deberá devolver un 1 si la primera hora es mayor que la
segunda, un 2 si la segunda hora es mayor que la primera, un 0 si son iguales y un
-1000 si los datos no son correctos.*/

public class Ejercicio_6 {
	public static void main(String[] args) {                                                                      
        int H,M,S;
        int H2,M2,S2;
        int TOTAL_HORAS;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca hora: ");
        H =  sc.nextInt();
        System.out.print("Introduzca minutos: ");
        M =  sc.nextInt();
        System.out.print("Introduzca segundos: ");
        S =  sc.nextInt();
        
        System.out.print("Introduzca otra hora: ");
        H2 =  sc.nextInt();
        System.out.print("Introduzca otros minutos: ");
        M2 =  sc.nextInt();
        System.out.print("Introduzca otros segundos: ");
        S2 =  sc.nextInt();
        if((H>=0 && H<24 && M>=0 && M<60 && S>=0 && S<60) && (H2>=0 && H2<24 && M2>=0 && M2<60 && S2>=0 && S2<60))
        {
	           System.out.println("Hora correcta");
	        M = M/60;
	        S= S/3600;
	        H = H + M + S;
	        M2 = M2/60;
	        S2= S2/3600;
	        H2 = H2 + M2 + S2;
	        while (H != H2)
	        {
	        	if (H>H2) 
	        	{
	        		System.out.println(1);
	        		
	        	}
	        	else 
	        	{
	        		System.out.println(2);
	        	}
	        	break;
	        
	        }
	        if (H == H2)
	        {
	        	System.out.println(0);
	        }
        }
     
        else 
        {
            System.out.println(-1000);
        }

    }
}
