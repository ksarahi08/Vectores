package Vectores;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio_20 {


    public static void main(String[] args) {
        int[] vector = {1, 3, 3, 5, 2, 1, 3};
        int valorFrecuente = encontrarFrecuente(vector);
        System.out.println("El valor más frecuente es: " + valorFrecuente);
    }

    public static int encontrarFrecuente(int[] vector) {
        Map<Integer, Integer> frecuencia = new HashMap<>();
        for (int num : vector) {
            frecuencia.put(num, frecuencia.getOrDefault(num, 0) + 1);
        }

        int maxFrecuencia = 0;
        int valorFrecuente = vector[0];
        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet()) {
            if (entry.getValue() > maxFrecuencia) {
                maxFrecuencia = entry.getValue();
                valorFrecuente = entry.getKey();
            }
        }
        return valorFrecuente;
    }
}


