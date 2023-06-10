package U8_B2_E6;

import java.util.function.IntSupplier;

/**
 * Clase con ejecutable de Ejercicio U8_B2_E6<p>
 */
public class App {

  /**
   * Ejecutable Ejercicio U8_B2_E6<p>
   * Creamos el elemento IntSupplier y le añadimos el lambda
   * donde no recibe nada y devuelve un número aleatorio entre
   * 1 y 10
   */
  public static void main(String[] args) {
    IntSupplier i = () -> (int) (Math.random() * 10 + 1);
    System.out.println(i.getAsInt());
  }
}
