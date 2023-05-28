package U6_B6C_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Clase que contiene el main del Ejercicio_U6_B6C_1
 */
public class Ejercicio_U6_B6C_1 {

  /**
   * C
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
  static List<String> combinaciones(int longitud, List<String> numeros) {
    // en principio result almacena la combinación de longitud 1
    // es decir, es la copia de la la lista numeros
    // List<String> result= numeros; MAL, así modificaré el original
    List<String> result = new ArrayList<>(numeros);
    // longitud-1 porque ya inicializamos con 1 combinacion
    for (int i = 0; i < longitud - 1; i++) {
      result = combinar(result, numeros);
    }
    return result;
  }

  static List<String> combinar(List<String> sublista, List<String> numeros) {
    List<String> result = new ArrayList<>(numeros);
    for (String numero : numeros) {
      for (String numeroCombinado : sublista) {
        if (numeroCombinado.length() == 1) {
          result.add(numero + numeroCombinado);
        }
      }
    }
    return result;
  }
}
