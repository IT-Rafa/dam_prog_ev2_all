package U7_B5_E3;

import java.util.HashSet;
import java.util.Set;

/**
 * Clase que contiene las clases para ejecutar el
 * Ejercicio_U7_B5_E3
 */
public class App {

  /**
   * Creamos grupo Set<String> y lo montamos con HashSet<String>
   */
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
