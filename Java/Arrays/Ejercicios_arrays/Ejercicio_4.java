package Arrays;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el día de la fecha: ");
        int dia = scanner.nextInt();
        System.out.print("Introduce el mes de la fecha: ");
        int mes = scanner.nextInt();
        System.out.print("Introduce el año de la fecha: ");
        int anio = scanner.nextInt();
        
        Fecha fecha = new Fecha(dia, mes, anio);
        String fechaLarga = fecha.pasarAformatoLargo();
        if (fechaLarga == null) {
            System.out.println("Fecha incorrecta");
        } else {
            System.out.println("La fecha en formato largo es " + fechaLarga);
        }
    }
}

class Fecha {
    private int dia;
    private int mes;
    private int anio;
    
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    public String pasarAformatoLargo() {
        if (!esFechaValida()) {
            return null;
        }
        
        String nombreMes = obtenerNombreMes();
        return dia + " de " + nombreMes + " de " + anio;
    }
    
    private boolean esFechaValida() {
        if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || anio < 0) {
            return false;
        }
        
        if (dia > diasEnMes()) {
            return false;
        }
        
        return true;
    }
    
    private int diasEnMes() {
        if (mes == 2) {
            if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {
                return 29;
            } else {
                return 28;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return 30;
        } else {
            return 31;
        }
    }
    
    private String obtenerNombreMes() {
        switch (mes) {
            case 1:
                return "Enero";
            case 2:
                return "Febrero";
            case 3:
                return "Marzo";
            case 4:
                return "Abril";
            case 5:
                return "Mayo";
            case 6:
                return "Junio";
            case 7:
                return "Julio";
            case 8:
                return "Agosto";
            case 9:
                return "Septiembre";
            case 10:
                return "Octubre";
            case 11:
                return "Noviembre";
            case 12:
                return "Diciembre";
            default:
                return "";
        }
    }
}