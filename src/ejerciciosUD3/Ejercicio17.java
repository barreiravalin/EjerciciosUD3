package ejerciciosUD3;

public class Ejercicio17 {

    private static int mcd(int a, int b){
        if (b == 0)
            return a;
        
        return mcd(b, a % b);
    }
     
    private static int mcd_iterativo(int a, int b){
        int resto;
        while (b != 0) {
            resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }
    
//  Restricciones del enunciado:
//            
//    private static int mcd (int m, int n){
//        if (n <= m && m % n == 0)
//            return n;
//        
//        if (m < n)
//            return mcd(n, m);
//        
//        return mcd(n, m % n);
//    }
    
    public static void main(String[] args) {
        /*  18, 24 -> 6
            100, 85 -> 5
            36, 48 -> 12
            81, 27 -> 27
            49, 21 -> 7
            14, 28 -> 14
            54, 24 -> 6
            120, 45 -> 15
            33, 44 -> 11
            270, 192 -> 6
        */
        int a = 33;
        int b = 44;
        System.out.println(mcd(a, b));
    }

}