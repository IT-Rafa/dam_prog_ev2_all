package U7_B9_E1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Clase con método ejecutor de Ejercicio U7_B9_E1:<p>
 */

public class App {

  public static void main(String[] args) {
    Map<String, Double> hm = new HashMap<>();
    //El autoboxing no permite pasar int a Double.
    //hm.put("Elías", 1500);
    hm.put("Elías", 1500.0);
    hm.put("Román", 1900.0);
    hm.put("Telma", 2400.0);
    Set<String> conjuntoDeLlaves = hm.keySet();

    System.out.println("recorrer con iterator");
    Iterator<String> itConjLlaves = conjuntoDeLlaves.iterator();
    while (itConjLlaves.hasNext()) {
      String clave = itConjLlaves.next();
      System.out.println(clave + " " + hm.get(clave));
    }
  }
}
