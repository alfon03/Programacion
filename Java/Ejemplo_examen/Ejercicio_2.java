package Ejercicio_2;
import java.util.Calendar;
import java.util.Scanner;

public class Ejercicio_2 {
    public static double getMaxHeartRate(int currentYear, String birthDate) {
        int birthYear = Integer.parseInt(birthDate.split("/")[2]);
        int age = currentYear - birthYear;
        double maxHeartRate = 220 - age;
        return maxHeartRate * 0.85;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el ano: ");
        int currentYear = sc.nextInt();
        System.out.print("Introduzca la fecha dfe nacimiento (dd/mm/yyyy): ");
        String birthDate = sc.next();
        double maxHeartRate = getMaxHeartRate(currentYear, birthDate);
        System.out.println("La frecuencia cardíaca máxima recomendada durante un entrenamiento cardiovascular es: " + maxHeartRate);
    }
}

