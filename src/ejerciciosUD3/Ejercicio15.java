package ejerciciosUD3;

public class Ejercicio15 {

    private static int invertirInterno(int n, int acumulado){
        if (n == 0)
            return acumulado;
        return invertirInterno(n / 10, acumulado * 10 + n % 10);
    }
    
    private static int invertir(int n){
        return invertirInterno(n, 0);
    }
    
    public static void main(String[] args) {
        int n = 12345;
        
        System.out.println(invertir(n));
    }

}