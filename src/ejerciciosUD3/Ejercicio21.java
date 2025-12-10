package ejerciciosUD3;

public class Ejercicio21 {

    private static void hanoi(int discos, int origen, int auxiliar, int destino){
        if (discos == 1)
            System.out.println("Mover disco de " + origen + " a " + destino);
        else {
            hanoi(discos - 1, origen, destino, auxiliar);
            System.out.println("Mover disco de " + origen + " a " + destino);
            hanoi(discos - 1, auxiliar, origen, destino);
        }
    }
    
    public static void main(String[] args) {
        hanoi(10, 1, 2, 3);
    }

}