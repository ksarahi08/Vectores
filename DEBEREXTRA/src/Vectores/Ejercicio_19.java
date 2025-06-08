package Vectores;
import java.util.Arrays;
public class Ejercicio_19 {

    public static void main(String[] args) {
        int n = 8;
        int[] lucas = generarSecuenciaLucas(n);
        System.out.println("Secuencia de Lucas: " + Arrays.toString(lucas));
    }

    public static int[] generarSecuenciaLucas(int n) {
        int[] lucas = new int[n];
        if (n > 0) lucas[0] = 2;
        if (n > 1) lucas[1] = 1;
        for (int i = 2; i < n; i++) {
            lucas[i] = lucas[i - 1] + lucas[i - 2];
        }
        return lucas;
    }
}


