package ejerciciosUD3;

public class Ejercicio19 {

    private static boolean esPalindromo(String cadena){
        if (cadena.length() == 0 || cadena.length() == 1)
            return true;

        if (cadena.charAt(0) != cadena.charAt(cadena.length() - 1))
            return false;
        
        return esPalindromo(cadena.substring(1, cadena.length() - 1));
    }
    
    private static boolean esCapicua(int n){
        return esPalindromo(String.valueOf(n));
    }
    
    public static void main(String[] args) {
        int n = 123521;
        
        if (esCapicua(n))
            System.out.println("Es capicúa");
        else
            System.out.println("No es capicúa");
    }

}