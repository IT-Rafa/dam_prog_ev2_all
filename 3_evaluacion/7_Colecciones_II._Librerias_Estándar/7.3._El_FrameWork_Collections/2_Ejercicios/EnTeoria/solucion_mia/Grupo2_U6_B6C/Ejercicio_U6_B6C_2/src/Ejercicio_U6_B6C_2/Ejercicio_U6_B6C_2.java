package Ejercicio_U6_B6C_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Clase que contiene el main del Ejercicio_U6_B6C_2
 */
public class Ejercicio_U6_B6C_2 {
    /**
     * 
     */
    public static void main(String[] args) {
        List<String> numeros = Arrays.asList("0", "1", "2");

        // suponemos longitud >0
        for (String combinacion : combinaciones(3, numeros)) {
            System.out.println(combinacion);

        }
    }

    /**
     * 
     */
    // falta método combinar, que es en este caso un método NO RECURSIVO
    static List<String> combinaciones(int longitud, List<String> numeros) {
        // en principio result almacena la combinación de longitud 1
        // es decir, es la copia de la la lista numeros
        // List<String> result= numeros; MAL, así modificaré el original
        List<String> result = new ArrayList<>(numeros);

        for (int i = 0; i < longitud - 1; i++) {// longitud-1 porque ya inicializamos con 1 combinacion
            result = combinar(result, numeros);
        }
        return result;
    }

    private static List<String> combinar(List<String> result, List<String> numeros) {
        int longitud = numeros.size();
        while (longitud < 0) {
            if (longitud == 0) {
                return result;// resultado vacío
            }
            if (longitud == 1) {
                return numeros;
            }
            List<String> sublista = combinar(longitud, numeros);
            for (String numero : numeros) {
                for (String numeroCombinado : sublista) {
                    result.add(numero + numeroCombinado);
                }
            }

            longitud--;
        }

        return result;
    }

    /**
     * Versión Con Recursividad
     */
    private static List<String> combinar(int longitud, List<String> numeros) {
        List<String> result = new ArrayList<>();
        if (longitud == 0) {
            return result;// resultado vacío
        }
        if (longitud == 1) {
            return numeros;
        }
        List<String> sublista = combinar(longitud - 1, numeros);
        for (String numero : numeros) {
            for (String numeroCombinado : sublista) {
                result.add(numero + numeroCombinado);
            }
        }
        return result;
    }

}
