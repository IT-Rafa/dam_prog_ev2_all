package U7_B7_E2;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase con ejecutor para Ejercicio U7_B7_E2:
 */
public class App {

  /**
   * Intentamos añadir valores con misma clave y se sustituyen.<p>
   * String en mayúscula es clave distinta
   */
  public static void main(String[] args) {
    Map<String, Double> hm = new HashMap<>();
    // mejor con autoboxing
    hm.put("Emp1", 1000.0);
    hm.put("Emp2", 2000.0);
    hm.put("Emp3", 3000.0);
    hm.put("Emp1", 4000.0);
    hm.put("Emp2", 5000.0);
    hm.put("Emp3", 6000.0);
    hm.put("EMP1", 7000.0);

    for (String clave : hm.keySet()) {
      System.out.println(clave + ": " + hm.get(clave));
    }

    System.out.println("mapa modificado con put");
    for (String k : hm.keySet()) {
      System.out.println(k + ", " + hm.get(k));
    }
  }
}
