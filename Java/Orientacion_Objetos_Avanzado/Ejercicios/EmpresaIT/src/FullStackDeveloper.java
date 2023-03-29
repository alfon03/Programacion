package EmpresaIt;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class FullStackDeveloper extends Candidate implements Backend, Frontend {
	// CONSTRUCTOR

	public FullStackDeveloper() {
		super();
	}

	public FullStackDeveloper(LocalDate dateOfBirth, LocalDateTime startDate, String dni, String name, String surname,
			ContractType ct) {
		super(dateOfBirth, startDate, dni, name, surname, ct);
	}

	// METHODS
	@Override
	public Double createWebAPIandDBConnectionCost() {

		return 0.0;
	}

	@Override
	public Double computeGrossSalary() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double maintenanceCost() {

		return 0.0;
	}

	@Override
	public Double computeWebDesignCost() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double computeFEMaintenanceCost() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String obtenerClase() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName();
	}

}
