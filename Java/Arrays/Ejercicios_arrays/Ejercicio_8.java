package Arrays;


import java.util.Arrays;
import java.util.Scanner;

class Refran {
    private String frase;

    public Refran(String frase) {
        this.frase = frase;
    }

    public String getFrase() {
        return frase;
    }

    public String toString() {
        return frase;
    }
}

class Refranes {
    private Refran[] refranes;
    private int numRefranes;

    public Refranes() {
        refranes = new Refran[50];
        numRefranes = 0;
    }

    public void guardarRefran(String frase) {
        if (numRefranes == 50) {
            System.out.println("Error: se ha alcanzado el máximo de refranes");
            return;
        }

        for (int i = 0; i < numRefranes; i++) {
            if (frase.equalsIgnoreCase(refranes[i].getFrase())) {
                System.out.println("Error: el refrán ya existe");
                return;
            }
        }

        Refran refran = new Refran(frase);
        refranes[numRefranes] = refran;
        numRefranes++;
    }

    public void buscarRefran(String palabra) {
        for (int i = 0; i < numRefranes; i++) {
            if (refranes[i].getFrase().toLowerCase().contains(palabra.toLowerCase())) {
                System.out.println("El refrán que contiene la palabra '" + palabra + "' es:");
                System.out.println(refranes[i]);
                return;
            }
        }

        System.out.println("Error: no se ha encontrado ningún refrán que contenga la palabra '" + palabra + "'");
    }

    public void listarRefranes() {
        if (numRefranes == 0) {
            System.out.println("No hay refranes guardados");
            return;
        }

        Refran[] copiaRefranes = Arrays.copyOf(refranes, numRefranes);
        Arrays.sort(copiaRefranes, (a, b) -> a.getFrase().compareToIgnoreCase(b.getFrase()));

        System.out.println("Listado de refranes:");
        for (Refran refran : copiaRefranes) {
            System.out.println(refran);
        }
    }
}

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Refranes refranes = new Refranes();

        int opcion = 0;
        while (opcion != 4) {
            System.out.println("Menú:");
            System.out.println("1. Guardar un refrán");
            System.out.println("2. Buscar un refrán que contenga una palabra");
            System.out.println("3. Listar refranes");
            System.out.println("4. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el refrán: ");
                    String frase = scanner.nextLine();
                    refranes.guardarRefran(frase);
                    break;

                case 2:
                    System.out.print("Ingrese la palabra a buscar: ");
                    String palabra = scanner.nextLine();
                    refranes.buscarRefran(palabra);
                    break;

                case 3:
                    refranes.listarRefranes();
                    break;
            }
        }
    }
}