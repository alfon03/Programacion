package Persona;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

import Persona.Genero;
import Persona.Persona;

public class PrincipalUI {

	public static void main(String[] args) {

		
		/*do {
			try {
				System.out.println("Introduce género: ");
				String generoString = sc.nextLine();
				genero = genero.valueOf(generoString.toUpperCase());
			}catch(Exception exception) {
				System.out.println("Genero introducido incorrecto. (HOMBRE/MUJER)");
			}
			
		}while(genero == null);*/
		/*
		do {
			try {
				System.out.println("Introduce el año de la fecha: ");
				int annio = Integer.valueOf(sc.nextLine());
				System.out.println("Introduce el mes de la fecha: ");
				int mes = Integer.valueOf(sc.nextLine());
				System.out.println("Introduce el dia de la fecha: ");
				int dia = Integer.valueOf(sc.nextLine());	
				fechaNacimiento = LocalDate.of(annio, mes, dia);
			}catch(Exception exception) {
				System.out.println("La fecha introducida es incorrecta");
			}
		}while(fechaNacimiento == null);*/
		
		LocalDate fechaNacimiento = LocalDate.of(1956, 12, 3);
		System.out.println(fechaNacimiento);
		Genero generoIntroducido = Genero.HOMBRE;
	    Persona antonio = new Persona("Antonio", "Sanchez", Genero.HOMBRE, fechaNacimiento);
	    Persona juan = new Persona("Juan", "Sanchez", Genero.HOMBRE, fechaNacimiento.plusYears(1));
	    Persona manuel = new Persona("Manuel", "Sanchez", Genero.HOMBRE, fechaNacimiento.plusYears(-5));
	    Persona pepa = new Persona("Pepa", "Sanchez", Genero.MUJER, fechaNacimiento.plusYears(7));


		Persona[] grupo = new Persona[4];
		grupo[0] = antonio;
		grupo[1] = juan;
		grupo[2] = manuel;
		grupo[3] = pepa;

		System.out.println(Arrays.toString(grupo));
		
		Arrays.sort(grupo);
		
		System.out.println(Arrays.toString(grupo));
		
		System.out.println(juan);
		System.out.println(juan.getEdad());
		
		
	}

}
