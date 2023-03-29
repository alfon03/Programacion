package BlocNotas;

public class NotaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Nota nota1 = new Nota("Chapero");

		Nota nota2 = new Nota("");

		Nota nota3 = new Nota(" ");

		System.out.println(nota1.isEmpty());
		System.out.println(nota2.isEmpty());
		System.out.println(nota3.isEmpty());
	}

}