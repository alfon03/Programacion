package proyecto_java;
import java.util.Scanner;
public class Ejercicio_2 {
	public static void main(String[] args) {
	    String dia;
	    System.out.println("Introduzca un día de la semana y le diré");
	    System.out.print("qué asignatura toca a primera hora ese día: ");
	    Scanner entrada = new Scanner(System.in);
	    dia = entrada.nextLine();
	    dia = dia.toLowerCase();
	    while ((!dia.equals("lunes")) && (!dia.equals("martes")) && (!dia.equals("miercoles")) && (!dia.equals("jueves")) && (!dia.equals("martes")) && (!dia.equals("martes")) && (!dia.equals("martes")))
	    {
	    	System.out.print("Dia erroneo: ");
		    dia = entrada.nextLine();
		    dia = dia.toLowerCase(); 
	    };
	    switch(dia) {
	      case "lunes":{
	    	  System.out.println("Programación");
	    	  break;
	    	  }
	      case "martes":{
	    	  System.out.println("Sistemas Informáticos");
	    	  break;}
	  
	      case "miércoles":{
	        System.out.println("Programación");
	        break;}
	      case "jueves":{
	        System.out.println("Sistemas Informáticos");
	        break;}
	      case "viernes":{
	        System.out.println("Bases de Datos");
	        break;}
	      case "sábado":{
	    	  System.out.println("");
	    	  break;}
	      case "domingo":{
	        System.out.println("Error. Ese dia no hay clase");
	        break;}
	    }}
}
