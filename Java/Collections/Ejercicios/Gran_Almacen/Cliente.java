package Gran_Almacen;

public class Cliente {
	private int numero;
	private static int ultimoNumero = 0;

	public Cliente(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public static int generarNumero() {
		ultimoNumero++;
		return ultimoNumero;
	}

}