package U8_B7_E6;

import java.util.Arrays;

/**
 * Clase con ejecutable de Ejercicio U8_B7_E6<p>
 */
public class App {

  /**
   * Ejecutable Ejercicio U8_B7_E6<p>
   * calcula la media de las longitudes de una lista de
   * cadenas con Stream
   */
  public static void main(String[] args) {
    String[] cadenas = { "a", "ab", "abc" };

    double media = Arrays
      // Convertir el array to stream
      .stream(cadenas)
      // Poner en lista el ancho de cada String, como int
      .mapToInt(s -> s.length())
      // Hacer la media; Devuelve OptionalDouble
      .average()
      // Cogemos el valor Double de average
      .getAsDouble();

    System.out.println(media);
  }
}
