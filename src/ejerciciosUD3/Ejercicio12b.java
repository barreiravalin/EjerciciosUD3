package ejerciciosUD3;

public class Ejercicio12b {

    private static byte getNumeroDigitosPrivado(int n){
        // Caso base
        if (n < 10)
            return 1;
        
        // Caso recursivo
        // En cada paso recursivo contabilizamos un dígito
        return (byte)(1 + getNumeroDigitosPrivado(n / 10));
    }
    
    private static byte getNumeroDigitos(int n){
        if (n < 0)
            return getNumeroDigitosPrivado(Math.abs(n));
        return getNumeroDigitosPrivado(n);
    }
    
    public static void main(String[] args) {
        int n = -123456789;
        
        System.out.println(getNumeroDigitos(n));
    }

}