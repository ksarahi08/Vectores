package Vectores;

public class Ejercicio_16 {
    public static void main(String[] args) {
        int[] vector = {10, 20, 30, 40, 50};
        int valor = 30;
        int indice = buscarIndice(vector, valor);
        System.out.println("El valor " + valor + " se encuentra en el índice: " + indice);
    }

    public static int buscarIndice(int[] vector, int valor) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == valor) return i;
        }
        return -1; // Retorna -1 si no se encuentra
    }
}


