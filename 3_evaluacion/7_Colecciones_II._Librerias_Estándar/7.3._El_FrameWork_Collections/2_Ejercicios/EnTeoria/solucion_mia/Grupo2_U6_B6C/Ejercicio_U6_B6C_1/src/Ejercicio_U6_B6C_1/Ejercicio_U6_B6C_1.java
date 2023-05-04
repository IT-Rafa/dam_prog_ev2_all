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
    // en principio result almacena la combinación de longitud 1
    // es decir, es la copia de la la lista numeros
    // List<String> result= numeros; MAL, así modificaré el original

    // longitud-1 porque ya inicializamos con 1 combinacion
    List<String> result = new ArrayList<>();

    for (int i = 0; i < longitud; i++) {
      result = combinar(result, numeros);
    }
    return result;
  }

  private static List<String> combinar(
    List<String> result,
    List<String> numeros
  ) {
    for (int i = 0; i < numeros.size(); i++) {
      for (String numero : numeros) {
        result.add(numero + numeroCombinado);
      }
    }

    return result;
  }
}
