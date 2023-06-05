package U7_B7_E1;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase con ejecutor de Ejercicio U7_B7_E1:
 */
public class App {

  /**
   * Convertimos hm todo a autoboxing
   * <p>
   * Eliminamos busquedas
   * <p>
   * Añadimos el método KeySet() para conseguir los valores
   */
  public static void main(String[] args) {
    Map<String, Double> hm = new HashMap<>();
    // mejor con autoboxing
    hm.put("Elías", 1500.0);
    hm.put("Román", 1900.0);
    hm.put("Telma", 2400.0);

    for (String clave : hm.keySet()) {
      System.out.println(clave + ": " + hm.get(clave));
    }
  }
}
