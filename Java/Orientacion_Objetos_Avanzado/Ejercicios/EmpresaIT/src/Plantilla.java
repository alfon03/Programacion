package EmpresaIt;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class Plantilla {

	private Candidate[] trabajadores;

	public Candidate[] getTrabajadores() {
		return trabajadores;
	}

	public void setTrabajadores(Candidate[] trabajadores) {
		this.trabajadores = trabajadores;
	}

	public Plantilla() {
		int posicion = 0;
		trabajadores = new Candidate[11];
		// 3 desarrolladores web, 1 a tiempo parcial
		Candidate c1 = new WebDesigner(LocalDate.of(1990, 12, 01), LocalDateTime.of(1980, 12, 3, 0, 0, 0), "123456789Ñ",
				"Jose Manuel", "Sevillano", ContractType.FULLTIME);

		c1.setCt(ContractType.PARTIAL);
		trabajadores[posicion++] = c1;

		Candidate c2 = new WebDesigner(LocalDate.of(1992, 12, 05), LocalDateTime.of(1981, 11, 3, 0, 0, 0), "123456789L",
				"Jose Manuel", "Gómez", ContractType.FULLTIME);

		c2.setCt(ContractType.FULLTIME);
		trabajadores[posicion++] = c2;

		Candidate c3 = new WebDesigner(LocalDate.of(1993, 12, 05), LocalDateTime.of(1979, 07, 3, 0, 0, 0), "123456789V",
				"Jose", "Bombo", ContractType.FULLTIME);

		c3.setCt(ContractType.FULLTIME);
		trabajadores[posicion++] = c3;

		// 6 desarrolladores backend

		Candidate b1 = new BackendProgrammer(LocalDate.of(1983, 12, 05), LocalDateTime.of(1979, 06, 3, 0, 0, 0),
				"73483236P", "Jose Manuel", "Almerta", ContractType.PARTIAL);

		b1.setCt(ContractType.PARTIAL);
		trabajadores[posicion++] = b1;

		Candidate b2 = new BackendProgrammer(LocalDate.of(1985, 05, 05), LocalDateTime.of(1978, 11, 3, 0, 0, 0),
				"123456789Q", "Alejandra", "Mensaque", ContractType.PARTIAL);

		b2.setCt(ContractType.PARTIAL);
		trabajadores[posicion++] = b2;

		Candidate b3 = new BackendProgrammer(LocalDate.of(1986, 12, 05), LocalDateTime.of(1981, 02, 3, 0, 0, 0),
				"123456789Y", "Dario", "Conde", ContractType.FULLTIME);

		b3.setCt(ContractType.FULLTIME);
		trabajadores[posicion++] = b3;

		Candidate b4 = new BackendProgrammer(LocalDate.of(1997, 07, 05), LocalDateTime.of(1980, 05, 3, 0, 0, 0),
				"123456789S", "Ana", "Romero", ContractType.FULLTIME);

		b4.setCt(ContractType.FULLTIME);
		trabajadores[posicion++] = b4;

		Candidate b5 = new BackendProgrammer(LocalDate.of(2000, 12, 05), LocalDateTime.of(1980, 06, 3, 0, 0, 0),
				"123456789B", "Mohammed", "", ContractType.FULLTIME);

		b5.setCt(ContractType.FULLTIME);
		trabajadores[posicion++] = b5;

		Candidate b6 = new BackendProgrammer(LocalDate.of(1999, 12, 05), LocalDateTime.of(1992, 03, 3, 0, 0, 0),
				"123456789W", "Ivan", "Mejias", ContractType.FULLTIME);

		b6.setCt(ContractType.FULLTIME);
		trabajadores[posicion++] = b6;

		// 2 full stack
		Candidate fs1 = new FullStackDeveloper(LocalDate.of(1978, 12, 05), LocalDateTime.of(2004, 06, 1, 0, 0, 0),
				"123456789U", "Manuel Jesus", "Garrido", ContractType.FULLTIME);

		fs1.setCt(ContractType.FULLTIME);
		trabajadores[posicion++] = fs1;

		Candidate fs2 = new FullStackDeveloper(LocalDate.of(1997, 12, 05), LocalDateTime.of(1983, 07, 3, 0, 0, 0),
				"123456789X", "Josemi", "Cabrera", ContractType.FULLTIME);

		fs2.setCt(ContractType.FULLTIME);
		trabajadores[posicion++] = fs2;


	}

	public Integer getTamanno() {
		Integer tamanno = trabajadores.length;
		return tamanno;
	}

	public static String consultaInformacion(String dni, Plantilla plantilla) {
		String resultado = "No contiene DNI";
		if (dni != null && plantilla != null) {
			for (int i = 0; i < plantilla.getTamanno(); i++) {
				if (dni.equals(plantilla.getTrabajadores()[i].getDni())) {
					resultado = "Contiene DNI";
				}
			}
		}
		return resultado;
	}

	public String consultarInfo(String dni) {
		String resultado = "No hay coincidencias";
		if (dni != null && trabajadores != null) {
			for (int i = 0; i < trabajadores.length; i++) {
				if (dni.equals(getTrabajadores()[i].getDni())) {
					resultado = "Existen coincidencias, contiene DNI " + getTrabajadores()[i].toString();
				}

			}

		}
		return resultado;
	}

	public String ordenarPlantilla() {
		int contarNoNulos = 0;
		for (int j = 0; j < trabajadores.length; j++) {
			if (trabajadores[j] != null) {
				contarNoNulos++;
			}
		}

		Candidate[] trabajadores2 = new Candidate[contarNoNulos];

		int contador = 0;
		for (int i = 0; i < trabajadores.length; i++) {
			if (trabajadores[i] != null) {
				trabajadores2[contador++] = trabajadores[i];
			}
		}

		Arrays.sort(trabajadores2);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < trabajadores2.length; i++) {
			if (trabajadores2[i] != null) {
				sb.append(trabajadores2[i] + "\n");
			}
		}

		return sb.toString();

	}

	public static void ImprimirArrays(Plantilla[] lista) {
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	}

	public Double obtenerSalarioReal() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Indica los años de experiencia: ");
		double resultado = 0.0;
		int opciones2 = sc.nextInt();
		resultado = calcularExperiencia(opciones2, obtenerSalario());

		return resultado;
	}

	public Double obtenerSalario() {
		int costoMF = 700;
		int costoMB = 500;
		int costoDB = 2200;
		int costoDF = 2100;
		double parcial = 0.33;
		Scanner sc = new Scanner(System.in);
		System.out.println("Indica que tarea realiza m = mantenimiento/ d = desarrollo");
		String opciones = sc.nextLine();
		System.out.println("Indica que trabajo realiza f = frontend/ b = backend");
		String opciones3 = sc.nextLine();
		System.out.println("Indica el tipo de contrato p = parcial/ f = fulltime");
		String opciones4 = sc.nextLine();
		double incremento1 = 0.05;
		double resultado = 0.0;

		if (opciones.equalsIgnoreCase("m") && opciones3.equalsIgnoreCase("f") && opciones4.equalsIgnoreCase("p")) {
			resultado = (costoMF - (costoMF * parcial));
		} else if (opciones.equalsIgnoreCase("m") && opciones3.equalsIgnoreCase("b")
				&& opciones4.equalsIgnoreCase("p")) {
			resultado = (costoMB - (costoMB * parcial));
		} else if (opciones.equalsIgnoreCase("m") && opciones3.equalsIgnoreCase("f")
				&& opciones4.equalsIgnoreCase("f")) {
			resultado = costoMF;
		} else if (opciones.equalsIgnoreCase("m") && opciones3.equalsIgnoreCase("f")
				&& opciones4.equalsIgnoreCase("f")) {
			resultado = costoMB;
		} else if (opciones.equalsIgnoreCase("d") && opciones3.equalsIgnoreCase("b")
				&& opciones4.equalsIgnoreCase("p")) {
			resultado = (costoDB - (costoDB * parcial));
		} else if (opciones.equalsIgnoreCase("d") && opciones3.equalsIgnoreCase("f")
				&& opciones4.equalsIgnoreCase("p")) {
			resultado = (costoDF - (costoDF * parcial));
		} else if (opciones.equalsIgnoreCase("d") && opciones3.equalsIgnoreCase("b")
				&& opciones4.equalsIgnoreCase("f")) {
			resultado = costoDB;
		} else if (opciones.equalsIgnoreCase("d") && opciones3.equalsIgnoreCase("f")
				&& opciones4.equalsIgnoreCase("f")) {
			resultado = costoDF;
		}

		return resultado;
	}

	public double calcularExperiencia(int annos, double salariobase) {
		double incremento = 0.05;
		double incrementoReal = incremento * annos;
		double resultado = 0.0;
		if (annos > 0) {
			resultado = (salariobase * incrementoReal) + salariobase;
		}
		return resultado;
	}

}