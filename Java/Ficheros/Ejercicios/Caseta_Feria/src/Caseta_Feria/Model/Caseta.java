package Caseta_Feria.Model;

import java.util.Objects;

public class Caseta {

	private String titulo;
	private String calle;
	private String numero;
	private String modulo;
	private String clase;
	private String id;
	private String id_calle;

	public Caseta(String titulo, String calle, String numero, String modulo, String clase, String id, String id_calle) {
		this.titulo = titulo;
		this.calle = calle;
		this.numero = numero;
		this.modulo = modulo;
		this.clase = clase;
		this.id = id;
		this.id_calle = id_calle;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getCalle() {
		return calle;
	}

	public String getNumero() {
		return numero;
	}

	public String getModulo() {
		return modulo;
	}

	public String getClase() {
		return clase;
	}

	public String getId() {
		return id;
	}

	public String getId_calle() {
		return id_calle;
	}

	public void restarNumero(int numero) {
		int currentNumero = Integer.parseInt(this.numero);
		if (currentNumero - numero < 0) {
			throw new IllegalArgumentException("No se puede restar un número mayor al número actual");
		}

		this.numero = String.valueOf(currentNumero - numero);
	}

	@Override
	public int hashCode() {
		return Objects.hash(calle, clase, id, id_calle, modulo, numero, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj instanceof Caseta) {
			Caseta other = (Caseta) obj;
			return Objects.equals(calle, other.calle) && Objects.equals(clase, other.clase)
					&& Objects.equals(id, other.id) && Objects.equals(id_calle, other.id_calle)
					&& Objects.equals(modulo, other.modulo) && Objects.equals(numero, other.numero)
					&& Objects.equals(titulo, other.titulo);
		}

		return false;
	}

	@Override
	public String toString() {
		return String.format("Caseta: %s, en calle: %s, número: %s, modulo: %s, clase: %s, id: %s, id calle: %s",
				this.titulo, this.calle, this.numero, this.modulo, this.clase, this.id, this.id_calle);
	}
}
