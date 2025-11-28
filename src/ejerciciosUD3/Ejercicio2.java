package ejerciciosUD3;

import java.util.Scanner;

public class Ejercicio2 {

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
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        byte dia;
        byte mes;
        short año;
        String fecha;
        boolean esFechaValida = true;
        
        System.out.print("Fecha (dd/mm/aaaa): ");
        fecha = in.nextLine();
        dia = Byte.parseByte(fecha.substring(0, 2));
        mes = Byte.parseByte(fecha.substring(3, 5));
        año = Short.parseShort(fecha.substring(6));

        if (mes < 1 || mes > 12 || año == 0 || dia < 1 || dia > getDiasMes(mes, año))
            esFechaValida = false;
        
        System.out.println((esFechaValida)? "Fecha válida" : "Fecha inválida");
    }

}
