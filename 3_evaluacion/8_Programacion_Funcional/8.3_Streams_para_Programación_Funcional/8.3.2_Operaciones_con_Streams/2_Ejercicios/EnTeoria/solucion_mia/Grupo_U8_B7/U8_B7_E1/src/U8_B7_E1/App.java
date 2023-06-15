package U8_B7_E1;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase con ejecutable de Ejercicio U8_B7_E1<p>
 */
public class App {

  /**
   * Ejecutable Ejercicio U8_B7_E1<p>
   */
  public static void main(String[] args) {
    List<String> items = new ArrayList<>();
    items.add("A");
    items.add("B");
    items.add("C");
    items.add("D");
    items.add("E");

    items // source
      .stream() // covertimos a stream
      .filter(s -> s.compareTo("B") > 0) // Filtramos solo a superiores a B
      .forEach(System.out::println); // Mostramos contenido actual
  }
}
