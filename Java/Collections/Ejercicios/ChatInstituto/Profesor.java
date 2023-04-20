package ChatInstituto;

import java.util.Objects;

public class Profesor extends Persona {

	

	public Profesor(String nombre, String DNI) {
		super(nombre, DNI);
		// TODO Auto-generated constructor stub
	}

	// getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return DNI;
	}

	public void setDni(String DNI) {
		this.DNI = DNI;
	}

	// método toString()
	@Override
	public String toString() {
		return "Profesor{" + "nombre='" + nombre + '\'' + ", dni='" + DNI + '\'' + '}';
	}

	// método equals()
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Profesor profesor = (Profesor) o;
		return Objects.equals(DNI, profesor.DNI);
	}
}