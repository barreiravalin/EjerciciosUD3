package ejerciciosUD3;

import java.util.Scanner;

public class Ejercicio4 {

    private static boolean esVocal(char letra) {
        if (letra >= 'A' && letra <= 'Z')
            letra += 32;
        
        return letra == 'a' ||
               letra == 'e' ||
               letra == 'i' ||
               letra == 'o' ||
               letra == 'u';
    }
    
    private static boolean esConsonante(char letra) {
        return esLetra(letra) && !esVocal(letra);
    }
    
    private static boolean esLetra(char letra) {
        return (letra >= 'A' && letra <= 'Z') ||
               (letra >= 'a' && letra <= 'z');
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        char caracter = in.nextLine().charAt(0);
        
        System.out.println("Es vocal: " + esVocal(caracter));
        System.out.println("Es consonante: " + esConsonante(caracter));
    }

}