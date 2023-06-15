/**
 * package con clases para
 * <h3>Ejercicio U8_B5_E4:</h3>
 * Ejercicio U8_B5_E4: Vuelve a escribir el siguiente código
 * usando un foreach()
 * <p>
 * <h4>Código</h4>
 * <pre>
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class App {

    public static void main(String[] args) {
      Map<String, Integer> items = new HashMap<>();
      items.put("A", 10);
      items.put("B", 20);
      items.put("C", 30);
      items.put("D", 40);
      items.put("E", 50);
      items.put("F", 60);

      for (Entry<String, Integer> entry : items.entrySet()) {
        System.out.println(
          "Clave: " + entry.getKey() + " Valor: " + entry.getValue()
        );
      }
    }
}
  
 * </pre>
 */
package U8_B5_E4;
