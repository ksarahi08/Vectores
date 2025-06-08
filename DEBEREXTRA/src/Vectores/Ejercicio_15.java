package Vectores;

public class Ejercicio_15 {
    public static void main(String[] args) {
        int[] vector = {1, 2, 3, 4, 5, 6};
        int[] resultado = contarParesImpares(vector);
        System.out.println("Pares: " + resultado[0] + ", Impares: " + resultado[1]);
    }

    public static int[] contarParesImpares(int[] vector) {
        int pares = 0, impares = 0;
        for (int num : vector) {
            if (num % 2 == 0) pares++;
            else impares++;
        }
        return new int[]{pares, impares};
    }
}


