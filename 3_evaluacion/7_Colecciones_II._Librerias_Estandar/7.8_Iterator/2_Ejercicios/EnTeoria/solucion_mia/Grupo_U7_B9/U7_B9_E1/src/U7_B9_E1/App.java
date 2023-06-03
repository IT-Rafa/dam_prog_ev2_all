package U7_B9_E1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Ejercicio U7_B9_E1:<p>
 * Resuelve este ejercicio con iterator.<p>
 * Ya que no hay modificaciones no es realmente necesario usar
 * iteradores pero lo hacemos para practicar el concepto.
 */

public class App {

  public static void main(String[] args) {
    Map<String, Double> hm = new HashMap<>();
    // repasando autoboxing. La sentencia comentada tiene problemas con autoboxing
    //El autoboxing permite pasar double a Double pero no int a Double. 1500 es int
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
