package Arrays;

import java.util.Scanner;

public class Ejercicio_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] contador = new int[26]; 
        String letras = "abcdefghijklmnopqrstuvwxyz"; 

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine().toLowerCase(); 
        
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);

     
            int indice = letras.indexOf(letra);
            if (indice != -1) {
                contador[indice]++; 
            }
        }

     
        for (int i = 0; i < letras.length(); i++) {
            if (contador[i] > 0) {
                System.out.println(letras.charAt(i) + ": " + contador[i]);
            }
        }
    }

}