package Vectores;
import java.util.Arrays;
public class Ejercicio_14 {

    public static void main(String[] args) {
        int[] vector = {0, 1, 0, 3, 12};
        moverCerosAlFinal(vector);
        System.out.println("Vector después de mover ceros: " + Arrays.toString(vector));
    }

    public static void moverCerosAlFinal(int[] vector) {
        int j = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] != 0) {
                vector[j++] = vector[i];
            }
        }
        while (j < vector.length) {
            vector[j++] = 0;
        }
    }
}

