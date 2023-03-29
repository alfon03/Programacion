package EmpresaIt;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class WebDesigner extends Candidate implements Frontend {
	// CONSTRUCTOR
	public WebDesigner() {

	}

	public WebDesigner(LocalDate dateOfBirth, LocalDateTime startDate, String dni, String name, String surname,
			ContractType ct) {
		super(dateOfBirth, startDate, dni, name, surname, ct);
	}

	// METHODS
	@Override
	public Double computeGrossSalary() {
		// TODO Auto-generated method stub
		return null;
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