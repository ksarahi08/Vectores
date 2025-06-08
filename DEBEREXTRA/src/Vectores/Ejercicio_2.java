package Vectores;
import java.util.*;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vector = leerVector(teclado);
        intercambiarMaxMin(vector);
        System.out.println("Resultado: " + Arrays.toString(vector));
        
    }

    public static int[] leerVector(Scanner teclado) {
        System.out.print("Tamaño del vector: ");
        int n = teclado.nextInt();
        int[] v = new int[n];
        System.out.println("Introduce los elementos:");
        for (int i = 0; i < n; i++) v[i] = teclado.nextInt();
        return v;
    }

    public static void intercambiarMaxMin(int[] vector) {
        int maxIndex = 0, minIndex = 0;
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > vector[maxIndex]) maxIndex = i;
            if (vector[i] < vector[minIndex]) minIndex = i;
        }
        int temp = vector[maxIndex];
        vector[maxIndex] = vector[minIndex];
        vector[minIndex] = temp;
    }
}




