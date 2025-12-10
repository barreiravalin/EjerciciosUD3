package ejerciciosUD3;

public class Ejercicio16 {

    private static int sumar(int n){
        if (n < 10)
            return n;
        else
            return n % 10 + sumar(n / 10);
    }
    
    public static void main(String[] args) {
        int n = 12345;
        
        System.out.println(sumar(n));
    }
}