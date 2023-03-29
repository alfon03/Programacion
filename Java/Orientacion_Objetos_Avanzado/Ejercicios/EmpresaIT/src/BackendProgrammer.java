package EmpresaIt;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BackendProgrammer extends Candidate implements Backend {
	// CONSTRUCTOR
	public BackendProgrammer() {
		super();
	}

	public BackendProgrammer(LocalDate dateOfBirth, LocalDateTime startDate, String dni, String name, String surname,
			ContractType ct) {
		super(dateOfBirth, startDate, dni, name, surname, ct);
	}

	// METHODS
	@Override
	public Double createWebAPIandDBConnectionCost() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double maintenanceCost() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double computeGrossSalary() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String obtenerClase() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName();
	}

}