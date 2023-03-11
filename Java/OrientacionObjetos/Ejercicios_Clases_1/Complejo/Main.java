package Complejo;
import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		boolean debug = false;

		Complejo numero = new Complejo(5, 2);
		System.out.println("El numero es: " + numero.toString());

		numero.SetImaginaria(-3);
		System.out.println("El numero es: " + numero.toString());

		System.out.print("La magnitud es: ");
		System.out.println(numero.GetMagnitud());

		Complejo numero2 = new Complejo(-1, 1);
		numero.Add(numero2);
		System.out.print("Después de agregar: ");
		System.out.println(numero.toString());

		if (debug)
		{
			new Scanner(System.in).nextLine();
		}
	}
}