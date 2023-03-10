package boletin_2;
import java.util.Scanner;
public class Ejercicio_7 {
	
/*Realizar un método llamado segundosEntre que recibirá seis valores enteros, los
tres primeros representarán la hora, minuto y segundos de la primera hora y los
otros tres de la segunda hora. Se deberá devolver el número de segundos que hay
entre la primera hora y la segunda (el valor debe ser siempre en positivo). Si los
datos no son correctos se deberá devolver -1000.*/
	
	public static void main(String[] args) {                                                                      
        int H,M,S;
        int H2,M2,S2;
        int TOTAL_SEGUNDOS;
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
        	 M = M*60;
 	        H= H*3600;
 	        S = S + M + H;
 	        M2 = M2*60;
 	        H2= H2 * 3600;
 	        S2 = H2 + M2 + S2;
 	        
 	        if (S>S2) 
 	        {
 	        	TOTAL_SEGUNDOS = S-S2;
 	        	System.out.println("La difrencia entre las horas es de: " + TOTAL_SEGUNDOS);
 	        }
 	       
 	        else if (S==S2)
 	        {
 	        	TOTAL_SEGUNDOS = 0;
 	        	System.out.print("La difrencia entre las horas es de: " + TOTAL_SEGUNDOS );
 	        	System.out.println(". No hay diferencia ya que las horas son las mismas");
 	        }
 	        
 	        else {
 	        	TOTAL_SEGUNDOS = S2-S;
 	        	System.out.println("La difrencia entre las horas es de: " + TOTAL_SEGUNDOS);
 	        }
 	       
	       
        }
        else
            System.out.println(-1000);
    }
}

