package ejerciciosUD3;

public class Ejercicio11 {

// Es la solución pedida, pero es ineficiente.
    
//    private static boolean esPerfecto(int n){
//        int suma = 1;
//        for (int i = 2; i < n; i++) 
//            if (n % i == 0)
//                suma += i;
//        
//        return suma == n;
//    }
    
    private static boolean esPerfecto(int n){
        int suma = 1;
        
        for (int i = 2; i * i < n ; i++) {
            if (n % i == 0){
                suma += i;
                if (i != n / i)
                    suma += n / i;
            }
        }
        
        return n != 1 && suma == n;
    }
    
    public static void main(String[] args) {
        final int MAX = 5;
        int n = 1;
        int contador = 0;
        
        while (contador < MAX){
            if (esPerfecto(n)){
                contador++;
                System.out.println(n);
            }
            n++;
        }
        
        
    }

}