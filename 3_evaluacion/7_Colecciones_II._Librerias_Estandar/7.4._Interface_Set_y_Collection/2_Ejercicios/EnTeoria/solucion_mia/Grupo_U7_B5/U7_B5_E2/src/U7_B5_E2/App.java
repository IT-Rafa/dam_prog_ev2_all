package U7_B5_E2;

import java.util.TreeSet;

/**
 * Ejercicio U7_B5_E2:<p>
 *  Repite el ejercicio anterior pero utilizando la clase TreeSet
 */
public class App {

  /**
   * Crea TreeSet de String, Añadimos Strings y mostramos salida.<p>
   *
   * Es parte de Set, con lo que no acepta duplicados.<p>
   * TreeSet almacena por orden alfabético, según Comparable<String> <p>
   */
  public static void main(String[] args) throws Exception {
    TreeSet<String> conjuntoVehiculos = new TreeSet<>();
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
