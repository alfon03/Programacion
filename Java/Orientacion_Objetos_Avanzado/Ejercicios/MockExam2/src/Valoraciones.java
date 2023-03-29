package MockExam2;

public enum Valoraciones {
	ULTRABUENA(5), DEMASIADOBUENA(4), SUPERBUENA(3), MUYBUENA(2), BUENA(1), NORMAL(0), REGULAR(-1), MUYMALA(-2),
	DEMASIADAMALA(-3), ULTRAMALA(-4);

	private int valoracion;

	private Valoraciones(int valoracion) {
		this.valoracion = valoracion;
	}

	public int getValoracion() {
		return valoracion;
	}

}