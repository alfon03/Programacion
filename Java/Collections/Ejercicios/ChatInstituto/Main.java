package ChatInstituto;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Alumno alumno = new Alumno("Juan", "12345678A");
        Profesor profesor = new Profesor("Pedro", "98765432B");
        String opcion = "";
        
        while (!opcion.equals("0")) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Enviar mensaje");
            System.out.println("2. Leer mensajes del buzón");
            System.out.println("3. Leer mensajes del buzón ordenados por remitente");
            System.out.println("4. Borrar mensaje");
            System.out.println("5. Buscar mensaje por texto");
            System.out.println("0. Salir");
            opcion = scanner.nextLine();
            
            switch (opcion) {
                case "1":
                    System.out.println("Enviar mensaje:");
                    System.out.println("Seleccione el remitente:");
                    System.out.println("1. Alumno");
                    System.out.println("2. Profesor");
                    String remitente = scanner.nextLine();
                    
                    if (remitente.equals("1")) {
                        System.out.println("Destinatario (dni):");
                        String dniDestinatario = scanner.nextLine();
                        Persona destinatario = Persona(dniDestinatario, profesor);
                        
                        if (destinatario != null) {
                            System.out.println("Mensaje:");
                            String textoMensaje = scanner.nextLine();
                            alumno.enviarMensaje(profesor, destinatario, textoMensaje, null);
                            System.out.println("Mensaje enviado correctamente");
                        } else {
                            System.out.println("Destinatario no encontrado");
                        }
                    } else if (remitente.equals("2")) {
                        System.out.println("Destinatario (dni):");
                        String dniDestinatario = scanner.nextLine();
                        Persona destinatario = buscarPersonaPorDni(dniDestinatario, alumno);
                        
                        if (destinatario != null) {
                            System.out.println("Mensaje:");
                            String textoMensaje = scanner.nextLine();
                            profesor.enviarMensaje(profesor, destinatario, textoMensaje, null);
                            System.out.println("Mensaje enviado correctamente");
                        } else {
                            System.out.println("Destinatario no encontrado");
                        }
                    } else {
                        System.out.println("Opción no válida");
                    }
                    
                    break;
                case "2":
                    System.out.println("Mensajes recibidos:");
                    String mensajesBuzon = alumno.leerMensajes();
                    
                    if (mensajesBuzon.isEmpty()) {
                        System.out.println("No tiene mensajes");
                    } else {
                        System.out.println(mensajesBuzon);
                    }
                    
                    break;
                case "3":
                    System.out.println("Mensajes recibidos (ordenados por remitente):");
                    String mensajesOrdenados = alumno.leerMensajesOrdenados();
                    
                    if (mensajesOrdenados.isEmpty()) {
                        System.out.println("No tiene mensajes");
                    } else {
                        System.out.println(mensajesOrdenados);
                    }
                    
                    break;
                case "4":
                    System.out.println("Borrar mensaje:");
                    System.out.println("Número de mensaje:");
                    int numeroMensaje = Integer.parseInt(scanner.nextLine());
                    
                    try {
                        alumno.borrarMensaje(numeroMensaje);
                        System.out.println("Mensaje borrado correctamente");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Número de mensaje no válido");
                    }
                    
                    break;
                case "5":
                    System.out.println();
                
                case "0":
                	System.out.println("Saliendo del programa...");
            }
        }
    }
}
                    
                    
                    
                    
                    
  