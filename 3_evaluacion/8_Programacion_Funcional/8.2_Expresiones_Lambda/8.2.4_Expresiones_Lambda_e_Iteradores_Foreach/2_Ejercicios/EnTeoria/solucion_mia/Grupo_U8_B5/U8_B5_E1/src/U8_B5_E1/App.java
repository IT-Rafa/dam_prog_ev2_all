package U8_B5_E1;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase con ejecutable de Ejercicio U8_B5_E1<p>
 */
public class App {

  /**
   * Ejecutable Ejercicio U8_B5_E1<p>
   */
  public static void main(String[] args) {
    List<String> items = new ArrayList<>();
    items.add("A");
    items.add("B");
    items.add("C");
    items.add("D");
    items.add("E");

    // Usamos el método forEach() de Iterable
    // Le pasamos la instacia de la interface funcional Consumer
    // que acepta un parámetro y no devolverá nada
    // y accept usará la expresión lambda con println
    items.forEach(item -> System.out.println(item));
  }
}
