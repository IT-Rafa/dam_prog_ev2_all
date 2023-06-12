package U8_B2_E4;

// Acepta un int y no devuelve nada
import java.util.function.IntConsumer;

/**
 * Clase con ejecutable de Ejercicio U8_B2_E4<p>
 */
public class App {

  /**
   * Ejecutable Ejercicio U8_B2_E4<p>
   * Creamos el elemento MiIntConsumer, que implementa IntConsumer,
   * y ejecutamos su método accept sobreescrito
   */
  public static void main(String[] args) {
    new MiIntConsumer().accept(4);
  }
}

/**
 * Clase que implementa IntConsumer<p>
 * Con método accept sobreescrito que recibe un entero y
 * devuelve void
 */
class MiIntConsumer implements IntConsumer {

  /**
   * el accept de IntConsumer debe recibir un entero y devolver void.
   */
  @Override
  public void accept(int i) {
    // Recibe entero, muestra i en salida, y devuelve el
    // resultado de println, que será void.
    System.out.println(i);
  }
}
