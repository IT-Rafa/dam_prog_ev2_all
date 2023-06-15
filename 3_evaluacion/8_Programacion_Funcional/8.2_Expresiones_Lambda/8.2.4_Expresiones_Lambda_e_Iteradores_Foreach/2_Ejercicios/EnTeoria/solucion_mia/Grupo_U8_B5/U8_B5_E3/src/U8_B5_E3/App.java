package U8_B5_E3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Clase con ejecutable de Ejercicio U8_B5_E3<p>
 */
public class App {

  /**
   * Ejecutable Ejercicio U8_B5_E3<p>
   */
  public static void main(String[] args) {
    List<String> items = new ArrayList<>();
    items.add("A");
    items.add("B");
    items.add("B");
    items.add("D");
    items.add("E");

    // Versión normal. for con if para separar
    for (String item : items) {
      if (item.equals("B")) {
        System.out.println(item);
      }
    }
    System.out.println();

    // Contruimos el Consumer;
    // Para las dos versiones pedidas
    // al incluir varias líneas debemos usar {}
    Consumer<String> c = x -> {
      if (x.equals("B")) {
        System.out.println(x);
      }
    };

    // Versión 1. Consumer con función dentro
    // Usamos accep del consumer en cada caso de la lista
    for (String item : items) {
      c.accept(item);
    }
    System.out.println();

    // Versión 2. Con foreach
    items.forEach(c);
  }
}
