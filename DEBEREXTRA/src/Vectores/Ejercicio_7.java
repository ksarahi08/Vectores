package Vectores;
import java.util.Arrays;

import java.util.*;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = leerVector(sc);
        System.out.print("Valor a reemplazar: ");
        int viejo = sc.nextInt();
        System.out.print("Nuevo valor: ");
        int nuevo = sc.nextInt();
        reemplazar(vector, viejo, nuevo);
        System.out.println("Resultado: " + Arrays.toString(vector));
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

    public static void reemplazar(int[] vector, int viejo, int nuevo) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == viejo) vector[i] = nuevo;
        }
    }
}
