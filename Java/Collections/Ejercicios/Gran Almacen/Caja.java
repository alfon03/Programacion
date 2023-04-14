package Gran_Almacen;

import java.util.ArrayList;

class Caja {
	private int numero;
	private boolean abierta;
	private ArrayList<Cliente> clientesEnEspera;

	public Caja(int numero) {
		this.numero = numero;
		this.abierta = false;
		this.clientesEnEspera = new ArrayList<Cliente>();
	}

	public int getNumero() {
		return numero;
	}

	public boolean estaAbierta() {
		return abierta;
	}

	public boolean abrir() {
		if (!abierta) {
			abierta = true;
			return true;
		}
		return false;
	}

	public boolean cerrar() {
		if (abierta && clientesEnEspera.isEmpty()) {
			abierta = false;
			return true;
		}
		return false;
	}

	public int getNumClientesEnEspera() {
		return clientesEnEspera.size();
	}

	public void agregarCliente(Cliente cliente) {
		clientesEnEspera.add(cliente);
	}

	public Cliente atenderCliente() {
		return clientesEnEspera.remove(0);
	}
}