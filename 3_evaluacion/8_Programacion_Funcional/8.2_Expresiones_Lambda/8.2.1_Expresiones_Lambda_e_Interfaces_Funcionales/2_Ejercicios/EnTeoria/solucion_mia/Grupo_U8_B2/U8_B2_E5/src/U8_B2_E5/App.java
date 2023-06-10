package U8_B2_E5;

import java.util.function.IntSupplier;

/**
 * Clase con ejecutable de Ejercicio U8_B2_E5<p>
 */
public class App {

  /**
   * Ejecutable Ejercicio U8_B2_E5<p>
   * Creamos el elemento myIntSupplier, que implementa
   * IntSupplier,
   * y ejecutamos su método getAsInt sobreescrito
   */
  public static void main(String[] args) {
    myIntSupplier mis = new myIntSupplier();
    System.out.println(mis.getAsInt());
  }
}

/**
 * Clase que implementa IntSupplier<p>
 * Con método getAsInt sobreescrito
 */
class myIntSupplier implements IntSupplier {

  /**
   * el getAsInt de IntSupplier debe no recibir
   * nada y devolver un entero.
   */
  @Override
  public int getAsInt() {
    return Integer.MAX_VALUE;
  }
}
