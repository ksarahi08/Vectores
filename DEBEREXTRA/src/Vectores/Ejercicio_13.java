package Vectores;
import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio_13 {

    public static void main(String [] args) {
        int numero = 12;
        int[] divisores = obtenerDivisores(numero);
        System.out.println("Divisores de " + numero + ": " + Arrays.toString(divisores));
    }

    public static int[] obtenerDivisores(int numero) {
        ArrayList<Integer> divisores = new ArrayList<>();
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) divisores.add(i);
        }
        int[] resultado = new int[divisores.size()];
        for (int i = 0; i < divisores.size(); i++) {
            resultado[i] = divisores.get(i);
        }
        return resultado;
    }
}


