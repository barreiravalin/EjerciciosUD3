package ejerciciosUD3;

import java.util.Scanner;

public class Ejercicio03 {

    private static boolean esEquilatero(int a, int b, int c){
        return a == b && b == c;
    }
    
    private static boolean esIsosceles(int a, int b, int c) {
//        int contador = 0;
//        if (a == b)
//            contador++;
//        if (a == c)
//            contador++;
//        if (b == c)
//            contador++;
//        return contador == 1;
        
        return (a == b && a != c) ||
               (a == c && a != b) ||
               (b == c && b != a);
    }
    
    private static boolean esEscaleno (int a, int b, int c){
        return a != b && b != c;
    }
    
    private static boolean esTriangulo(int a, int b, int c){
        return a + b > c &&
               b + c > a &&
               a + c > b;
    }
    
    private static String getTipoTriangulo(int a, int b, int c){
        if (esTriangulo(a, b, c)){
            if (esEquilatero(a, b, c))
                return "Equilatero";
            else if (esEscaleno(a, b, c))
                return "Escaleno";
            else
                return "Isósceles";
        } 
        return "Los lados facilitados no forman un triángulo";
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ladoA, ladoB, ladoC;
        
        System.out.print("Lado a:");
        ladoA = in.nextInt();
        System.out.print("Lado b:");
        ladoB = in.nextInt();
        System.out.print("Lado c:");
        ladoC = in.nextInt();
        
        System.out.println(getTipoTriangulo(ladoA, ladoB, ladoC));
    }

}