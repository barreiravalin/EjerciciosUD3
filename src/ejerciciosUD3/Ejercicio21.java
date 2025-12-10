package ejerciciosUD3;

public class Ejercicio21 {

    private static int contador = 1;
    
    private static void hanoi(int discos, int origen, int auxiliar, int destino){
        if (discos == 1)
            System.out.println(contador++ + " Mover disco de " + origen + " a " + destino);
        else {
            hanoi(discos-1, origen, destino, auxiliar);
            System.out.println(contador++ + " Mover disco de " + origen + " a " + destino);
            hanoi(discos-1, auxiliar, origen, destino);
        }
    }
    
    public static void main(String[] args) {
        hanoi(20, 1, 2, 3);
    }

}