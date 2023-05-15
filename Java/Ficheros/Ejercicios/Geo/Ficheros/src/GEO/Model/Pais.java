package GEO.Model;

import java.time.LocalDateTime;

public class Pais {

	private Integer id;
	private String nombre;
	private LocalDateTime fecha;

	public Pais(Integer id, String nombre, LocalDateTime fecha) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fecha = fecha;
	}

	public Integer getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	@Override
	public String toString() {
		return "Pais ID: " + id + "\nNombre del país: " + nombre + "\n";
	}
}
