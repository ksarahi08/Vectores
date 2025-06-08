package Vectores;

public class Ejercicio_18 {
    public static void main(String[] args) {
        int[] vector = {4, 7, 1, 9, 3};
        int indice = buscarMinimo(vector);
        System.out.println("El valor más pequeño se encuentra en el índice: " + indice);
    }

    public static int buscarMinimo(int[] vector) {
        int minimo = vector[0];
        int indice = 0;
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] < minimo) {
                minimo = vector[i];
                indice = i;
            }
        }
        return indice;
    }
}


