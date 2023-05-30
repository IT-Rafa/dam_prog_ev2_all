package U7_B7_E1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Ejercicio U7_B7_E1:
 * <p>
 * Los mapas nos interesan para hacer accesos directos por clave, no obstante
 * en alguna situación puede interesarnos hacer un recorrido secuencial de todo
 * el mapa.
 * <p>
 * Hay varias formas de conseguir esto, la más sencilla es con el método
 * KeySet().
 * <p>
 * Consulta en el API KeySet() y obtén los valores del mapa anterior con un
 * bucle for mejorado que recorre las Key obtenidas por el método KeySet().
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

        Set<String> keySet = hm.keySet();
        for (String clave : keySet) {
            System.out.println(clave + ": " + hm.get(clave));
        }

    }
}
