package AmpliacionGenericos;

public class Main {
	public static void main(String[] args) {
		// Crear algunos alumnos
		Alumno alumno1 = new Alumno("Herme", "12345678A");
		Alumno alumno2 = new Alumno("Juanan", "23456789B");
		Alumno alumno3 = new Alumno("Raul", "34567890C");
		Alumno alumno4 = new Alumno("Francisco José", "45678901D");
		Alumno alumno5 = new Alumno("Jesús", "56789012E");

		// Crear algunos equipos
		Equipo<Alumno> equipo1 = new Equipo<Alumno>("Equipo 1");
		Equipo<Alumno> equipo2 = new Equipo<Alumno>("Equipo  2");
		// Añadir algunos alumnos a los equipos
		try {
			equipo1.añadirAlumno(alumno1);
			equipo1.añadirAlumno(alumno2);
			equipo1.añadirAlumno(alumno3);
			equipo2.añadirAlumno(alumno2);
			equipo2.añadirAlumno(alumno3);
			equipo2.añadirAlumno(alumno4);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		// Mostrar los alumnos de los equipos
		equipo1.mostrarAlumnos();
		equipo2.mostrarAlumnos();

		// Buscar un alumno en los equipos
		Alumno alumno6 = new Alumno("Alejandra", "67890123F");
		System.out.println("Buscando a " + alumno2 + " en el equipo 1...");
		Alumno encontrado = equipo1.buscarAlumno(alumno2);
		if (encontrado != null) {
			System.out.println("Encontrado: " + encontrado);
		} else {
			System.out.println("No encontrado");
		}
		System.out.println("Buscando a " + alumno6 + " en el equipo 1...");
		encontrado = equipo1.buscarAlumno(alumno6);
		if (encontrado != null) {
			System.out.println("Encontrado: " + encontrado);
		} else {
			System.out.println("No encontrado");
		}

		// Unir dos equipos
		Equipo equipo3 = equipo1.unirEquipos(equipo2);
		System.out.println("Alumnos del equipo 3 (UNIÓN):");
		equipo3.mostrarAlumnos();

		// Intersección de dos equipos
		Equipo equipo4 = equipo1.interseccionEquipos(equipo2);
		System.out.println("Alumnos del equipo 4 (INTERSECCIÓN):");
		equipo4.mostrarAlumnos();
	}
}
