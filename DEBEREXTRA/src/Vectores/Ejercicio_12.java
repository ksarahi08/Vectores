package Vectores;
import java.util.ArrayList;
import java.util.Arrays;
public class Ejercicio_12 {

    public static void main(String[] args) {
        int[] vector = {1, 2, 0, 0, 3, 0, 4};
        int[] comprimido = comprimir(vector);
        System.out.println("Vector comprimido: " + Arrays.toString(comprimido));
    }

    public static int[] comprimir(int[] vector) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int num : vector) {
            if (num != 0) lista.add(num);
        }
        int[] resultado = new int[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            resultado[i] = lista.get(i);
        }
        return resultado;
    }
}


