package U7_B7_E2;

import java.util.HashMap;
import java.util.Map;

/**
 * Ejercicio U7_B7_E2:
 * <p>
 * Fíjate en el API para ver cómo se comporta put() si se indica
 * una clave existente.
 */
public class App {

    public static void main(String[] args) throws Exception {
        Map<String, Integer> m = new HashMap<String, Integer>();
        // Initialize frequency table from command line
        for (String a : args) {
            Integer freq = m.get(a);
            m.put(a, (freq == null) ? 1 : freq + 1);
        }
        System.out.println(m.size() + " distinct words:");
        System.out.println(m);
    }
}
