package Vectores;

    
import java.util.*;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = leerVector(sc);
        System.out.println("¿Es palíndromo? " + esPalindromo(vector));
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

    public static boolean esPalindromo(int[] vector) {
        for (int i = 0; i < vector.length / 2; i++) {
            if (vector[i] != vector[vector.length - 1 - i]) return false;
        }
        return true;
    }
}



