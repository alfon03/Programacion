package GEO.Model;

public class Direccion {

	private Integer direccionId;
	private String direccion;
	private String nombrePais;
	private String nombreCiudad;
	private Integer timeMs;

	public Direccion(Integer direccionId, String direccion, String nombrePais, String nombreCiudad, Integer timeMs) {
		super();
		this.direccionId = direccionId;
		this.direccion = direccion;
		this.nombrePais = nombrePais;
		this.nombreCiudad = nombreCiudad;
		this.timeMs = timeMs;
	}

	public Integer getDireccionId() {
		return direccionId;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getNombrePais() {
		return nombrePais;
	}

	public String getNombreCiudad() {
		return nombreCiudad;
	}

	public Integer getTimeMs() {
		return timeMs;
	}

	@Override
	public String toString() {
		return "Direccion [direccionId=" + direccionId + ", direccion=" + direccion + ", nombrePais=" + nombrePais
				+ ", nombreCiudad=" + nombreCiudad + ", timeMs=" + timeMs + "]\n";
	}
}
