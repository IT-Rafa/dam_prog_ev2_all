package U7_B5_E1;

import java.util.LinkedHashSet;

/**
 * Ejercicio U7_B5_E1:<p>
 * Repite el ejemplo anterior pero utilizando la clase LinkedHashSet
 */
public class App {

  /**
   * Crea LinkedHashSet de String, Añadimos Strings y mostramos salida.<p>
   *
   * Es parte de Set, con lo que no acepta duplicados.<p>
   * LinkedHashSet almacena por orden inserción<p>
   * La versión previa HashSet<String> almacena por orden aleatorio<p>
   */
  public static void main(String[] args) {
    LinkedHashSet<String> conjuntoVehiculos = new LinkedHashSet<>();
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
