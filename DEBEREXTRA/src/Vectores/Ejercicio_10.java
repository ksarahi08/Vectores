package Vectores;
import java.util.Arrays;

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = leerVector(sc);
        System.out.print("Valor a eliminar: ");
        int valor = sc.nextInt();
        int[] resultado = eliminarValor(vector, valor);
        System.out.println("Resultado: " + Arrays.toString(resultado));
    
    }

    public static int[] leerVector(Scanner sc) {
        System.out.print("Tamaño del vector: ");
        int n = sc.nextInt();
        int[] v = new int[n];
        System.out.println("Introduce los elementos:");
        for (int i = 0; i < n; i++) v[i] = sc.nextInt();
        return v;
    }

    public static int[] eliminarValor(int[] vector, int valor) {
        int count = 0;
        for (int num : vector) {
            if (num != valor) count++;
        }
        int[] nuevo = new int[count];
        int index = 0;
        for (int num : vector) {
            if (num != valor) nuevo[index++] = num;
        }
        return nuevo;
    }
}


