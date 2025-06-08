package Vectores;
import java.util.Arrays;

import java.util.*;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el valor N: ");
        int n = sc.nextInt();
        int[] primos = generarPrimos(n);
        System.out.println("Primos hasta " + n + ": " + Arrays.toString(primos));
        sc.close();
    }

    public static int[] generarPrimos(int n) {
        int[] temp = new int[n];
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (esPrimo(i)) temp[count++] = i;
        }
        return Arrays.copyOf(temp, count);
    }

    public static boolean esPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}


