package Examen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int numeroDePlatos = 10; 
		
		boolean toggle = true; 
		
		String opc;	
		
		Plato[] lsPlatos = new Plato[numeroDePlatos];
	
		for (int i = 0;i<lsPlatos.length;i++) {
			lsPlatos[i] = new Plato("Plato vacío");
		}
		

		int contador = 0;
	
		
		while (toggle == true) {
			
			try {
				
			System.out.println("1- Dar de alta un plato \n"
							 + "2- Modificar precio \n"
							 + "3- Asignar un vino a un plato \n"
							 + "4- Mostrar información de un plato \n"
							 + "5- Mostrar información de todos los platos \n"
							 + "6- Salir");
			opc = sc.nextLine();
			
			
			if (opc.equals("1")) {	

					if (contador < lsPlatos.length) {
						System.out.println("Nombre del plato: ");
						String nombrePlato = sc.nextLine();
						
						for (int i=0;i<lsPlatos.length;i++) {
							if (nombrePlato.equals(lsPlatos[i].getNombre())) {
								throw new PlatoExcepcion("[ERROR] Plato ya creado");
							}
						}
						
						lsPlatos[contador] = new Plato(nombrePlato);
						
						
						
						contador++;
					}else {
						throw new PlatoExcepcion("[ERROR] No se puede crear el plato");
					}					

			
			}
			else if (opc.equals("2")) { 
				System.out.println("¿A qué plato quieres cambiar el precio?");
				String busqueda = sc.nextLine();
				
				
				for (int i =0;i<lsPlatos.length;i++) {
					
						if (busqueda.equals(lsPlatos[i].getNombre())) {
							System.out.println("Nuevo precio: ");
							lsPlatos[i].setPrecio(Double.valueOf(sc.nextLine()));
						}
						else {
							throw new PlatoExcepcion("[ERROR]No existe el plato");
						}
					
				}
			}
			else if (opc.equals("3")) { 
				System.out.println("¿A qué plato quieres asignar un vino?");
				String busqueda = sc.nextLine();

				
				for (int i =0;i<lsPlatos.length;i++) {

						if (busqueda.equals(lsPlatos[i].getNombre())) {
							System.out.println("Nombre del vino: ");
							String nombreVino = sc.nextLine();
							System.out.println("Graduación del vino: ");
							Double gradoVino = Double.valueOf(sc.nextLine());

							lsPlatos[i].setVinoRecomendado(nombreVino, gradoVino);
						}
						else {
							throw new PlatoExcepcion("[ERROR]No existe el plato");
						}

				}
			}
			else if (opc.equals("4")) {	
			System.out.println("¿Qué plato estás buscando?");
			String busqueda = sc.nextLine();
			
			for (int i =0;i<lsPlatos.length;i++) {
				
					if (busqueda.equals(lsPlatos[i].getNombre())) {
						System.out.println(lsPlatos[i].toString());
					}
					else {
						throw new PlatoExcepcion("[ERROR]No existe el plato");
					}

			}
			
			}
			else if (opc.equals("5")) {	
				System.out.println("Mostrando platos...");
				for (int i =0;i<lsPlatos.length;i++) {
					System.out.println(lsPlatos[i].toString());
				}
				
			}
			else if (opc.equals("6")) {	
				toggle = false;
			}
			
			}
			catch (PlatoExcepcion msg) {
				System.out.println(msg);
			}
			
		}
			
	}

}