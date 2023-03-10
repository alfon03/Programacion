package proyecto_java;
import java.util.Scanner;
public class Ejercicio_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		float NPract, NProblem, NTeori;
		String nombre;
		boolean contador;
		contador = false;
		while (contador = true)
		{	
			System.out.println("Introduce el nombre del alumno: ");
			nombre = sc.nextLine();
			while (nombre != "") 
			{
				System.out.println("Introduce la nota de la practica: ");
				NPract = sc.nextFloat();
				while (NPract<0){
					System.out.println("Valor erroneo. Introduce la nota de la practica: ");
					NPract = sc.nextFloat();
				}
				System.out.println("Introduce la nota de los problemas: ");
				NProblem = sc.nextFloat();
				while (NProblem<0){
					System.out.println("Valor erroneo. Introduce la nota de los problemas: ");
					NProblem = sc.nextFloat();
				}
				System.out.println("Introduce la nota de la teoria: ");
				NTeori = sc.nextFloat();
				while (NTeori<0){
					System.out.println("Valor erroneo. Introduce la nota de la teoria: ");
					NTeori = sc.nextFloat();
				}
				System.out.println("La media de " +nombre+ " es: " +((NPract+NProblem+NTeori)/3));
				System.out.println("\n");
				System.out.println("Introduce el nombre del alumno: ");
				nombre = sc.nextLine();
			}
		}
	}	
}
