package MockExam2;

public class Tweet extends Publicacion {

	public Tweet(String texto, Usuario usuario) throws PublicacionesException {
		super(texto, usuario);
	}

	public boolean valorar(String valoracion) {
		boolean resultado = false;
		try {
			Valoraciones v = Valoraciones.valueOf(valoracion.toUpperCase());
			this.valoracion += v.getValoracion() * 2;
			resultado = true;
		} catch (Exception e) {

		}
		return resultado;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	protected void setTexto(String texto) throws PublicacionesException {
		if (texto.length() >= 50 && texto != null) {
			throw new PublicacionesException("El texto debe ser menor de 50");
		}
		this.texto = texto;
	}

}