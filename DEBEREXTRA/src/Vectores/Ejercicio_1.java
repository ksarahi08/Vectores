package Vectores;

import java.util.*;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vector = leerVector(teclado);
        int[] sinDuplicados = eliminarDuplicados(vector);
        System.out.println("Sin duplicados: " + Arrays.toString(sinDuplicados));
        
    }

    public static int[] leerVector(Scanner teclado) {
        System.out.print("Tamaño del vector: ");
        int n = teclado.nextInt();
        int[] v = new int[n];
        System.out.println("Introduce los elementos:");
        for (int i = 0; i < n; i++) v[i] = teclado.nextInt();
        return v;
    }

    public static int[] eliminarDuplicados(int[] vector) {
        int[] temp = new int[vector.length];
        int size = 0;
        for (int i = 0; i < vector.length; i++) {
            if (!contiene(temp, size, vector[i])) {
                temp[size++] = vector[i];
            }
        }
        return Arrays.copyOf(temp, size);
    }

    public static boolean contiene(int[] arr, int size, int valor) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == valor) return true;
        }
        return false;
    }
}




