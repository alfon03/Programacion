package Diccionario_sin_Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Diccionario {
    private List<Palabra> palabras;

    public Diccionario() {
        palabras = new ArrayList<>();
    }

    // Clase interna para representar las palabras y sus significados
    private static class Palabra {
        private String palabra;
        private List<String> significados;

        public Palabra(String palabra, String significado) {
            this.palabra = palabra;
            this.significados = new ArrayList<>();
            this.significados.add(significado);
        }

        public String getPalabra() {
            return palabra;
        }

        public List<String> getSignificados() {
            return significados;
        }

        public void addSignificado(String significado) {
            significados.add(significado);
        }

        public void removeSignificado(String significado) {
            significados.remove(significado);
        }
    }

    public void agregarPalabra(String palabra, String significado) {
        boolean palabraExistente = false;
        for (Palabra p : palabras) {
            if (p.getPalabra().equalsIgnoreCase(palabra)) {
                palabraExistente = true;
                p.addSignificado(significado);
                break;
            }
        }
        if (!palabraExistente) {
            Palabra nuevaPalabra = new Palabra(palabra, significado);
            palabras.add(nuevaPalabra);
        }
    }

    public void buscarPalabra(String palabra) {
        boolean palabraEncontrada = false;
        for (Palabra p : palabras) {
            if (p.getPalabra().equalsIgnoreCase(palabra)) {
                palabraEncontrada = true;
                System.out.println("Significados de la palabra '" + p.getPalabra() + "':");
                List<String> significados = p.getSignificados();
                for (String s : significados) {
                    System.out.println("- " + s);
                }
                break;
            }
        }
        if (!palabraEncontrada) {
            System.out.println("La palabra '" + palabra + "' no se encuentra en el diccionario.");
        }
    }

    public void borrarPalabra(String palabra) {
        Palabra palabraABorrar = null;
        for (Palabra p : palabras) {
            if (p.getPalabra().equalsIgnoreCase(palabra)) {
                palabraABorrar = p;
                break;
            }
        }
        if (palabraABorrar != null) {
            palabras.remove(palabraABorrar);
            System.out.println("La palabra '" + palabra + "' ha sido borrada del diccionario.");
        } else {
            System.out.println("La palabra '" + palabra + "' no se encuentra en el diccionario.");
        }
    }

    public void listarPalabras(String cadena) {
        List<String> palabrasCoincidentes = new ArrayList<>();
        for (Palabra p : palabras) {
            if (p.getPalabra().toLowerCase().startsWith(cadena.toLowerCase())) {
                palabrasCoincidentes.add(p.getPalabra());
            }
        }
        if (!palabrasCoincidentes.isEmpty()) {
            Collections.sort(palabrasCoincidentes, Comparator.naturalOrder());
            System.out.println("Palabras que empiezan por '" + cadena + "':");
            for (String palabra : palabrasCoincidentes
            		) {
            	System.out.println("- " + palabra);
            	}
            	} else {
            	System.out.println("No hay palabras en el diccionario que empiecen por '" + cadena + "'.");
            	}
            	}
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("---------- MENÚ ----------");
            System.out.println("1. Añadir palabra");
            System.out.println("2. Buscar palabra en diccionario");
            System.out.println("3. Borrar una palabra del diccionario");
            System.out.println("4. Listado de palabras que empiecen por '...'");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la palabra: ");
                    String palabra = scanner.nextLine();
                    System.out.print("Ingrese el significado: ");
                    String significado = scanner.nextLine();
                    agregarPalabra(palabra, significado);
                    System.out.println("La palabra ha sido añadida al diccionario.");
                    break;
                case 2:
                    System.out.print("Ingrese la palabra a buscar: ");
                    palabra = scanner.nextLine();
                    buscarPalabra(palabra);
                    break;
                case 3:
                    System.out.print("Ingrese la palabra a borrar: ");
                    palabra = scanner.nextLine();
                    borrarPalabra(palabra);
                    break;
                case 4:
                    System.out.print("Ingrese la cadena de inicio: ");
                    String cadena = scanner.nextLine();
                    listarPalabras(cadena);
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }

        } while (opcion != 5);

        scanner.close();
    }

    public static void main(String[] args) {
        Diccionario diccionario = new Diccionario();
        diccionario.mostrarMenu();
    }
}