package ejerciciosUD3;

public class Ejercicio12a {

    private static byte getNumeroDigitos(int n){
        // Caso base
        if (n < 10)
            return 1;
        // Caso recursivo
        // En cada paso recursivo contabilizamos un dígito
        return (byte)(1 + getNumeroDigitos(n / 10));
    }
    /*
    123 
    
        1 + getnumeroDigitos(12)
                1 + getNumeroDigitos(1)
                        1
    */
    public static void main(String[] args) {
        int n = 123456789;
        
        System.out.println(getNumeroDigitos(n));
    }

}