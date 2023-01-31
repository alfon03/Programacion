package proyecto_java;

public class Ejercicio_7 {
	
	/*Codifica las siguientes secuencias numéricas haciendo uso de estructuras: i) for, ii)
		while, iii) do-while en cada una de ellas:
		a. Crea un método que muestre los números del 1 al 100
		b. Repite el ejercicio anterior, pero en formato descendente, es decir, del 100 al 1.
		c. Crea un programa que calcule y escriba los números múltiplos de 5 de 0 a 100.
		d. Escribe los números del 320 al 160, contando de 20 en 20 hacia atrás.
	 */
	
	public static void main(String[] args) 
	{
        int i;
        int a = 1;
        System.out.println("\nNumeros del 1 al 100 con for: " );                                           
        for (i = 1; i <= 100; i++) 
        {
            System.out.println(i);
        }
        System.out.println("\nNumeros del 1 al 100 con while: ");                                             
        while (a <= 100) 
        {
            System.out.println(a);
            a++;
        }
        System.out.println("\nNumeros del 1 al 100 con do while: ");                                             
        a = 1;
        do 
        {
            System.out.println(a);
            a++;
        } while (a <= 100);
        
        
        //Descendente
        //Repite el ejercicio anterior, pero en formato descendente, es decir, del 100 al 1.

        System.out.println("\nNumeros del 100 al 1 con for: " );                                           
        for (i = 100; i >= 1; i--) 
        {
            System.out.println(i);
        }
        a=100;
        System.out.println("\nNumeros del 100 al 1 con while: ");                                             
        while (a >= 1) 
        {
            System.out.println(a);
            a--;
        }
        System.out.println("\nNumeros del 100 al 1 con do while: ");                                             
        a = 100;
        do 
        {
            System.out.println(a);
            a--;
        } while (a >= 1);
        
        
        //Crea un programa que calcule y escriba los números múltiplos de 5 de 0 a 100
        //Multiplos
        
        System.out.println("\nLos numeros multiplos de 5 de 0 a 100 con do while son: ");                                             

        do 
        {
            System.out.println(i);
            i+=5;
          } while(i <= 100);
        
        System.out.println("\nLos numeros multiplos de 5 de 0 a 100 con for son: " );                                           
        for (i = 0; i <= 100; i+=5) 
        {
            System.out.println(i);
        }
        System.out.println("\nLos numeros multiplos de 5 de 0 a 100 con while son: ");                                             
        while (a <= 100) 
        {
            System.out.println(a);
            a+=5;
        }
        
        // Escribe los números del 320 al 160, contando de 20 en 20 hacia atrás.
        
        System.out.println("\nLos numeros del 320 al 160, contando de 20 en 20 hacia atras con while son: "); 
        a=320;
        while (a >= 160) 
        {
            System.out.println(a);
            a-=20;
        }
        
        System.out.println("\nLos numeros del 320 al 160, contando de 20 en 20 hacia atras con for son: " );                                           
        for (i = 320; i >= 160; i-=20) 
        {
            System.out.println(i);
        }
        System.out.println("\nLos numeros del 320 al 160, contando de 20 en 20 hacia atras con do while son: ");                                             
        i = 320;
        do 
        {
            System.out.println(i);
            i-=20;
          } while(i >= 160);
        
        
	}	
}
