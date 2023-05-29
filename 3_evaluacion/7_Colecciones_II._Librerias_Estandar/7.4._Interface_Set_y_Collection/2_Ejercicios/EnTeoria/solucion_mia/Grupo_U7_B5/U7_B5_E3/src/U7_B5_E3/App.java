package U7_B5_E3;

import java.util.HashSet;
import java.util.Set;

/**
 * Ejercicio U7_B5_E3:<p>
 * Modifica el código anterior para que la referencia
 * conjuntoVehiculos sea de tipo Set.<p>
 *
 * Set vale para HashSet, LinkedHashSet, TreeSet,
 */
public class App {

  public static void main(String[] args) {
    Set<String> conjuntoVehiculos = new HashSet<>();
    conjuntoVehiculos.add("moto");
    conjuntoVehiculos.add("coche");
    conjuntoVehiculos.add("bici");
    conjuntoVehiculos.add("moto");
    conjuntoVehiculos.add("bici");
    for (String s : conjuntoVehiculos) {
      System.out.print(s + " ");
    }
    System.out.println();
  }
}
