package AmpliacionEquiposDeportivos;

import java.util.*;
import java.util.stream.Collectors;

public class Equipo<T extends Jugador> {
	private List<T> jugadores;

	public Equipo() {
		this.jugadores = new ArrayList<>();
	}

	public void agregarJugador(T jugador) {
		jugadores.add(jugador);
	}

	public List<T> getJugadores() {
		return jugadores;
	}

	public List<T> jugadoresMasculinosMayoresEdadOrdenadosPorEdad() {
		return jugadores.stream().filter(j -> j.getSexo() == 'H' && j.getEdad() >= 18)
				.sorted(Comparator.comparing(Jugador::getEdad)).collect(Collectors.toList());
	}

	public boolean esExclusivamenteFemenino() {
		return jugadores.stream().anyMatch(j -> j.getSexo() == 'H') == false;
	}

	public int numeroJugadorasMayoresEdad() {
		return (int) jugadores.stream().filter(j -> j.getSexo() == 'M' && j.getEdad() >= 18).count();
	}

	public int edadMayorJugadorasMayoresEdad() {
		Optional<Integer> maxEdad = jugadores.stream().filter(j -> j.getSexo() == 'M' && j.getEdad() >= 18)
				.map(Jugador::getEdad).max(Integer::compareTo);
		return maxEdad.isPresent() ? maxEdad.get() : 0;
	}

	public Set<String> dniJugadoresMasculinosMenoresEdad() {
		return jugadores.stream().filter(j -> j.getSexo() == 'H' && j.getEdad() < 18).map(Jugador::getDni)
				.collect(Collectors.toSet());
	}

	public List<String> nombresJugadorasOrdenadosAsc() {
		return jugadores.stream().filter(j -> j.getSexo() == 'M').sorted(Comparator.comparing(Jugador::getNombre))
				.map(Jugador::getNombre).collect(Collectors.toList());
	}

	public boolean existeJugadoraMayorEdad() {
		return jugadores.stream().filter(j -> j.getSexo() == 'M' && j.getEdad() >= 18).findFirst().isPresent();
	}

	public int numeroCiudadesDiferentes() {
		return (int) jugadores.stream().map(Jugador::getCiudad).distinct().count();
	}
}