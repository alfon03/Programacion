package Ejercicio_1;

import java.util.Scanner;

public class Ejercicio_1 {
	
	public static final int 		PRECIO_ENTRADA_GENERAL 					= 8;
	public static final int 		PRECIO_ENTRADA_DIA_ESPECTADOR 			= 5;
	public static final int 		PRECIO_ENTRADA_DIA_PAREJA 				= 11;
	public static final double 		DESCUENTO_APLICABLE						= 0.1;
	public static final String		DIAS_SEMANA								= "LMXJVSD";
	public static final String		POSEE_TARJETA							= "SN";

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int entradas 	 = -1;
		float precio = 0.0f;
		String diaSemana = "";
		String tarjeta   = "";
		
		while(entradas!=0) {
			
			do {
				System.out.println("Número de entradas: ");
				entradas = Integer.valueOf(sc.nextLine());
			}while(entradas < 0);
			
			if(entradas!=0) {
				
				do {
					System.out.println("Día de la semana (L,M,X,J,V,S,D): ");
					diaSemana=sc.nextLine().toUpperCase();
				}while(DIAS_SEMANA.indexOf(diaSemana)==-1);
				
				do {
					System.out.println("¿Tienes tarjeta CineJacaranda(S/N)?: ");
					tarjeta = sc.nextLine().toUpperCase();
				}while(POSEE_TARJETA.indexOf(tarjeta)==-1);
				
				if(diaSemana.equalsIgnoreCase("X")) {
					precio = entradas * PRECIO_ENTRADA_DIA_ESPECTADOR;
				}else if (diaSemana.equalsIgnoreCase("J")) {
					
					precio = ((int)(entradas/2))*PRECIO_ENTRADA_DIA_PAREJA + (entradas%2 *PRECIO_ENTRADA_GENERAL);
						/*
						if(entradas%2==0) {
							precio = ((int)(entradas/2))*PRECIO_ENTRADA_DIA_PAREJA;
						}else {
							precio = ((int)(entradas/2))*PRECIO_ENTRADA_DIA_PAREJA + PRECIO_ENTRADA_GENERAL;
						}*/
					
				}else {
					precio = entradas * PRECIO_ENTRADA_GENERAL;
				}
				
				
				//precio *= (tarjeta.equals("S"))? precio*(1-DESCUENTO_APLICABLE): 1;
				if(tarjeta.equals("S")) {
					precio*= (1-DESCUENTO_APLICABLE);
				}
				
				System.out.printf("\nEl precio de las entradas es %s \n", precio);
			}
		}
		
	}
	public class Ejercicio_2 {
		
		
		
		public static final double ENTRADA_GENERAL 				= 8;
		public static final double ENTRADA_PAREJA  				= 11;
		public static final double ENTRADA_DIA_ESPECTADOR  		= 5;
		public static final double DESCUENTO_TARJETA_JACARANDA	= 0.10;
		public static final String DIAS_SEMANA					= "LMXJVSD";
		public static final String POSEE_TARJETA				= "SN";

		
		public static void main(String[] args) {
			
			
			Scanner sc = new Scanner(System.in);
			int entradas = -1;
			double precioFinal = 0.0;
			
			while(entradas!=0) {
				
				do {
					System.out.println("Número de entradas: ");
					entradas = Integer.valueOf(sc.nextLine());
				}while(entradas<0);
				
				String dia = "";
				do {
					System.out.println("Día de la semana (L,M,X,J,V,S,D):");
					dia = sc.nextLine();
				}while(DIAS_SEMANA.toLowerCase().indexOf(dia.toLowerCase())==-1);
				
				
				String poseeTarjeta = "";
				do {
					System.out.println("¿Tienes tarjeta CineJacaranda(S/N)?:");
					poseeTarjeta = sc.nextLine();
				}while(POSEE_TARJETA.indexOf(poseeTarjeta)==-1);
				
				
				/*
							if(entradas%2==0) {
								precioFinal=((int)(entradas/2))*ENTRADA_PAREJA;
							}else {
								precioFinal=((int)(entradas/2))*ENTRADA_PAREJA+ENTRADA_GENERAL;
							}
				 */
				if(dia.equalsIgnoreCase("J")) {//Día de la pareja
					precioFinal=((int)(entradas/2))*ENTRADA_PAREJA;
					precioFinal+=(entradas%2)*ENTRADA_GENERAL;
					
				}else if(dia.equalsIgnoreCase("X")){//Día del espectador
					precioFinal=entradas*ENTRADA_DIA_ESPECTADOR;
				}else {
					precioFinal=entradas*ENTRADA_GENERAL;
				}
				
				if(poseeTarjeta.equalsIgnoreCase("s")) {
					//precioFinal=(precioFinal-DESCUENTO_TARJETA_JACARANDA*precioFinal);
					precioFinal*=(1-DESCUENTO_TARJETA_JACARANDA);
				}
				System.out.printf("El precio final es %s", precioFinal);
			}
		}
		
		

	}
	


}
