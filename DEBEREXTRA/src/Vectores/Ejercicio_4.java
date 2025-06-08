package Vectores;
import java.util.Arrays;
   import java.util.*;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = leerVector(sc);
        System.out.print("Posición a insertar: ");
        int pos = sc.nextInt();
        System.out.print("Valor a insertar: ");
        int valor = sc.nextInt();
        int[] resultado = insertarEn(vector, pos, valor);
        System.out.println("Nuevo vector: " + Arrays.toString(resultado));
        
    }

    public static int[] leerVector(Scanner sc) {
        System.out.print("Tamaño del vector: ");
        int n = sc.nextInt();
        int[] v = new int[n];
        System.out.println("Introduce los elementos:");
        for (int i = 0; i < n; i++) v[i] = sc.nextInt();
        return v;
    }

    public static int[] insertarEn(int[] vector, int posicion, int valor) {
        int[] nuevo = new int[vector.length + 1];
        for (int i = 0, j = 0; i < nuevo.length; i++) {
            if (i == posicion) {
                nuevo[i] = valor;
            } else {
                nuevo[i] = vector[j++];
            }
        }
        return nuevo;
    }
}




