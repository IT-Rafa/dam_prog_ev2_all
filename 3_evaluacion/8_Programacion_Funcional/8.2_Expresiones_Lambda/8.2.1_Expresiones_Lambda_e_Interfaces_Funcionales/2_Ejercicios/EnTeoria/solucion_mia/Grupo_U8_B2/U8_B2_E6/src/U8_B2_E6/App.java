package U8_B2_E6;

import java.util.function.IntSupplier;

/**
 * Clase con ejecutable de Ejercicio U8_B2_E6<p>
 */
public class App {

  /**
   * Ejecutable Ejercicio U8_B2_E6<p>
   *
   */
  public static void main(String[] args) {
    // Creamos el elemento IntSupplier con un lambda donde
    // no recibe nada y devuelve un número aleatorio entre
    // 1 y 10
    IntSupplier i = () -> (int) (Math.random() * 10 + 1);

    // Mostramos el resultado como int
    System.out.println(i.getAsInt());
  }
}
