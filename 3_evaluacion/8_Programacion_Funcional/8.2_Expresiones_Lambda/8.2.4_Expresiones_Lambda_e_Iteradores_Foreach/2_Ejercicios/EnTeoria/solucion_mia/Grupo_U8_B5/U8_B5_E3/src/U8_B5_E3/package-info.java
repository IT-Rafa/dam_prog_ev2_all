/**
 * package con clases para
 * <h3>Ejercicio U8_B5_E3:</h3>
 * Reescribe el for “normal” de abajo de dos maneras:
 * <p>
 * <ul>
 *  <li>
 *      1. Creando una instancia de Consumer y luego 
 *          dentro del for invocando expresamente al método accept.
 * <pre>
for (String item : items) {
    c.accept(item);
}
 * </pre>
 *  </li>
 *  <li>2. Con foreach()</li>
 * </ul>
 * <h4>Ejercicio con for “normal”</h4>
 * <pre>
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
      List<String> items = new ArrayList<>();
      items.add("A");
      items.add("B");
      items.add("B");
      items.add("D");
      items.add("E");
      for (String item : items) {
        if (item.equals("B")) {
          System.out.println(item);
        }
      }
    }
  }
 * </pre>
 */
package U8_B5_E3;
