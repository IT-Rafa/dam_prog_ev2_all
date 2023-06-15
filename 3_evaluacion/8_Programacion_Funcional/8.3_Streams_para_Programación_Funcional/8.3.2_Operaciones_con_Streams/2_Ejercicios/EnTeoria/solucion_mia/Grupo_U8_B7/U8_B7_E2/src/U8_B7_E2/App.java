package U8_B7_E2;

import java.util.Arrays;
import java.util.List;

/**
 * Clase con ejecutable de Ejercicio U8_B7_E2<p>
 */
public class App {

  /**
   * Ejecutable Ejercicio U8_B7_E2<p>
   */
  public static void main(String[] args) {
    List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
    Long count = myList.stream().filter(s -> s.startsWith("c")).count();
    System.out.println("Cantidad elementos que empiezan con c: " + count);
  }
}
