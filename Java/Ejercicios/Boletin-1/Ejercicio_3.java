package proyecto_java;
import java.util.Scanner;
public class prueba {

		   public static void main(String[] args) {
			      String str;
			      Scanner entrada=new Scanner(System.in);
			      System.out.println("Introduce un caracter: ");
			      str=entrada.nextLine();
			      for(int i=0; i < str.length(); i++) 
			      {
			         Boolean flag = Character.isDigit(str.charAt(i));
			         if(flag) {
			            System.out.println(""+ str.charAt(i)+" es un numero");
			         }
			         else 
			         {
			        	 if (str==str.toLowerCase()) 
				     		{
				     			for (int x=0;x<str.length();x++) 
				     			{
				     				
				     				   System.out.println("Es minuscula " + x + ": " + str.charAt(x));
				     			}
				     		}
			        	 else 
				     		{
				     			for (int x=0;x<str.length();x++) 
				     			{	
				     				System.out.println("Es mayuscula " + x + ": " + str.charAt(x));
				     			}
				     		}
			         
				         }
			         switch (str) 
			         {
				         case " ": 
					         {
					        	 for (int x=0;x<str.length();x++) 
					     			{
					     				
					     				   System.out.println("Es un espacio " + x + ": " + str.charAt(x));
					     			}
					        
				     		}
					        break;
				         case "(",")":
				         {
				        	 for (int x=0;x<str.length();x++) 
				     			{
				     				
				     				   System.out.println("Es un parentesis " + x + ": " + str.charAt(x));
				     			}
				     		
			     		}
				        break;
				        
				         case "{","}":
				         {
				        	 for (int x=0;x<str.length();x++) 
				     			{
				     				
				     				   System.out.println("Es una llave " + x + ": " + str.charAt(x));
				     			}
				     		
			     		}
				        break;
				        
				         case ",",".",";","#","?","-","_":
				         {
				        	 for (int x=0;x<str.length();x++) 
				     			{
				     				
				     				   System.out.println("Es un signo de puntuacion " + x + ": " + str.charAt(x));
				     			}
				     		
			     		}
				        break;
			         }
			      }
		   }
}
