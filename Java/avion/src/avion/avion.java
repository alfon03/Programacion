package avion;
import java.util.Scanner;

public class avion {

	private String id;
	private Integer capacidad;
	private Integer numVuelos = 0;
	private Double kmVolados = 0.0;
	private String compannia;
	
	public Double getKmVolados() {
		return kmVolados;
	}
	
	public Double getMediaKm() {
		return this.kmVolados/this.numVuelos;
	}

	public Integer getNumVuelos() {
		return numVuelos;
	}

	public String getIdAvion() {
		return id;
	}

	public void setIdAvion(String idAvion) {
		this.id = idAvion;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	protected void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}
	public void setNumVuelos(Integer numVuelos) {
		this.numVuelos = numVuelos;
	}

	public void setKmVolados(Double kmVolados) {
		this.kmVolados = kmVolados;
	}
	
	public boolean asignarVuelo(int asientos, Double distancia) {
		
		return capacidad>asientos&&distancia>0;
		
	}
	
	public avion(String idAvion, Integer capacidad) {
		super();
		this.id = idAvion;
		this.capacidad = capacidad;
	}
	
	public avion() {
		super();
		this.id = "0";
		this.capacidad = 0;
		this.compannia = "";
		
	}
	
	public avion(String idAvion,String compannia, Integer capacidad) {
		super();
		this.id = idAvion;
		this.capacidad = capacidad;
		this.compannia = compannia;
		
	}
	public String getCompannia() {
		return compannia;
	}

	public void setCompannia(String compannia) {
		this.compannia = compannia;
	}
}