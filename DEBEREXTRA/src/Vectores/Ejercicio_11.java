package Vectores;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
public class Ejercicio_11 {


    public static void main(String[] args) {
        int[] vector = new int[10];
        rellenarUnico(vector);
        for (int num : vector) {
            System.out.print(num + " ");
        }
    }

    public static void rellenarUnico(int[] vector) {
        Random rand = new Random();
        Set<Integer> numeros = new HashSet<>();
        for (int i = 0; i < vector.length; ) {
            int num = rand.nextInt(100) + 1; // Números aleatorios entre 1 y 100
            if (numeros.add(num)) {
                vector[i++] = num;
            }
        }
    }
}


