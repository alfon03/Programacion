package Arrays;


import java.util.*;
import java.util.Comparator;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_alumnos, opcion;
        String nombre;
        double nota;

        System.out.print("Introduce el número de alumnos: ");
        num_alumnos = sc.nextInt();

        String[] nombres = new String[num_alumnos];
        double[] notas = new double[num_alumnos];

        for (int i = 0; i < num_alumnos; i++) {
            System.out.print("Introduce el nombre del alumno " + (i+1) + ": ");
            nombre = sc.next();
            nombres[i] = nombre;

            System.out.print("Introduce la nota del alumno " + (i+1) + ": ");
            nota = sc.nextDouble();
            notas[i] = nota;
        }

        do {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Mostrar los alumnos aprobados");
            System.out.println("2. Mostrar los alumnos suspensos");
            System.out.println("3. Mostrar la nota media de la clase");
            System.out.println("4. Mostrar los alumnos con una nota específica");
            System.out.println("5. Mostrar el alumno con la nota máxima y mínima");
            System.out.println("6. Mostrar un listado ordenado por nota");
            System.out.println("7. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Alumnos aprobados:");
                    for (int i = 0; i < num_alumnos; i++) {
                        if (notas[i] >= 5) {
                            System.out.println(nombres[i] + ": " + notas[i]);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Alumnos suspensos:");
                    for (int i = 0; i < num_alumnos; i++) {
                        if (notas[i] < 5) {
                            System.out.println(nombres[i] + ": " + notas[i]);
                        }
                    }
                    break;
                case 3:
                    double media = 0;
                    for (int i = 0; i < num_alumnos; i++) {
                        media += notas[i];
                    }
                    media /= num_alumnos;
                    System.out.println("Nota media de la clase: " + media);
                    break;
                case 4:
                    System.out.print("Introduce la nota: ");
                    double notaBuscada = sc.nextDouble();
                    System.out.println("Alumnos con nota " + notaBuscada + ":");
                    for (int i = 0; i < num_alumnos; i++) {
                        if (notas[i] == notaBuscada) {
                            System.out.println(nombres[i] + ": " + notas[i]);
                        }
                    }
                    break;
                case 5:
                    double notaMaxima = notas[0];
                    double notaMinima = notas[0];
                    String alumnoNotaMaxima = nombres[0];
                    String alumnoNotaMinima = nombres[0];
                    for (int i = 1; i < num_alumnos; i++) {
                        if (notas[i] > notaMaxima) {
                            notaMaxima = notas[i];
                            alumnoNotaMaxima = nombres[i];
                        }
                        if (notas[i] < notaMinima) {
                            notaMinima = notas[i];
                            alumnoNotaMinima = nombres[i];
                        }
                    }
                    System.out.println("La nota maxima es : " +notaMaxima + " y el alumno es : " +alumnoNotaMaxima);
                    System.out.println("La nota minima es : " +notaMinima + " y el alumno es : " +alumnoNotaMinima);
                case 6:                    
                    System.out.println("Listado de los alumnos y sus notas dfe manera ordenada: ");  

                    for (int i = notas.length - 1; i>=0; i--) {
                    		System.out.println(nombres[i] +" - " + notas[i]);
                    }
                    
            }
        }while (opcion != 7);
    }
}