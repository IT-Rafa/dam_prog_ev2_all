package U6_B6C_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Clase que contiene el main del Ejercicio_U6_B6C_1
 */
public class Ejercicio_U6_B6C_1 {

  /**
   * Crea lista de Strings de números y muestra las combinaciones de
   * esos números
   */
  public static void main(String[] args) {
    List<String> numeros = Arrays.asList("0", "1", "2");
    int longitud = 3;

    // suponemos longitud >0
    for (String combinacion : combinaciones(longitud, numeros)) {
      System.out.println(combinacion);
    }
  }

  /**
   * Calcula las combinaciones de la longitud indicada basadas en
   * la lista de números
   *
   * @param longitud Longitud de la lista
   * @param numeros Lista de números que forman parte de la combinación
   *
   * @return Lista de Strings con todas las combinaciones que se pueden hacer
   */
  static List<String> combinaciones(int longitud, List<String> numeros) {
    // Copiamos el arrray con los números.
    List<String> result = new ArrayList<>(numeros);

    // el array result ya tiene la lista de números, con lo que repetimos
    // uno menos
    for (int i = 0; i < longitud - 1; i++) {
      result = combinar(result, numeros);
    }
    return result;
  }

  /**
   * Añade al array result la combinación de los números
   */
  private static List<String> combinar(
    List<String> result,
    List<String> numeros
  ) {
    // Recorremos los números
    for (String numero : numeros) {
      // añadimos a la lista cada opción de la sublista con cada número
      for (String numeroCombinado : result) {
        numeroCombinado = numero + numeroCombinado;
      }
    }
    return result;
  }
}
