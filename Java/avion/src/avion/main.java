package avion;
import java.util.Scanner;
public class main {

		static avion a1 = new avion();
		
		public static void main(String[] args) {

			String id="";
			int capacidad=0;
			String compania="";
			String menu1;
			Scanner sc = new Scanner(System.in);
			
			do {
				System.out.println("""
					1. Crear avion solo con el identificador.
					2. Crear avion con el identificador y la compañia
					3. Salir""");
				menu1=sc.nextLine();
				switch (menu1) {
				
				case "1" -> {
					System.out.println("Introduzca identificador");
					id = sc.nextLine();
					System.out.println("Introduzca capacidad de nuevo avion");
					capacidad = Integer.parseInt( sc.nextLine());
				}
				
				case "2" -> {
					
					System.out.println("Introduzca identificador");
					id = sc.nextLine();
					System.out.println("Introduzca compañia a la que pertenece");
					compania = sc.nextLine();
					System.out.println("Introduzca capacidad de nuevo avion");
					capacidad = Integer.parseInt( sc.nextLine());
					
				}
				
				}
				
				
				
			}while (!menu1.equals("3"));
			avion a1 = new avion(id,compania,capacidad);
			
			System.out.println("----_____MenU______----");

			String menu2;
			
			do {
				System.out.println("""
					
					a) Asignar Vuelo\
					
					b) Obtener el numero de vuelos\
					
					c) Obtener el numero de kilometros\
					
					d) Obtener la media de kilometros por vuelo\
					
					e) Cambio de compañia\
					
					f) Mostrar informacion del avion\
					
					g) Salir""");
				
				menu2=sc.nextLine().toLowerCase();
				
				switch (menu2) {
				
				case "a" ->{
					System.out.println("¿Cuantos asientos estaran ocupados?");
					int asientos = Integer.parseInt(sc.nextLine());
					System.out.println("Distancia del viaje");
					Double distancia = Double.parseDouble(sc.nextLine());
					if (a1.asignarVuelo(asientos, distancia)) {
						a1.setKmVolados(a1.getKmVolados()+distancia);
						a1.setNumVuelos(a1.getNumVuelos()+1);
						
					}
					
					
				}
				case "b" -> System.out.println("El avion ha realizado "+ a1.getNumVuelos()+ " vuelos.");
					
				case "c" -> System.out.println("El avion ha recorrido "+ a1.getKmVolados()+"Kms");
				case "d" -> System.out.println("La media recorrida del avion es "+ a1.getMediaKm()+"Kms");
				case "e" -> {
					System.out.println("Introduce nueva compañia del avion");
					compania = sc.nextLine();
					a1.setCompannia(compania);
				}
				case "f" -> System.out.println("Avion con id: "+a1.getIdAvion()+" de la compañia "
						+a1.getCompannia()+" ha realizado "+a1.getNumVuelos()+" vuelos, con un total de "
								+ a1.getKmVolados() +" kms y una media de "+ a1.getMediaKm()+" kms por vuelo.");
				
				}
				
			}while (!menu2.equals("g"));
				
			
			
			
			
		}

}
