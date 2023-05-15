package GEO.Model;

import java.time.LocalDateTime;

public class City {

	private Integer id;
	private String name;
	private Integer idPais;
	private LocalDateTime fecha;

	public City(Integer id, String name, Integer idPais, LocalDateTime fecha) {
		super();
		this.id = id;
		this.name = name;
		this.idPais = idPais;
		this.fecha = fecha;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Integer getIdPais() {
		return idPais;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	@Override
	public String toString() {
		return "Código de la ciudad: " + id + "\nNombre de la ciudad: " + name + "\nCódigo del país: " + idPais + "\n";
	}
}
