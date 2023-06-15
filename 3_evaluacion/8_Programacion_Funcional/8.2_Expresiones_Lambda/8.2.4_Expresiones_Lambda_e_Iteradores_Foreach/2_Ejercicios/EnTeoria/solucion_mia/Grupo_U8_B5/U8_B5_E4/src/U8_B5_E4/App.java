package U8_B5_E4;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase con ejecutable de Ejercicio U8_B5_E4<p>
 */
public class App {

  /**
   * Ejecutable Ejercicio U8_B5_E4<p>
   */
  public static void main(String[] args) {
    Map<String, Integer> items = new HashMap<>();
    items.put("A", 10);
    items.put("B", 20);
    items.put("C", 30);
    items.put("D", 40);
    items.put("E", 50);
    items.put("F", 60);

    // Usamos foreach del Map
    // La instancia a rellenar es BiConsumer, que recibe dos parámetros y
    // no devuelve nada
    items.forEach((k, v) -> System.out.println("Clave: " + k + " Valor: " + v));
  }
}
