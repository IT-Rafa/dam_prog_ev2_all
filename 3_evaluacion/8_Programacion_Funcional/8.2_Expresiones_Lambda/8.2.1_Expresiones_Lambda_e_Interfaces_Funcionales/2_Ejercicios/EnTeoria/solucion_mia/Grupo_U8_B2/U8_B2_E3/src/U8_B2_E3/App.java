package U8_B2_E3;

import java.util.function.IntPredicate;

/**
 * Clase con ejecutable de Ejercicio U8_B2_E3<p>
 *
 * Creamos el método eval, que recibe un Array de enteros y
 * un Predicado, que será una función que devuelve true o false
 * según la expresión recibida y la expresión lambda que se
 * incluya.<p>
 * En este caso el Predicado, es una interfaz funcional sacada de
 * java.util.function.IntPredicate
 */
public class App {

  /**
   * Ejecutable Ejercicio U8_B2_E3<p>
   * Creamos la lista de los números decimales y mostramos el
   * título y el resultado con el método eval.
   * <p>
   * Para mostrar los números de la lista mayores que 5
   * le damos al Predicado el lambda que indica que es true
   * si el número supera el 5.
   * <p>
   * En el caso de todos los números, mostramos el lambda que
   * da true en cualquier caso.
   *
   */
  public static void main(String[] args) {
    int[] lista = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    System.out.println("Imprimir números mayores que 5:");
    eval(lista, n -> n > 5);
    System.out.println("Imprimir todos los números");
    eval(lista, n -> true);
  }

  /**
   * Método que recibe una lista de enteros y evalua cada elemento
   * según el objeto IntPredicate incluido.
   * <p>
   * Muestra los elementos que devuelvan True
   */
  public static void eval(int[] list, IntPredicate predicate) {
    //Recorre los elementos de la lista
    for (int n : list) {
      // usa el predicado para hacer la evaluación
      if (predicate.test(n)) {
        // Si devuelve true se muestra este mensaje
        System.out.println(n + " ");
      }
    }
  }
}
