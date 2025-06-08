package Vectores;
import java.util.Arrays;
public class Ejercicio_17 {

    public static void main(String[] args) {
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{5, 6}, {7, 8}};
        int[][] resultado = multiplicarMatrices(A, B);
        System.out.println("Resultado de la multiplicación de matrices:");
        for (int[] fila : resultado) {
            System.out.println(Arrays.toString(fila));
        }
    }

    public static int[][] multiplicarMatrices(int[][] A, int[][] B) {
        int filasA = A.length;
        int columnasA = A[0].length;
        int columnasB = B[0].length;

        int[][] resultado = new int[filasA][columnasB];
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {
                    resultado[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return resultado;
    }
}


