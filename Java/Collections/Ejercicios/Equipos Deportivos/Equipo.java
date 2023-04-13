package EquiposDeportivos;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
	private String nombre;
	private List<Alumno> alumnos;

	public Equipo(String nombre) {
		this.nombre = nombre;
		this.alumnos = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void añadirAlumno(Alumno alumno) throws Exception {
		if (alumnos.contains(alumno)) {
			throw new Exception("El alumno ya está en el equipo");
		} else {
			alumnos.add(alumno);
		}
	}

	public void borrarAlumno(Alumno alumno) throws Exception {
		if (!alumnos.remove(alumno)) {
			throw new Exception("El alumno no está en el equipo");
		}
	}

	public Alumno buscarAlumno(Alumno alumno) {
		int index = alumnos.indexOf(alumno);
		if (index == -1) {
			return null;
		} else {
			return alumnos.get(index);
		}
	}

	public void mostrarAlumnos() {
		System.out.println("Alumnos del equipo " + nombre + ":");
		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
		}
	}

	public Equipo unirEquipos(Equipo otroEquipo) {
		Equipo equipoUnido = new Equipo(nombre + " y " + otroEquipo.nombre);
		for (Alumno alumno : alumnos) {
			equipoUnido.alumnos.add(alumno);
		}
		for (Alumno alumno : otroEquipo.alumnos) {
			if (!equipoUnido.alumnos.contains(alumno)) {
				equipoUnido.alumnos.add(alumno);
			}
		}
		return equipoUnido;
	}

	public Equipo interseccionEquipos(Equipo otroEquipo) {
		Equipo equipoInterseccion = new Equipo(nombre + " y " + otroEquipo.nombre);
		for (Alumno alumno : alumnos) {
			if (otroEquipo.alumnos.contains(alumno)) {
				equipoInterseccion.alumnos.add(alumno);
			}
		}
		return equipoInterseccion;
	}
}