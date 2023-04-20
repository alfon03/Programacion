package ChatInstituto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mensaje {
	private Persona remitente;
	private Persona destinatario;
	private String texto;
	private LocalDateTime fechaHora;

	public Mensaje(Persona remitente, Persona destinatario, String texto, LocalDateTime fechaHora) {
		this.remitente = remitente;
		this.destinatario = destinatario;
		this.texto = texto;
		this.fechaHora = fechaHora;
	}

	// getters y setters
	public Persona getRemitente() {
		return remitente;
	}

	public void setRemitente(Persona remitente) {
		this.remitente = remitente;
	}

	public Persona getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(Persona destinatario) {
		this.destinatario = destinatario;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	// método toString()
	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		return "De: " + remitente.getNombre() + " Texto: " + texto + " Fecha y hora: " + fechaHora.format(formatter);
	}
}