package ejerciciosUD3;

public class Ejercicio18 {
//    private static String invertir (String cadena){
//        String res = "";
//        
//        for (int i = cadena.length() - 1; i >= 0; i--) 
//            res += cadena.charAt(i);
//        
//        return res;
//    }
    
//    private static boolean esPalindromo(String cadena){
//        StringBuilder sb = new StringBuilder();
//        String inverso = sb.append(cadena).reverse().toString();
//        
//        return inverso.equals(cadena);
//        
//    }
//    private static boolean esPalindromoIterativo(String cadena){
//        int i = 0;  // Índice por la izquierda
//        int j = cadena.length() - 1; // Índice por la derecha
//        boolean esPalindromo = true;
//        
//        while (i < j && esPalindromo)
//            if (cadena.charAt(i++) != cadena.charAt(j--))
//                esPalindromo = false;
//        
//        return esPalindromo;
//    }
        
    private static boolean esPalindromoIterativo(String cadena){
        int i = 0;  // Índice por la izquierda
        int j = cadena.length() - 1; // Índice por la derecha
        
        while (i < j)
            if (cadena.charAt(i++) != cadena.charAt(j--))
                return false;
        
        return true;
    }
    
    /*
            reconocer           abba
             econoce             bb
              conoc
               ono
                n
    */
    
    private static boolean esPalindromoInterno(String cadena){
        if (cadena.length() == 0 || cadena.length() == 1)
            return true;

        if (cadena.charAt(0) != cadena.charAt(cadena.length() - 1))
            return false;
        
        return esPalindromoInterno(cadena.substring(1, cadena.length() - 1));
    }
    
    public static boolean esPalindromo(String cadena){
        cadena = cadena.toLowerCase();
        cadena = cadena.replace(" ", "");
        return esPalindromoIterativo(cadena);
    }
    
    public static void main(String[] args) {
        String cadena = "Reconocer";

        if (esPalindromo(cadena))
            System.out.println("Es palíndromo");
        else
            System.out.println("No es palíndromo");
    }

}