package ejerciciosUD3;

import java.util.Scanner;

public class Ejercicio5 {
    
    private static double getPorcentaje(String texto, char c){
        int contador = 0;
        
        for (int i = 0; i < texto.length(); i++) 
            if (texto.charAt(i) == c)
                contador++;
        
        return (double)(contador * 100) / texto.length();
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String texto = in.nextLine();
        
        // Inconveniente: para cada letra se recorre el texto completo
        System.out.println("a: " + getPorcentaje(texto, 'a') + "%");
        System.out.println("e: " + getPorcentaje(texto, 'e') + "%");
        System.out.println("i: " + getPorcentaje(texto, 'i') + "%");
        System.out.println("o: " + getPorcentaje(texto, 'o') + "%");
        System.out.println("u: " + getPorcentaje(texto, 'u') + "%");
    }

}