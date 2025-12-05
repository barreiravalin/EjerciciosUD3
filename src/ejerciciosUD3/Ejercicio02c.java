package ejerciciosUD3;

import java.util.Scanner;

public class Ejercicio02c {
    
    private static boolean esBisiesto(int año) {
        return (año % 4 == 0)
                && (año % 100 != 0 || año % 400 == 0);
    }

    private static byte getDiasMes(byte mes, short año) {
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 4, 6, 9, 11:
                return 30;
            default:
                return (byte) ((esBisiesto(año)) ? 29 : 28);
        }
    }
    
    private static int indexOf(String cadena, char c){
        for (int i = 0; i < cadena.length(); i++) 
            if (cadena.charAt(i) == c)
                return i;
        return -1;
    }
    
    private static int indexOf(String cadena, char c, int idInicio){
        for (int i = idInicio; i < cadena.length(); i++) 
            if (cadena.charAt(i) == c)
                return i;
        return -1;
    }
    
    private static boolean esFechaValida(byte dia, byte mes, short año){
        return mes >= 1 && mes <= 12 &&
               año != 0 &&
               dia >= 1 && dia <= getDiasMes(mes, año);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        byte dia;
        byte mes;
        short año;
        String fecha;
        int id1; // Posición de la barra que separa el día del mes.
        int id2; // Posición de la barra que separa el mes del año.
        /*
        Vamos a suponer que no sabemos con cuántos dígitos se escriben
        el día y el mes.
        1/10/2025
        15/1/2025
        */
        System.out.print("Fecha: ");
        fecha = in.nextLine();
        
        id1 = indexOf(fecha, '/');
        id2 = indexOf(fecha, '/', id1 + 1);
        
        dia = Byte.parseByte(fecha.substring(0, id1));
        mes = Byte.parseByte(fecha.substring(id1 + 1, id2));
        año = Short.parseShort(fecha.substring(id2 + 1));

        System.out.println((esFechaValida(dia, mes, año))? "Fecha válida" : "Fecha inválida");
    }

}