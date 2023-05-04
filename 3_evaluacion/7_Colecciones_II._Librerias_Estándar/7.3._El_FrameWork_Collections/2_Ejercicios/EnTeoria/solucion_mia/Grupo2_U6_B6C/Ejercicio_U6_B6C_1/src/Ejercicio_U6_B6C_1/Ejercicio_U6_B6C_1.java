package Ejercicio_U6_B6C_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Clase que contiene el main del Ejercicio_U6_B6C_1
 */
public class Ejercicio_U6_B6C_1 {

  /**
   *
   */
  public static void main(String[] args) {
    List<String> numeros = Arrays.asList("0", "1", "2");

    for (String combinacion : combinaciones(3, numeros)) {
      System.out.println(combinacion);
    }
  }

  static List<String> combinaciones(int longitud, List<String> numeros) {
    List<String> result = new ArrayList<>(numeros);
    for (int i = 0; i < longitud - 1; i++) { // longitud-1 porque ya inicializamos con 1 combinacion
      result = combinar(result, numeros);
    }
    return result;
  }

  private static List<String> combinar(
    List<String> result,
    List<String> numeros
  ) {
    for (String n1 : numeros) {
      for (String n2 : numeros) {
        result.add(n1 + n2);
      }
    }

    return result;
  }
}
