package U7_B7_E2;

import java.util.HashMap;
import java.util.Map;

/**
 * Ejercicio U7_B7_E2:<p>
 * Fíjate en el API para ver cómo se comporta put() si se indica una
 * clave existente<p>
 * Como extensión del ejercicio anterior, comprueba que ocurre cuando
 * intentas insertar algo con una clave existente en el mapa.
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
