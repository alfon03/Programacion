package ChatInstituto;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Alumno extends Persona {

	public Alumno(String nombre, String DNI) {
		super(nombre, DNI);
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
		return "Alumno{" + "nombre='" + nombre + '\'' + ", dni='" + DNI + '\'' + '}';
	}

	// método equals()
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Alumno alumno = (Alumno) o;
		return Objects.equals(DNI, alumno.DNI);
	}

	public boolean esMenorDeEdad() {
		LocalDate fechaNacimiento = LocalDate.parse(this.DNI.substring(0, 8), DateTimeFormatter.BASIC_ISO_DATE);
		LocalDate fechaActual = LocalDate.now();
		Period edad = Period.between(fechaNacimiento, fechaActual);
		return edad.getYears() < 18;
	}
}
