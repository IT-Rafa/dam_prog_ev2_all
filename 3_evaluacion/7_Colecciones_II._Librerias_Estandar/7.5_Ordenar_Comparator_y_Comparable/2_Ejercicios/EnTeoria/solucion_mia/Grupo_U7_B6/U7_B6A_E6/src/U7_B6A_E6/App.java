package U7_B6A_E6;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * Ejercicio U7_B6A_E6:<p>
 * Imprimir un HashSet ordenado.<p>
 * Crea un HashSet de enteros. Ya que un TreeSet en su
 * constructor admite como parámetro una colección, por
 * ejemplo un HashSet, crea un TreeSet para imprimir el
 * HashSet ordenado
 */
public class App {

  /**
   * Se puede hacer con Integer, pero no con Persona
   */
  public static void main(String[] args) {
    HashSet<Integer> hashInteger = new HashSet<>();
    hashInteger.add(10);
    hashInteger.add(5);
    hashInteger.add(1);

    TreeSet<Integer> treeInteger = new TreeSet<>(hashInteger);

    String sImprimir =
      "HashSet de personas Creado con Collection creado con TreeSet\n";
    for (Integer n : treeInteger) {
      sImprimir = sImprimir + n + "\n";
    }
    System.out.println(sImprimir);
  }
}
