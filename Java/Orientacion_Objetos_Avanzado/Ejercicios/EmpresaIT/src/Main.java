package EmpresaIt;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BackendProgrammer backend1 = new BackendProgrammer();
		BackendProgrammer backend2 = new BackendProgrammer();

		LocalDateTime fechaAnterior = LocalDateTime.of(2002, 02, 02, 02, 02);
		LocalDateTime fechaPosterior = LocalDateTime.of(2003, 03, 01, 01, 01);

		backend1.setStartDate(fechaAnterior);
		backend2.setStartDate(fechaPosterior);

		System.out.println(backend1.compareTo(backend2));

		Plantilla plantilla1 = new Plantilla();

		System.out.println(plantilla1.consultarInfo("123456789B"));

		System.out.println(plantilla1.ordenarPlantilla());
		System.out.println(plantilla1.obtenerSalarioReal());

	}

}
