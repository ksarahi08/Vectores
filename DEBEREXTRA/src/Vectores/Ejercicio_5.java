package Vectores;
import java.util.Arrays;

import java.util.*;

public class Ejercicio_5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = leerVector(sc);
        int[][] separados = separarParesImpares(vector);
        System.out.println("Pares: " + Arrays.toString(separados[0]));
        System.out.println("Impares: " + Arrays.toString(separados[1]));
        sc.close();
    }

    public static int[] leerVector(Scanner sc) {
        System.out.print("Tamaño del vector: ");
        int n = sc.nextInt();
        int[] v = new int[n];
        System.out.println("Introduce los elementos:");
        for (int i = 0; i < n; i++) v[i] = sc.nextInt();
        return v;
    }

    public static int[][] separarParesImpares(int[] vector) {
        int[] pares = new int[vector.length];
        int[] impares = new int[vector.length];
        int p = 0, im = 0;

        for (int num : vector) {
            if (num % 2 == 0) pares[p++] = num;
            else impares[im++] = num;
        }

        return new int[][] {
            Arrays.copyOf(pares, p),
            Arrays.copyOf(impares, im)
        };
    }
}




