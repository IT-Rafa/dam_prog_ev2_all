import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class App {

  /**
   * Según lista de números, creamos una lista de Strings,
   * de una longitud dada, usando esos números, para crear
   * todas las posibles combinaciones. <p>
   *
   * Combinar m numeros en combinaciones de de longitud n
   * consiste en:<p>
   *
   * concatenar cada uno de los m números con el resultado de combinar
   * los m números con longitud -1
   *
   */
  public static void main(String[] args) {
    // Lista números
    List<String> numeros = Arrays.asList("0", "1", "2");

    // Las longitudes van de 1 a 4
    for (int longitud = 1; longitud < 4; longitud++) {
      // Mostramos título
      System.out.println("combinaciones de 0, 1 y 2 con longitud " + longitud);

      // Creamos las combinaciones
      List<String> result = combinar(longitud, numeros);

      // Mostramos esa lista por pantalla
      for (String s : result) {
        System.out.println(s);
      }
    }

    // Mostramos título
    System.out.println("combinaciones de 8 y 5 con longitud 4");

    // Lista números
    numeros = Arrays.asList("8", "5");

    // Creamos las combinaciones, indicandole la longitud
    for (String s : combinar(4, numeros)) {
      System.out.println(s);
    }
  }

  /**
   * Según lista de números, creamos una lista de Strings, de una longitud
   * dada, usando esos números, para crear todas las posibles combinaciones
   */
  static List<String> combinar(int longitud, List<String> numeros) {
    // Creamos lista Strings vacia
    List<String> result = new ArrayList<>();

    if (longitud == 0) {
      // Si longitud es 0, no devuelve nada
      return result;
    }
    if (longitud == 1) {
      // Si longitud es 1, solo devolvemos los números dados
      return numeros;
    }

    // Para el resto, usamos recurrencia
    // Volvemos a llamar a la función con la longitud -1 y los números
    List<String> sublista = combinar(longitud - 1, numeros);

    // Recorremos los números
    for (String numero : numeros) {
      // añadimos a la lista cada opción de la sublista con cada número
      for (String numeroCombinado : sublista) {
        result.add(numero + numeroCombinado);
      }
    }
    return result;
  }
}
