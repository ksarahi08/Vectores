package Vectores;
import java.util.*;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = leerVector(sc);
        int segundo = segundoMayor(vector);
        System.out.println("Segundo mayor: " + segundo);
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

    public static int segundoMayor(int[] v) {
        int mayor = Integer.MIN_VALUE;
        int segundo = Integer.MIN_VALUE;
        for (int num : v) {
            if (num > mayor) {
                segundo = mayor;
                mayor = num;
            } else if (num > segundo && num != mayor) {
                segundo = num;
            }
        }
        return segundo;
    }
}




