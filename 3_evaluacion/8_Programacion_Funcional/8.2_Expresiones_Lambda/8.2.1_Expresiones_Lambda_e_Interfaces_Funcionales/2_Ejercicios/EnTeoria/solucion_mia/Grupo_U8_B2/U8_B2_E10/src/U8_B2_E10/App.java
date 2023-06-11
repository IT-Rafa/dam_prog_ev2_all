package U8_B2_E10;

import java.util.function.Predicate;

/**
 * Clase con ejecutable de Ejercicio U8_B2_E10<p>
 */
public class App {

  /**
   * Ejecutable Ejercicio U8_B2_E10<p>
   */
  public static void main(String[] args) {
    String[] listaPalabras = { "hola", "adios", "zorros", "pimiento" };
    // Array debe ser de Integer, no se puede usar int[]
    Integer[] listaNumeros = { 3, 4, -5, 6, -7 };

    // GENERICO con String
    System.out.println("Imprimir palabras de más de 5 car:");
    // Creamos predicado de numeros superiores a
    Predicate<String> predicado = s -> s.length() > 5;
    eval(listaPalabras, predicado);

    // GENERICO con Integer
    System.out.println("Imprimir numeros positivos: ");
    // Pasamos predicado de numeros superiores a 0
    eval(listaNumeros, i -> i > 0);
  }

  /**
   * Recibe una array de un tipo genérico y un Predicate genérico<p>
   * Pasa por cada elemento del array y lo analiza con el
   * Predicate. Si la valoración es True, muesta el contenido en
   * consola.
   */
  private static <T> void eval(T[] lista, Predicate<T> predicado) {
    for (T e : lista) {
      if (predicado.test(e)) {
        System.out.println(e + " ");
      }
    }
  }
}
