package EmpresaIt;

public interface Backend {
	public static final Double WEB_API_DB_COST = 2200.0;
	public static final Double BE_MAINTENANCE = 500.0;

	/**
	 * Calcula el coste de crear una conexion a base de datos desde el backend y
	 * crear su correspondiente API Web
	 * 
	 * @return Coste de desarrollo en backend
	 */
	public Double createWebAPIandDBConnectionCost();

	public Double maintenanceCost();
}