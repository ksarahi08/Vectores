package Vectores;
import java.util.*;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = leerVector(sc);
        int conteo = contarMayoresPromedio(vector);
        System.out.println("Mayores que el promedio: " + conteo);
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

    public static int contarMayoresPromedio(int[] vector) {
        double suma = 0;
        for (int v : vector) suma += v;
        double promedio = suma / vector.length;

        int conteo = 0;
        for (int v : vector) {
            if (v > promedio) conteo++;
        }
        return conteo;
    }
}

