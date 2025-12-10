package ejerciciosUD3;

import java.util.Scanner;

public class Ejercicio20 {
    /*
        Si n = 4
        1
        1 2
        1 2 3 
        1 2 3 4
    */
    
    private static void trianguloInterno(int n, int actual){
        if (actual > n)
            return;
        
        for (int i = 1; i < actual; i++) 
            System.out.print(i + " ");
        System.out.println(actual);
        
        trianguloInterno(n, actual + 1);
    }
    
    private static void triangulo(int n){
        trianguloInterno(n, 1);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Valor de N: ");
        int n = in.nextInt();
        
        triangulo(n);
    }

}