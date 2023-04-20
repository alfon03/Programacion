package ChatInstituto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class Persona {
	protected String nombre;
	protected String DNI;
	protected List<Mensaje> buzon = new ArrayList<>();

	public Persona(String nombre, String DNI) {
		this.nombre = nombre;
		this.DNI = DNI;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDNI() {
		return DNI;
	}

	public void enviarMensaje(Persona remitente, Persona destinatario, String texto, LocalDateTime fechaHora) {
		if (this instanceof Alumno) {
			Alumno alumno = (Alumno) this;
			if (alumno.esMenorDeEdad() && !(destinatario instanceof Profesor)) {
				System.out.println("Error: un alumno menor de edad solo puede enviar mensajes a profesores.");
				return;
			}
		}
		Mensaje mensaje = new Mensaje (remitente, destinatario, texto, fechaHora);
		destinatario.buzon.add(mensaje);
	}

	public String leerMensajes() {
		if (buzon.isEmpty()) {
			return "No tienes mensajes en el buzón.";
		}
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < buzon.size(); i++) {
			builder.append("Mensaje ").append(i + 1).append(": ").append(buzon.get(i)).append("\n");
		}
		return builder.toString();
	}

	public String leerMensajesOrdenados() {
		if (buzon.isEmpty()) {
			return "No tienes mensajes en el buzón.";
		}
		List<Mensaje> mensajesOrdenados = new ArrayList<>(buzon);
		mensajesOrdenados.sort(Comparator.comparing(m -> m.getRemitente().getNombre()));
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < mensajesOrdenados.size(); i++) {
			builder.append("Mensaje ").append(i + 1).append(": ").append(mensajesOrdenados.get(i)).append("\n");
		}
		return builder.toString();
	}

	public void borrarMensaje(int numeroMensaje) throws IndexOutOfBoundsException {
		if (numeroMensaje < 1 || numeroMensaje > buzon.size()) {
			throw new IndexOutOfBoundsException("No existe el mensaje con número " + numeroMensaje);
		}
		buzon.remove(numeroMensaje - 1);
	}

	public String buscarMensajes(String frase) {
		List<Mensaje> mensajesCoincidentes = new ArrayList<>();
		for (Mensaje mensaje : buzon) {
			if (mensaje.getTexto().contains(frase)) {
				mensajesCoincidentes.add(mensaje);
			}
		}
		if (mensajesCoincidentes.isEmpty()) {
			return "No hay mensajes en tu buzón que contengan la frase \"" + frase + "\".";
		}
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < mensajesCoincidentes.size(); i++) {
			builder.append("Mensaje ").append(i + 1).append(": ").append(mensajesCoincidentes.get(i)).append("\n");
		}
		return builder.toString();
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", DNI: " + DNI;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof Persona)) {
			return false;
		}
		Persona persona = (Persona) obj;
		return DNI.equals(persona.getDNI());
	}
}