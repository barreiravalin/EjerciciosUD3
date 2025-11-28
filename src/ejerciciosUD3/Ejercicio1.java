package ejerciciosUD3;

import java.util.Scanner;

public class Ejercicio1 {

    private static boolean esBisiesto(int año){
        return (año % 4 == 0) &&
               (año % 100 != 0 || año % 400 == 0);
    }
    
    private static byte getDiasMes(byte mes, short año){
        switch(mes){
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 4, 6, 9, 11:
                return 30;
            default:
                return (byte)((esBisiesto(año))? 29: 28);
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Mes: ");
        byte mes = in.nextByte();
        System.out.print("Año: ");
        short año = in.nextShort();
        
        System.out.println(getDiasMes(mes, año));
    }

}