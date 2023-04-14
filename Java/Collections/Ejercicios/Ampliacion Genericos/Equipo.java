package AmpliacionGenericos;

import java.util.ArrayList;

public class Equipo<T> {
	private String nombreEquipo;
	private ArrayList<T> alumnos;

	public Equipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
		this.alumnos = new ArrayList<T>();
	}

	public void añadirAlumno(T alumno) throws Exception {
		if (alumnos.contains(alumno)) {
			throw new Exception("El alumno ya pertenece al equipo");
		}
		alumnos.add(alumno);
	}

	public void borrarAlumno(T alumno) throws Exception {
		if (!alumnos.remove(alumno)) {
			throw new Exception("El alumno no pertenece al equipo");
		}
	}

	public T buscarAlumno(T alumno) {
		int index = alumnos.indexOf(alumno);
		if (index == -1) {
			return null;
		}
		return alumnos.get(index);
	}

	public void mostrarAlumnos() {
		System.out.println("Alumnos del equipo " + nombreEquipo + ":");
		for (T alumno : alumnos) {
			System.out.println(alumno);
		}
	}

	public Equipo<T> unirEquipos(Equipo<T> otroEquipo) {
		Equipo<T> equipoUnion = new Equipo<T>(this.nombreEquipo + " y " + otroEquipo.getNombreEquipo());
		equipoUnion.alumnos.addAll(this.alumnos);
		for (T alumno : otroEquipo.alumnos) {
			if (!equipoUnion.alumnos.contains(alumno)) {
				equipoUnion.alumnos.add(alumno);
			}
		}
		return equipoUnion;
	}

	public Equipo<T> interseccionEquipos(Equipo<T> otroEquipo) {
		Equipo<T> equipoInterseccion = new Equipo<T>(this.nombreEquipo + " y " + otroEquipo.getNombreEquipo());
		for (T alumno : this.alumnos) {
			if (otroEquipo.alumnos.contains(alumno)) {
				equipoInterseccion.alumnos.add(alumno);
			}
		}
		return equipoInterseccion;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}
}