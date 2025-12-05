package ejerciciosUD3;

import java.util.Scanner;

public class Ejercicio08 {
    
    private static int getLongitud(int n){
        int longitud = 0;
        
        if (n == 0)
            return 1;
        
        while (n != 0){
            n /= 10;
            longitud++;
        }
        
        return longitud;
    }
    
    private static boolean todosDigitosImpares(int n){
        byte unidades;
        
        while (n != 0){
            unidades = (byte) (n % 10);
            if (unidades % 2 == 0)
                return false;
            n /= 10;
        }
        
        return true;
    }
    
    private static int invertir(int n){
        byte unidades;
        int nuevo = 0;
        
        while (n != 0){
            unidades = (byte)(n % 10);
            nuevo = nuevo * 10 + unidades;
            n /= 10;
        }
        
        return nuevo;
    }
    
    private static boolean esReversible(int n){
        int invertido = invertir(n);
        
        if (getLongitud(n) == getLongitud(invertido)){
            int suma = n + invertido;
            return todosDigitosImpares(suma);
        } else
            return false;
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("¿Cuántos números reversibles quieres encontrar? ");
        int max = in.nextInt();
        int contador = 0;
        int n = 0;
        
        while (contador < max) {
            if (esReversible(n)){
                System.out.println(n);
                contador++;
            }
            n++;
        }
    }
}